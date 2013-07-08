package com.test.quartz.jobs;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;


public class CustomJob extends QuartzJobBean {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	private Worker worker;
	
	@Override
	protected void executeInternal(JobExecutionContext ctx)
			throws JobExecutionException {
		
		JobDataMap jobDataMap = ctx.getJobDetail().getJobDataMap();
				
		try {
			Date lastDateRun  = ctx.getPreviousFireTime();
			
			if (lastDateRun != null) {
				System.out.println("Last date run: " + sdf.format(lastDateRun));
				
				int refireCount = ctx.getRefireCount();
				
				if (refireCount > 0) {
					System.out.println("Total attempts: " + refireCount);
				}
			}
			else {
				System.out.println("Job is run for the first time");
			}
			
			System.out.println("Delegating work to worker");
			worker.work();
			
			String nextDateRun = sdf.format(ctx.getNextFireTime());
			
			System.out.println("Next date run: " + nextDateRun);

		} 
		catch (Exception e) {
			throw new JobExecutionException("Unexpected exception", e, true);
		}
	}

	/**
	 * The worker
	 * automatically inject the values
	 */ 
	public void setWorker(Worker worker) {
		this.worker = worker;
	}
}
