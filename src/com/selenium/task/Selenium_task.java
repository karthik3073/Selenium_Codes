package com.selenium.task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_task {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthik\\eclipse-workspace\\Selenium_Class\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");

		WebElement enter_homepage = driver.findElement(By.xpath("(//img[@alt='continue'])[1]"));
		enter_homepage.click();
		
		Thread.sleep(2000);

		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();

	}

}
