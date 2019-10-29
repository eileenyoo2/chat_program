package test;

import java.io.*;
import java.net.*;
import java.util.*;
import com.google.gson.*;
import java.util.logging.*;

public class MultiChatServer {

	private ServerSocket  ss= null;
	private Socket s= null;
	//int num = (int)((Math.random()*500)+5000);
	
	ArrayList<ChatThread> chatThreads = new ArrayList<ChatThread>();

    Logger logger;
 
	public void start() {
        logger = Logger.getLogger(this.getClass().getName());
		try {
			ss = new ServerSocket(5959);
			logger.info("MultiChatServer start");
			
			while(true) {
				s=ss.accept();
				ChatThread chat = new ChatThread();
				chatThreads.add(chat);
				chat.start();
			}
		} catch (Exception e) {
			logger.info("[MultiChatServer]start() Exception error!!");
            e.printStackTrace();
		}  
	} 

	void msgSendAll(String msg) {
		for(ChatThread ct : chatThreads) {
			ct.outMsg.println(msg);
		}
	}

	class ChatThread extends Thread {
		String msg;

		Message m = new Message();

		Gson gson = new Gson();

		private BufferedReader inMsg = null;
		private PrintWriter outMsg = null;

		public void run() {
		
			boolean status = true;
			logger.info("ChatThread start...");

			try {
				inMsg = new BufferedReader(new InputStreamReader(s.getInputStream()));
				outMsg = new PrintWriter(s.getOutputStream(),true);
				
				while(status) {
					msg = inMsg.readLine();
					
					m = gson.fromJson(msg,Message.class);
												
					if(m.getType().equals("logout")) {
						chatThreads.remove(this);
						msgSendAll(gson.toJson(new Message(m.getId(),"","aaa","server")));
						status = false;
					}
					else if(m.getType().equals("login")) {
						msgSendAll(gson.toJson(new Message(m.getId(),"","bbb","server")));
					}
					else {
						msgSendAll(msg);
					}
				}
				this.interrupt();
				logger.info(this.getName() + " ccc!!");
			} catch (IOException e) {
				chatThreads.remove(this);
				logger.info("[ChatThread]run() IOException error!!");
                e.printStackTrace();
			}
		}
	}

}
