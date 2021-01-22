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

public class Selenium_task2222 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement Gift_cards = driver.findElement(By.xpath("//a[text()='Gift Cards']"));
		Actions a = new Actions(driver);
		Robot r = new Robot();
		a.contextClick(Gift_cards).build().perform();

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

		String Need = "Gift Cards & Vouchers Online : Buy Gift Vouchers & E Gift Cards Online in India - Amazon.in";
		String Need1 = "Amazon.in Bestsellers: The most popular items on Amazon";
		for (String id : tabs) {
			// Using if condition we can select the particular windows
			if (driver.switchTo().window(id).getTitle().equals(Need)
					|| driver.switchTo().window(id).getTitle().equals(Need1)) {
			} else {
				driver.close();
			}

		}

	}
}
