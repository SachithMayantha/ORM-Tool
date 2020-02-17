package com.im.myframework;

import java.lang.reflect.Field;

public class CommonController {
	public static String insert(Object obj) {
		Class c = obj.getClass();
		String name = c.getSimpleName().toLowerCase();
		
		String names = "";
		String values = "";
		
		Field[] fields = c.getFields();
		for(Field field:fields) {
			String fname = field.getName();
			names += fname+",";
			try {
				Object value = field.get(obj);
				values += "'"+value.toString();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		names = names.substring(0,names.length()-1);
		values = values.substring(0,values.length()-1);
		
		String sql = "INSERT INTO "+name+" ("+names+") VALUES ("+values+")";
		
		System.out.println(sql);
		return sql;
	}
	
}
