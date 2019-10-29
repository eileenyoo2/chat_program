package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Member extends Super{
	
	Scanner scan = new Scanner(System.in);
	String ary = null; int num, num2=0;
	boolean run = true;
	
	public void setHash() {
		
		set_map.put("id", array_id);
		set_map.put("password", array_pass);
		set_map.put("name", array_name);
		set_map.put("school_name", array_school_name);
		set_map.put("student_id", array_student_id);
		set_map.put("phone_num", array_phone_num);
	}
	
	public void setid(String id) {
		array_id.add(id);
	}
	
	public void setschool_name(String school_name) {
		array_school_name.add(school_name);
	}
	
	public void setpass(String pass) {
		array_pass.add(pass);
	}
	
	public void setname(String name) {
		array_name.add(name);
	}
	
	public void setstudent_id(String student_id) {
		array_student_id.add(student_id);
	}
	
	public void setphone_num(String phone_num) {
		array_phone_num.add(phone_num);
	}
	
	public void setData() {
		System.out.println("name:");
		ary = scan.nextLine();
		setname(ary);
		array_name.add(getname());
		
		System.out.println("id:");
		ary = scan.nextLine();
		setid(ary);
		array_id.add(getid());
		
		System.out.println("pass:");
		ary = scan.nextLine();
		setpass(ary);
		array_pass.add(getpass());
		
		System.out.println("phone_num:");
		ary = scan.nextLine();
		setphone_num(ary);
		array_phone_num.add(getphone_num());
		
		System.out.println("student_id:");
		ary = scan.nextLine();
		setstudent_id(ary);
		array_student_id.add(getstudent_id());
		
		setHash();
		System.out.println(set_map);
		
		}
}
