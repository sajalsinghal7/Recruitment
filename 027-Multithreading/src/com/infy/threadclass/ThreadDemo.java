package com.infy.threadclass;
// Creating thread class by extending Thread class
class MyThread extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getName() + " is executing.");
			System.out.println("The value of i = " + i);
		}
	}
}

public class ThreadDemo {
	public static void main(String args[]) {
		MyThread t1 = new MyThread();
		t1.start();
		MyThread t2 = new MyThread();
		t2.start();
	}
}