package com.selenium.Org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_javascript {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement page_down = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));

		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView();", page_down);

		Thread.sleep(2000);
		WebElement page_up = driver
				.findElement(By.xpath("//span[text()='Up to 60% off | Products from Indian startups']"));
		j.executeScript("arguments[0].scrollIntoView();", page_up);

		// Alternate method( mostly its usable because we need range of laptop
//		j.executeScript("window.scrollBy(0,-3000);");

	}

}
