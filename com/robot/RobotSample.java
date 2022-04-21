package com.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotSample {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavithra MuthuKrish\\eclipse-workspace\\Task3\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://adactinhotelapp.com/");
		    driver.manage().window().maximize();
		    
		    Robot robot = new Robot();
		    
		    robot.keyPress(KeyEvent.VK_TAB);
		    robot.keyRelease(KeyEvent.VK_TAB);
		    
		    robot.keyPress(KeyEvent.VK_TAB);
		    robot.keyRelease(KeyEvent.VK_TAB);
		    
		    robot.keyPress(KeyEvent.VK_TAB);
		    robot.keyRelease(KeyEvent.VK_TAB);
		    
		    robot.keyPress(KeyEvent.VK_SHIFT);
		  
		    robot.keyPress(KeyEvent.VK_P);
		    robot.keyRelease(KeyEvent.VK_P);
		    

		    robot.keyPress(KeyEvent.VK_A);
		    robot.keyRelease(KeyEvent.VK_A);
		   
		    
		    robot.keyPress(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_V);
		   
		    robot.keyPress(KeyEvent.VK_I);
		    robot.keyRelease(KeyEvent.VK_I);
		    
		    robot.keyPress(KeyEvent.VK_SPACE);
		    robot.keyRelease(KeyEvent.VK_SPACE);
		    
		    robot.keyPress(KeyEvent.VK_K);
		    robot.keyRelease(KeyEvent.VK_K);
		    
		    robot.keyPress(KeyEvent.VK_R);
		    robot.keyRelease(KeyEvent.VK_R);
		    
		    robot.keyPress(KeyEvent.VK_I);
		    robot.keyRelease(KeyEvent.VK_I);
		    
		    robot.keyPress(KeyEvent.VK_S);
		    robot.keyRelease(KeyEvent.VK_S);
		    
		    robot.keyPress(KeyEvent.VK_H);
		    robot.keyRelease(KeyEvent.VK_H);
		    
		    robot.keyPress(KeyEvent.VK_N);
		    robot.keyRelease(KeyEvent.VK_N);
		    
		    robot.keyPress(KeyEvent.VK_A);
		    robot.keyRelease(KeyEvent.VK_A);
		    
		    robot.keyPress(KeyEvent.VK_N);
		    robot.keyRelease(KeyEvent.VK_N);
		    
		    robot.keyRelease(KeyEvent.VK_SHIFT);

		    
		    robot.keyPress(KeyEvent.VK_TAB);
		    robot.keyRelease(KeyEvent.VK_TAB);
		    
		    robot.keyPress(KeyEvent.VK_6);
		    robot.keyRelease(KeyEvent.VK_6);
		    
		    robot.keyPress(KeyEvent.VK_7);
		    robot.keyRelease(KeyEvent.VK_7);
		    
		    robot.keyPress(KeyEvent.VK_4);
		    robot.keyRelease(KeyEvent.VK_4);
		    
		    robot.keyPress(KeyEvent.VK_8);
		    robot.keyRelease(KeyEvent.VK_8);
		    
		    robot.keyPress(KeyEvent.VK_TAB);
		    robot.keyRelease(KeyEvent.VK_TAB);
		   
		    robot.keyPress(KeyEvent.VK_TAB);
		    robot.keyRelease(KeyEvent.VK_TAB);
		    
		    Thread.sleep(7000);
		    
		    
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);
		   
		   
		    
		    
		    
		    
		   
		    
		   
		    
		    
		    
		    
		
		    
}


	
}

