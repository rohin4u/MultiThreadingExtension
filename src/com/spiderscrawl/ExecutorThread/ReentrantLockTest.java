package com.spiderscrawl.ExecutorThread;

public class ReentrantLockTest {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread("First Thread");
		MyThread t2 = new MyThread("Second Thread");
		MyThread t3 = new MyThread("Third Thread");
		MyThread t4 = new MyThread("Fourth Thread");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		

	}

}
