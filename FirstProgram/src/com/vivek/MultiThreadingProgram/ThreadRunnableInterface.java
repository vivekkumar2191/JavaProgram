package com.vivek.MultiThreadingProgram;
class MyThread6 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println("child thread"+i);
		} 
	}
	
	
	
}

public class ThreadRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread6 mt=new MyThread6();
		Thread t=new Thread(mt);
		t.start();
		// t.run();
		for(int i=0;i<10;i++){
			System.out.println("main thread"+i);
			
		}

	}

}
