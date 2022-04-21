package com.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationDemo {
	public static void main(String[] args){
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavithra MuthuKrish\\eclipse-workspace\\Task3\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    WebElement btnSign = driver.findElement(By.xpath("//a[@href='#Textbox']"));
	    btnSign.click();
	    
	    WebElement promptBox = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	    promptBox.click();	
	    
	   
	    Alert al = driver.switchTo().alert();
	    al.sendKeys("Pavithra");
	    al.accept();
   	    
	    WebElement txtPrint = driver.findElement(By.xpath("//p[@id='demo1']"));
    	String text = txtPrint.getText();
	    System.out.println(text);
	   
	   
	    
	
	

	
	

	
	}
}

