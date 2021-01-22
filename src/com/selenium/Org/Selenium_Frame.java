package com.selenium.Org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Frame {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthik\\eclipse-workspace\\Selenium_Class\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
//		driver.manage().window().maximize();
		driver.switchTo().frame("singleframe");
		WebElement text_btn = driver.findElement(By.xpath("//input[@type='text']"));
		text_btn.sendKeys("watch ev");
		driver.switchTo().defaultContent();
		WebElement next_path = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		next_path.click();
		WebElement click_2 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(click_2);
		WebElement click_3 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(click_3);
		Thread.sleep(2000);
		WebElement click_4 = driver.findElement(By.xpath("//input[@type='text']"));
		click_4.sendKeys("karthik");
		driver.switchTo().defaultContent();
		WebElement enter_1 = driver.findElement(By.xpath("//a[text()='Video']"));
		enter_1.click();
	}

}
