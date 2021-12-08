package com.spiderscrawl.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcutorDemo {

	public static void main(String[] args) {
		
		PrintJob[] jobs = {
				
							new PrintJob("Pune"),
							new PrintJob("Delhi"),
							new PrintJob("Patna"),
							new PrintJob("Shimla"),
							new PrintJob("Kolkata"),
							new PrintJob("Kashmir")
				
							};
		
		ExecutorService service  = Executors.newFixedThreadPool(3);
		
		for(PrintJob job : jobs) {
			service.submit(job);
		}
		service.shutdown();
		
		
		

	}

}
