package com.vivek.StringProgram;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String in1=sc.nextLine();
		String[] ch=in1.split("");
		for(int i=ch.length-1;i>=0;i--){
			
			System.out.print(ch[i]);
		}
		

	}

}
