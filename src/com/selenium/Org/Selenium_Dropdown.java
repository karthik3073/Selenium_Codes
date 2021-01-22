package com.selenium.Org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Dropdown {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthik\\eclipse-workspace\\Selenium_Class\\Driver\\chromedriver.exe");

		// This program will select the dropdown box
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.xpath("(//a[@role='button'])[1]"));
		search.click();

		Thread.sleep(2000);

		// selectByValue
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("26");

		// selectByVisibleText
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("Jul");

		// selectByIndex
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByIndex(29);
	}

}
