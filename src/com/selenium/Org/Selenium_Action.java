package com.selenium.Org;

import java.awt.SecondaryLoop;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Action {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		driver.manage().window().maximize();
		// pageLoadTimeout
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		WebElement course_btn = driver.findElement(By.xpath("//a[text()='COURSES']"));
		// Actions object
		Actions a = new Actions(driver);
		// Build//perform
		a.moveToElement(course_btn).build().perform();
		WebElement software_btn = driver.findElement(By.xpath("//a[text()='Software Testing Training ']"));
		a.moveToElement(software_btn).build().perform();
		// Implicitlywait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement manual_btn = driver.findElement(By.linkText("Manual Testing Training"));
		a.moveToElement(manual_btn).build().perform();
		a.click(manual_btn).build().perform();
	}

}
