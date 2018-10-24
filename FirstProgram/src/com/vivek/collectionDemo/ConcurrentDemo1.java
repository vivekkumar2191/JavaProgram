package com.vivek.collectionDemo;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class ConcurrentDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap cohm=new ConcurrentHashMap();
		cohm.put(102, "vivek");
		cohm.put(102, "debo");
		cohm.put(103, "ritesh");
		cohm.put(106, "vijay");
		cohm.put(105, "divyanshu");
		System.out.println(cohm);
		cohm.remove(102);
		System.out.println(cohm);
		cohm.putIfAbsent(102, "vivek");
		System.out.println(cohm);
		cohm.putIfAbsent(103, "debo");
		System.out.println(cohm);
		cohm.putIfAbsent(108, "debo");
		System.out.println(cohm);
		cohm.remove(102,"debo");
		System.out.println(cohm);
		cohm.remove(102,"vivek");
		System.out.println(cohm);
		cohm.replace(108, "debo", "debobratpati");
		System.out.println(cohm);
		cohm.putIfAbsent(102, "vivek");
		System.out.println(cohm);
		
		
	}
	

}
