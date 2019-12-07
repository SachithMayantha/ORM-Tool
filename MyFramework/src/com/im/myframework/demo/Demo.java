package com.im.myframework.demo;

import com.im.myframework.CommonController;

public class Demo {
	public static void main(String args[]) {
		Student student = new Student();
		student.id = 1;
		student.name = "Nadun Liyanage";
		student.nic = "1464678904v";
		student.email = "tonadun@gmail.com";
		student.mobile = "0768294942";
		
		CommonController.insert(student);
	}
}
