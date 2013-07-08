package com.test.quartz.jobs;


public class SyncWorker implements Worker{

	public void work() {
		String threadName = Thread.currentThread().getName();
		System.out.println("   " + threadName + " has began working.");
        try {
        	System.out.println("working...");
            Thread.sleep(10000); //Simulate working..
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("   " + threadName + " has completed work.");
	}
	
}
