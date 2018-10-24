package com.vivek.MultiThreading.Priority;

public class ThreadPriority extends Thread{
	public void run(){
		
		System.out.println("running thread name is :"+Thread.currentThread().getName());
		System.out.println("running thread priority is:"+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriority t1=new ThreadPriority();
		ThreadPriority t2=new ThreadPriority();
		ThreadPriority t3=new ThreadPriority();
		t1.setName("kumar");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setName("vivek");
		t2.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t3.setName("Debo");
		t3.setPriority(Thread.MIN_PRIORITY);

	}

}
