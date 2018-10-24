package com.vivek.StringProgram;

import java.util.List;

public class StringReverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java Program";
//		System.out.println(str);

		char ch[] = str.toCharArray();
		int len = ch.length;
		for(int i=0;i<len/2;i++)
		{
			char temp = ch[i];
			ch[i] = ch[len-i-1];
			ch[len-i-1] = temp;
		}

		str = new String(ch);
		System.out.println(str);

		StringBuffer str1 = new StringBuffer(str);
		str1 = str1.reverse();
		str = new String(str1);
		System.out.println(str);

		char ch1 ;
		len=0;
		try{
			while (true){
				ch1 = str.charAt(len);
				len++;
			}
		}
		catch(Exception ex)
		{
			System.out.println("Length is="+len);

		}
		System.out.println("Length is="+len);
		
		
	}

}
