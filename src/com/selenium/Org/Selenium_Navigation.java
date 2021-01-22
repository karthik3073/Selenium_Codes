package com.selenium.Org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Navigation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthik\\eclipse-workspace\\Selenium_Class\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// maximize
		driver.manage().window().maximize();
		// title
		String title = driver.getTitle();
		System.out.println(title);
		// currenturl
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		// navigation to
		driver.navigate().to("https://www.amazon.in/");
		// navigation back
		driver.navigate().back();
		// navigation forward
		driver.navigate().forward();
		// navigation refresh
		driver.navigate().refresh();
		// navigation quit
		driver.quit();
	}

}
