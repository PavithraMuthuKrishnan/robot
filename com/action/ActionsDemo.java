package com.action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Pavithra MuthuKrish\\\\eclipse-workspace\\\\Task3\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenscart.in/#/login?returnUrl=%2F");
		
		driver.navigate().to("http://greenscart.in/#/login?returnUrl=%2F");
		driver.manage().window().maximize();
		
		WebElement txtUserName = driver.findElement(By.id("loginEmailId"));
		txtUserName.sendKeys("pavithranarayanan64@gmail.com");
		
		
		WebElement txtPassword = driver.findElement(By.id("loginPassword"));
		txtPassword.sendKeys("Pavi@2022");

	
		WebElement btnLogin = driver.findElement(By.xpath("//input[@class='btnRegister form-control']"));
		btnLogin.click();
		
    
		Actions acc = new Actions(driver);
		
		Thread.sleep(5000);

		WebElement txtsearch = driver.findElement(By.xpath("//*[@id='typeahead-basic']"));
		acc.sendKeys(txtsearch, "iphone").
		pause(java.time.Duration.ofSeconds(2)).release().
		sendKeys(Keys.ENTER).perform();
		
		
		WebElement btnbuy = driver.findElement(By.xpath("(//button[@class='btn btn-warning btn-long buy buttonKart'])[1]"));
	 btnbuy.click();
	 Thread.sleep(5000);
	 
	 WebElement btnGift = driver.findElement(By.xpath("//button[text()='ADD GIFT CODE']"));
		btnGift.click();
		Thread.sleep(10000);
	
		WebElement btnPromo = driver.findElement(By.xpath("//span[text()='GRN10']"));
	 Actions actions = new Actions(driver);
	 actions.doubleClick(btnPromo).perform();

	
		WebElement txtclose = driver.findElement(By.xpath("//span[@class='px-1 close']"));
		Actions actions1 = new Actions(driver);
		actions1.contextClick(txtclose).perform();
		Thread.sleep(3000);
		

		WebElement txtRemove = driver.findElement(By.xpath("//div[contains(text(),'Remove')]"));
		Actions actions2 = new Actions(driver);
		actions2.sendKeys(txtRemove, "Remove Promo Code").
		sendKeys(Keys.ENTER).perform();
		
		
		
		

		
		
		
		
		
		
	}

}
