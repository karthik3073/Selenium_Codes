package com.selenium.task;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+("\\Driver\\chromedriver.exe"));
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement amazon= driver.findElement(By.xpath("//a[text()='bestsellers']"));
		Actions a = new Actions(driver);
		a.contextClick(amazon).build().perform();
		//Robot r = new Robot();
		
		
		
		
	}

}
