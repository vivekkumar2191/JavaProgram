package com.vivek.MultiThreadingProgram;

class MyThread5 extends Thread{
	
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("run method exicuted by thread:"+Thread.currentThread().getName());
		}
	}
	
}

public class UserDefindThread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread5 mt=new MyThread5();
		mt.start();
		System.out.println("main method exicuted by Thread:"+Thread.currentThread().getName());

	}

}
