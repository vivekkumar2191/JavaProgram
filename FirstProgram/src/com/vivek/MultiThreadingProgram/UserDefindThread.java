package com.vivek.MultiThreadingProgram;
class MyThread3 extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("child thread"+i);
		}
	}
	
}

public class UserDefindThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		MyThread3 mt=new MyThread3();
		mt.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println(mt.getName());
		Thread.currentThread().setName("vivek");
		System.out.println(Thread.currentThread().getName());

	}

}
