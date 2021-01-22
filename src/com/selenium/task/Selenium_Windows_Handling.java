package com.selenium.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Windows_Handling {

	public static void main(String[] args) throws AWTException, Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.manage().window().maximize();

		WebElement Enter_key = driver.findElement(By.xpath("//input[@name='q']"));
		Thread.sleep(2000);
		Enter_key.sendKeys("amazon.in");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement page_btn = driver.findElement(By.xpath("//span[text()='Amazon.in']"));
		page_btn.click();

		WebElement Gift_card = driver.findElement(By.xpath("//a[text()='Gift Cards']"));
		Actions a = new Actions(driver);
		a.contextClick(Gift_card).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement Best_Sellers = driver.findElement(By.linkText("Best Sellers"));
		a.contextClick(Best_Sellers).build().perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement Mobiles = driver.findElement(By.linkText("Mobiles"));
		a.contextClick(Mobiles).build().perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Set<String> tabs = driver.getWindowHandles();
		for (String single_tab : tabs) {
			String title = driver.switchTo().window(single_tab).getTitle();
			System.out.println(title);
		}

		String Need = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
//		String d = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
//		String b = "Amazon.in Bestsellers: The most popular items on Amazon";
//		String c = "Gift Cards & Vouchers Online : Buy Gift Vouchers & E Gift Cards Online in India - Amazon.in";

		for (String id : tabs) {
			if (driver.switchTo().window(id).getTitle().equals(Need)) {
				break;
//			
			}

		}
	}
}