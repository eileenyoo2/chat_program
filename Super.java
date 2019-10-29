package test;

import java.util.ArrayList;
import java.util.HashMap;

abstract class Super {

	ArrayList<String> array_id = new ArrayList<String>();
	ArrayList<String> array_pass = new ArrayList<String>();
	ArrayList<String> array_name = new ArrayList<String>();
	ArrayList<String> array_student_id = new ArrayList<String>();
	ArrayList<String> array_phone_num = new ArrayList<String>();
	ArrayList<String> array_school_name = new ArrayList<String>();
	
	static HashMap<String, ArrayList<String>> set_map= new HashMap<String, ArrayList<String>>();
	
	private String name, pass, id, phone_num, student_id;
	
	void setname(String name) {
		this.name = name;
	}
	
	String getname() {
		return name;
	}
	
	void setid(String id) {
		this.id = id;
	}
	
	String getid() {
		return id;
	}
	
	void setpass(String pass) {
		this.pass = pass;
	}
	
	String getpass() {
		return pass;
	}
	
	void setphone_num(String phone_num) {
		this.phone_num = phone_num;
	}
	
	String getphone_num() {
		return phone_num;
	}
	
	void setstudent_id(String student_id) {
		this.student_id = student_id;
	}
	
	String getstudent_id() {
		return student_id;
	}
	
}
