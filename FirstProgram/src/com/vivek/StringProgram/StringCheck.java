package com.vivek.StringProgram;

public class StringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s=new String("vivek");
      String s1=s;
      System.out.println(s);
      System.out.println(s1);
  
    	  System.out.println("string values are same:"+s.equals(s1));
    	  System.out.println(s1==s);
    	 System.out.println(s.hashCode());
    	 System.out.println(s1.hashCode()); 
    	 s1.concat("vicky");
    	 System.out.println(s1.hashCode());
    	 System.out.println(s1.equals(s));
    	 System.out.println(s1==s);
    	 System.out.println(s.hashCode());
    	 s1= s1.concat("vicky");
    	 System.out.println(s1.hashCode());
    	 System.out.println(s1.equals(s));
    	 System.out.println(s1==s);
    	 System.out.println(s.hashCode());
    
	}

}
