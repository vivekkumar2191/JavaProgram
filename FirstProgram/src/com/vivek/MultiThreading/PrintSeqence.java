//You are givien 3 threads.You need to print sequence using these 3 threads.You need to print in natural order
//up to max.
//Example:T1 1
//T2 2
//T3 3
//T1 4
//T2 5
//T3 6
//T1 7
//T2 8
//T3 9
//T1 10
package com.vivek.MultiThreading;

public class PrintSeqence {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		MyThreadPrint m1=new MyThreadPrint(1);
		MyThreadPrint m2=new MyThreadPrint(2);
		MyThreadPrint m3=new MyThreadPrint(0);
		
		Thread t1=new Thread(m1,"T1");
		Thread t2=new Thread(m2,"T2");
		Thread t3=new Thread(m3,"T3");
		t1.start();
		t2.start();
		t3.start();
	}

}
