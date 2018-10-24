package com.vivek.MultiThreading;

public class MyThreadPrint implements Runnable {
static int num=1;
int rem;
public int print_number_upto=10;
static Object obj=new Object();




public MyThreadPrint(int rem) {

	this.rem = rem;

}




@Override
	
	public void run() {
		// TODO Auto-generated method stub
	while(num<print_number_upto){
		synchronized(obj){
		while(num%3!=rem){
			try {
				obj.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" "+num);
		num++;
		obj.notifyAll();
		}
	}
		
		
	}

}
