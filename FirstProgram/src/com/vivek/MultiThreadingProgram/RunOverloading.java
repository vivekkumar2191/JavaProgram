package com.vivek.MultiThreadingProgram;
class MyThread2 extends Thread{
	public void run(){
		System.out.println("no -arg run");
	}
	public void run(int i){
		System.out.println("int-arg run");
	}
	
}

public class RunOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 mt2=new MyThread2();
	     //mt2.run();
		mt2.start();
	System.out.println("main thread run");
	mt2.run(10);
	System.out.println("int-arg run1");
	}

}
