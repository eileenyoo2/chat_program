package test;

import java.util.ArrayList;

public class Login extends Super{

	String ary1, ary2; int num1, num2=-1;
	
	int login(String ary1, String ary2, String ary3) {
		
		ArrayList<String> login_school = (ArrayList<String>)set_map.get("school_name");
		ArrayList<String> login_id = (ArrayList<String>)set_map.get("id");
		ArrayList<String> login_pass = (ArrayList<String>)set_map.get("password");
		
		if(login_id != null) {
			num2=-1;
			for(String s : login_id) {
				num2++;
				if(ary1.equals(s)) {
					num1 = num2;
					if((login_pass.get(num1)).equals(ary2)) {
						if(login_school.get(num1).equals(ary3)) {
							return 1;
						}
						else {
							return 4;
							//�б����� ���� ����
						}
						
					}
					else {
						return 2;
					}
				}
				else {
					return 3;
					}
				}
			}
		return 0;
		}
	}
