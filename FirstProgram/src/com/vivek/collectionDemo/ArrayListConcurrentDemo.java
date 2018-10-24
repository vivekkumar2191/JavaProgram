package com.vivek.collectionDemo;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcurrentDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
    ArrayList ar=new ArrayList();
    ar.add("ab");
    ar.add("bc");
    ar.add("cd");
    ar.add("de");
    System.out.println(ar);
    Iterator itr=ar.iterator();
    while(itr.hasNext()){
    	String s=(String)itr.next();
    	System.out.println(s);
    	//ar.add("ef");// java.util.ConcurrentModificationException
    	
    	
    }
    
	}

}
