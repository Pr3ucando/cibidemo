package org.ins;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acahehotel {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ec\\Cibi\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
		Actions actions = new Actions(driver);
		actions.contextClick(Username).perform();
		 Robot robot = new Robot();
		 
		
		 
		 //r
		 
		 robot.keyPress(KeyEvent.VK_R);
		 robot.keyRelease(KeyEvent.VK_R);
		 
		 		 
		 //ee
		 
		 robot.keyPress(KeyEvent.VK_E);
		 robot.keyRelease(KeyEvent.VK_E);
		 
		 robot.keyPress(KeyEvent.VK_E);
		 robot.keyRelease(KeyEvent.VK_E);
		 
		 //t
		 robot.keyPress(KeyEvent.VK_T);
		 robot.keyRelease(KeyEvent.VK_T);
		 
				 
		 //h
		 robot.keyPress(KeyEvent.VK_H);
		 robot.keyRelease(KeyEvent.VK_H); 
		 
		 		 
		 //i
		 robot.keyPress(KeyEvent.VK_I);
		 robot.keyRelease(KeyEvent.VK_I);
		 
		 
		 //shift
		 robot.keyPress(KeyEvent.VK_TAB);
		 robot.keyRelease(KeyEvent.VK_TAB);
		 //p
		 //shift
		 robot.keyPress(KeyEvent.VK_SHIFT);
		 
		 
		 robot.keyPress(KeyEvent.VK_P);
		 robot.keyRelease(KeyEvent.VK_P);
		 Thread.sleep(4000);
		 
		 
		 robot.keyRelease(KeyEvent.VK_SHIFT);
		 
		 //r
		 robot.keyPress(KeyEvent.VK_R);
		 robot.keyRelease(KeyEvent.VK_R);
		 
		 
		 
		 //3
		 robot.keyPress(KeyEvent.VK_3);
		 robot.keyRelease(KeyEvent.VK_3);
		 
		 //tab
		 robot.keyPress(KeyEvent.VK_TAB);
		 robot.keyRelease(KeyEvent.VK_TAB);
		 Thread.sleep(4000);
		 
		 
		 robot.keyPress(KeyEvent.VK_TAB);
		 robot.keyRelease(KeyEvent.VK_TAB);
		 Thread.sleep(4000);
		 //login
		 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
	}

}
