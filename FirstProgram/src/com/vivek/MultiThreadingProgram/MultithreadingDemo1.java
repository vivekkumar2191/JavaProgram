package com.vivek.MultiThreadingProgram;

class MyThread1 extends Thread{
	
	public void run(){
		for(int i=0;i<10;i++){
			
			System.out.println("child thraed"+i);
			
		}
		
	}
	
}

public class MultithreadingDemo1 {
	
	public static void main(String[] args){
		
		MyThread1 mt=new MyThread1();
		//mt.run();
		mt.start();
		for(int i=0;i<10;i++){
			System.out.println("main thread"+i);
			
		}
		
	}

}
