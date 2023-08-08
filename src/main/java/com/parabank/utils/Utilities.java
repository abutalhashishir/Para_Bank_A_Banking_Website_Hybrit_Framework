package com.parabank.utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class Utilities {
	
	public static final int IMPLICIT_WAIT_TIME=10;
	public static final int PAGE_LOAD_TIME=5;
	
	public static String generateUserNameWithTimeStamp() {
		
		Date date = new Date();
		String timestamp = date.toString().replace(" ","_").replace(":","_");
		return "Akib01777"+timestamp+"47";
		
	}
	public static long generateRandomNumber() {
        long min = 10000000000L; // Minimum 11-digit number
        long max = 99999999999L; // Maximum 11-digit number

        Random random = new Random();
        return random.nextLong() % (max - min + 1) + min;
    }
	
	public static String captureScreenshot(WebDriver driver,String testName) {
		
		File srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destinationScreenshotPath = System.getProperty("user.dir")+"\\Screenshots\\"+testName+".png";
		
		try {
			FileHandler.copy(srcScreenshot,new File(destinationScreenshotPath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return destinationScreenshotPath;
	}
	
	
}