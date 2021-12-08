package com.spiderscrawl.ExecutorThread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
	
	static ReentrantLock l = new ReentrantLock();
	
	MyThread(String name){
		super(name);
	}
	@Override
	public void run() {
		
		do {
			try {
				if(l.tryLock(5000, TimeUnit.MILLISECONDS))
				{
					System.out.println(Thread.currentThread().getName()+"....get lock");
					Thread.sleep(15000);
					l.unlock();
					System.out.println(Thread.currentThread().getName()+"....releases lock");
					break;
				}
				else {
					System.out.println(Thread.currentThread().getName()+" unable to get lock will try again");
				}
			
			}catch(Exception e) {
				
			}
			
		}while(true);
	}

}
