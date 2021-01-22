package com.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_gaanasong_automation {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthik\\eclipse-workspace\\Selenium_Class\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://gaana.com/playlist/ganapathysubramanian10-ganatamilsongs");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//ul[@id='trackrow2730483']/li[3]/div/div/img"));
		search.click();

		Thread.sleep(5000);
		WebElement click_btn = driver.findElement(By.xpath("//a[@title='Play']"));
		click_btn.click();

	}

}
