package com.selenium.Org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Absolute_xpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthik\\eclipse-workspace\\Selenium_Class\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.amazon.in/s?k=macbook+pro+16+inch&crid=1OVZ1Q2OZ2HXW&sprefix=mac%2Caps%2C358&ref=nb_sb_ss_ts-a-p_1_3");

		driver.manage().window().maximize();
		WebElement select = driver.findElement(By.xpath(
				"//div[@id=\"search\"]/div/div[2]/div/span[3]/div[2]/div[4]/div/span/div/div/div[2]/div/div/div/span/a/div/img"));
		select.click();

		driver.close();

	}

}
