package com.selenium.Org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Alret {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement click_1 = driver.findElement(By.xpath("(//button[contains(text(),'click')])[1]"));
		click_1.click();

		Thread.sleep(3000);

		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		// default content (It will back to webpage)
		driver.switchTo().defaultContent();
		System.out.println("Simple alert completed");

		WebElement click_2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		click_2.click();
		Thread.sleep(2000);

		WebElement click_3 = driver.findElement(By.xpath("(//button[contains(text(),'click')])[2]"));
		click_3.click();
		Thread.sleep(3000);
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();

		driver.switchTo().defaultContent();

		WebElement click_4 = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		click_4.click();

		WebElement click_5 = driver.findElement(By.xpath("(//button[contains(text(),'click')])[3]"));
		click_5.click();
		Thread.sleep(2000);

		Alert alert3 = driver.switchTo().alert();
		String text = alert3.getText();
		System.out.println(text);

		alert3.accept();
	}

}
