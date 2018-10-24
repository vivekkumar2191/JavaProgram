package com.viv.NumberProgram;
import java.io.*;
import java.util.*;

public class PrimeNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers:");
		 int n=sc.nextInt();
		 if(isPrime(n)){
			 System.out.println("number is prime");
		 }else{
			 System.out.println("number is not a Prime number ");
		 }

	}
	public static boolean isPrime(int n){
		if(n<1){
			System.out.println("Number is not Prime");
			return false;
		}
		for(int i=2;i<Math.sqrt(n);i++){
			if(n%i==0){
				System.out.println("number is not Prime ");
				return false;
			}
		}
		return true;
	}

}
