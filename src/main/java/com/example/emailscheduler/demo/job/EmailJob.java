package com.example.emailscheduler.demo.job;

import org.quartz.JobExecutionContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class EmailJob extends QuartzJobBean{
	@Override 
	protected void executeInternal(JobExecutionContext jobExecutionContext) {
		
	}
}
