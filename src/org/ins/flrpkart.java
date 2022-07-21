package org.ins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flrpkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ec\\Cibi\\Webdriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement btnclose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnclose.click();
		 
		Thread.sleep(3000);
		WebElement linkEle = driver.findElement(By.xpath("//div[contains(text(), 'Electronics')]"));	
		Actions actions = new Actions(driver);
		actions.moveToElement(linkEle).perform();
	
		
		Thread.sleep(4000);
		WebElement lnkLap = driver.findElement(By.xpath("//a[text()='Laptop and Desktop']"));
		
		actions.moveToElement(lnkLap).perform();
		Thread.sleep(4000);
	
		WebElement lnkDesk = driver.findElement(By.xpath("//a[text()='Laptops']"));
		lnkDesk.click();
		
		Thread.sleep(4000);
		WebElement txtclick = driver.findElement(By.xpath("//span[@='z3ht-w']"));
		String text = txtclick.getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		//driver.findElement(By.xpath(null))
		
		
	}

}
