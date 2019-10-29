package test;

import java.util.ArrayList;

public class Confirm_Id extends Super{

	ArrayList<String> Find_id = (ArrayList<String>)set_map.get("id");
	
	int Confirm(String ary) {
		
		if(Find_id != null) {
			for(String s : Find_id) {		
				if(ary.equals(s)) {
					System.out.println("아이디가 중복됩니다.");
					return 1;
				}
			}
		}
		return 0;
	}
}
