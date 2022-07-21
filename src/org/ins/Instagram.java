package org.ins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ec\\Cibi\\Webdriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement linkEle = driver.findElement(By.xpath("//div[contains(text(), 'Electronics')]"));	
		Actions actions = new Actions(driver);
		actions.moveToElement(linkEle).perform();
		
		
		
		
		
	}

}
