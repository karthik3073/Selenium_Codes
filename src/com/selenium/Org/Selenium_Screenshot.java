package com.selenium.Org;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Screenshot {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthik\\eclipse-workspace\\Selenium_Class\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		WebElement username = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		username.sendKeys("keyankarthik@gmail.com");

		WebElement login = driver.findElement(By.xpath("//input[@type='password']"));
		login.sendKeys("kkkkk");

		WebElement login_btn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		login_btn.click();
		Thread.sleep(2000);

		TakesScreenshot t = (TakesScreenshot) driver;
		File source = t.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\karthik\\eclipse-workspace\\Selenium_Class\\Image\\snap.png");

		FileUtils.copyFile(source, destination);

		driver.quit();
	}

}
