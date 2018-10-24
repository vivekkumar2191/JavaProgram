package com.vivek.StringProgram;
import java.util.*;
public class StringPalimdrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a, b="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string for check palidrom:");
		a=sc.nextLine();
		int c=a.length();
		for(int i=c-1;i>=0;i--){
			
			b=b+a.charAt(i);
			System.out.println(b);
		}
		if(a.equalsIgnoreCase(b)){
			System.out.println("String is palindrom:" + b);
		}else{
			
			System.out.println("String is not palindrom");
		}

	}

}
