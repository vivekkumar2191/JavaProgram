package com.vivek.StringProgram;

public class NullCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s=null;
      System.out.println(s);//null
      if(s.equalsIgnoreCase("vivek")){
    	  
    	  System.out.println(s);//NullPointerException
      }
	}

}
