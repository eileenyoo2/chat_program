package test;

import static java.util.logging.Level.INFO;
import static java.util.logging.Level.WARNING;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Logger;

import com.google.gson.Gson;

public class MultiChatController implements Runnable{

    private final MultiChatUI v;

    private final MultiChatData chatData;

    private String ip = "127.0.0.1";
    private Socket socket;
    private BufferedReader inMsg = null;
    private PrintWriter outMsg = null;
    
    static MultiChatServer mc = new MultiChatServer();
   
    Gson gson = new Gson();
    Message m;

    boolean status;

    Logger logger;

    Thread thread;

    public MultiChatController(MultiChatData chatData, MultiChatUI v) {
        logger = Logger.getLogger(this.getClass().getName());

        this.chatData = chatData;
        this.v = v;
    }

   
    public void appMain() {
        chatData.addObj(v.msgOut);

        v.addButtonActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object obj = e.getSource();

                if (obj == v.exitButton) {
                    System.exit(0);
                } else if (obj == v.loginButton) {
                    v.id = v.idInput.getText();
                    v.outLabel.setText(" Login : " + v.id);
                    v.cardLayout.show(v.tab, "logout");
                    connectServer();
                } else if (obj == v.logoutButton) {
                    outMsg.println(gson.toJson(new Message(v.id, "", "", "logout")));
                    v.msgOut.setText("");
                    v.cardLayout.show(v.tab, "login");
                    outMsg.close();
                    try {
                        inMsg.close();
                        socket.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    status = false;
                } else if (obj == v.msgInput) {
                    outMsg.println(gson.toJson(new Message(v.id, "", v.msgInput.getText(), "msg")));
                    v.msgInput.setText("");
                }
            }
        });
    }

    
    public void connectServer() {
    	
        try {
            socket = new Socket(ip, 5959);
            logger.log(INFO,"[Client]Server connect!!");

            inMsg = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            outMsg = new PrintWriter(socket.getOutputStream(),true);

            m = new Message(v.id,"","","login");
            outMsg.println(gson.toJson(m));

            thread = new Thread(this);
            thread.start();
        }
        catch(Exception e) {
            logger.log(WARNING, "[MultiChatUI]connectServer() Exception error!!");
            e.printStackTrace();
        }
    }

   
    public void run() {
        String msg;

        status=true;

        while(status) {
            try{
                msg = inMsg.readLine();
                m = gson.fromJson(msg, Message.class);

                chatData.refreshData(m.getId() + ">" + m.getMsg() + "\n");

                v.msgOut.setCaretPosition(v.msgOut.getDocument().getLength());
            }
            catch(IOException e) {
                logger.log(WARNING,"[MultiChatUI] message stream finish!!");
            }
        }
        logger.info("[MultiChatUI]" + thread.getName()+ "message stream finish");
    }

}
