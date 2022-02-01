package com.bolivar2k.batch;

import org.springframework.batch.core.Job; 
import org.springframework.batch.core.JobExecution; 
import org.springframework.batch.core.JobParameters; 
import org.springframework.batch.core.launch.JobLauncher; 
import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;  

public class PruebacsvtoxmlApplication { 
	
   public static void main(String[] args) throws Exception { 
     
      String[] springConfig = { "classpath:spring/batch/jobs/jobConfig.xml" };  
      
      try {
      
	      // Creating the application context object        
	      ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);  
	      
	      // Creating the job launcher 
	      JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher"); 
	   
	      // Creating the job 
	      Job job = (Job) context.getBean("csvToXmlJob"); 
	   
	      // Executing the job
	      JobExecution execution = jobLauncher.run(job, new JobParameters());
	      
	      System.out.println("Exit Status : " + execution.getStatus());
	      
      } catch (Exception e) {
    	  e.printStackTrace();
      }
   } 
}       