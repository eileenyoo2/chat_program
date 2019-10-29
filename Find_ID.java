package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Find_ID extends Super{
	
	String ary1, ary2; 
	int num2, num3=0;
	
	String find_if(String ary1, String ary2) {
		
		ArrayList<String> result = (ArrayList<String>)set_map.get("name");
		ArrayList<String> student = (ArrayList<String>)set_map.get("student_id");
		ArrayList<String> Find_id = (ArrayList<String>)set_map.get("id");
		
		if(result != null) {
			num2=0;
			for(String s : result) {		
				if(ary1.equals(s)) {
					num3 = num2;
					if((student.get(num3)).equals(ary2)) {
						return Find_id.get(num3);
					}
				}
				num2++;
				}
			}
		return "Error";
		}
	}
