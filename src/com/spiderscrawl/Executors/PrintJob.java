package com.spiderscrawl.Executors;

public class PrintJob implements Runnable{
	
	String name;
	PrintJob(String name){
		this.name = name;
	}

	@Override
	public void run() {
		
		System.out.println(name+" ....job is started by Thread :"+Thread.currentThread()
		.getName());
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			System.out.println(name+" ...Job completed by Thread :"+Thread.currentThread()
			.getName());
		}
		
		
	}
	

}
