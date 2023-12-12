package runner;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import config.AndroidCap;
import io.appium.java_client.android.AndroidDriver;


import java.lang.reflect.Method;

public class RunRetests {
	
	

    public static void main (String[]args) {
		  System.out.println("Hello");
	      final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

	        Runnable task = new Runnable() {
	            private int runCount = 0;

	            @Override
	            public void run() {
	                // Increment the run count
	                runCount++;
	                
	        		
	                AndroidCap android;
	                AndroidDriver driver = null;
	                
	                try {
	                	
	                	driver.findElement(By.xpath(""));
	                
	                }catch(Exception e) {
	                	android = new AndroidCap("");
	                }
	            }
	        };

	        // Schedule the task to run every 1 second
	        executorService.scheduleAtFixedRate(task, 0, 1, TimeUnit.SECONDS);
    }
}
