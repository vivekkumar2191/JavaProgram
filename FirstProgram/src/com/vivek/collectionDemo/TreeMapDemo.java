package com.vivek.collectionDemo;
import java.util.*;
public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap m=new TreeMap();
		m.put(100, "aaa");
		m.put(103, "bbb");
		m.put(101, "ccc");
		m.put(104,106);
		m.put(107, null);
	   //m.put("xxx", "yyy");//java.lang.ClassCastException
		//m.put(null, "zzz");//java.lang.NullPointerException
		System.out.println(m);

	}

}
