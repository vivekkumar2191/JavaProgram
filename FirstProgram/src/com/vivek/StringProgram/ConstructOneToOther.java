package com.vivek.StringProgram;

public class ConstructOneToOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      char c[]={'j','a','v','a'};
      String s1=new String(c);
      String s2=new String(s1);
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s1.equals(s2));
      System.out.println(s1==s2);
      System.out.println(s1.hashCode());
      System.out.println(s2.hashCode());
	}

}
