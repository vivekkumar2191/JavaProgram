package com.vivek.collectionDemo;
import java.util.*;
import java.util.concurrent.*;
public class ConcurrentHashMapDemio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap con=new ConcurrentHashMap(5);
		con.put(109, "Mishra");
		con.put(110, "Abhay");
		con.put(111, "vishal");
		con.put(120, "Somu");
		con.put(118, "Manish");
		System.out.println(con);
		con.put(119, "Satish");
		System.out.println(con);
		
	}

}
