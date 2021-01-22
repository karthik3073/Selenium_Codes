package com.selenium.Org;

import java.awt.AWTException;
import java.awt.Frame;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Base_class {

	public static WebDriver driver;

	public static WebDriver getDriver(String browser) {

		try {
			if (browser.equalsIgnoreCase("chrome")) {

				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));
				driver = new ChromeDriver();
			}

			else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + ("\\Driver\\IEDriverServer.exe"));
				driver = new InternetExplorerDriver();
			} else if (browser.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + ("\\Driver\\geckodriver.exe"));
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	// click
	public static void clickonelement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// geturl
	public static void geturl(String url) {
		driver.get(url);
	}

	// Sendkey
	public static void Inputvalueelement(WebElement element, String value) {
		element.sendKeys(value);

	}

	// close
	public static void close() {
		driver.close();

	}

	// Thread.sleep
	public static void sleep(int seconds) throws Throwable {
		Thread.sleep(seconds);

	}

	// Refresh
	public static void Navigate_refresh() {
		driver.navigate().refresh();

	}

	// to
	public static void Navigate_to(String url) {
		driver.navigate().to(url);

	}

	// Alert1
	public static void Alert1() {
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();

	}

	// Alert2
	public static void Alert2(String value1) {
		Alert value = driver.switchTo().alert();
		value.sendKeys(value1);
	}

	// Dropdown
	public static void dropdown(WebElement element, String type, String value) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("byindex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		}

		else if (type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(value);
		}

		else if (type.equalsIgnoreCase("byvisibletext")) {
			s.selectByVisibleText(value);

		}

	}

	// Screenshot
	public static void Snapshot(String path) throws Throwable {
		TakesScreenshot t = (TakesScreenshot) driver;
		File source = t.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);
	}

	// frame
	public static void frame(String name) {
		driver.switchTo().frame(name);
	}

	// Robot
	public static void Robot(WebElement element) throws AWTException {
		Actions a = new Actions(driver);
		a.contextClick(element).build().perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// Enabled
	public static void enabled(WebElement element) {
		boolean enabled2 = element.isEnabled();
		System.out.println(enabled2);

	}

	// Actions
	public static void Actions(WebElement element, String type) {
		Actions a = new Actions(driver);

		if (type.equalsIgnoreCase("mouse")) {
			a.moveToElement(element).build().perform();
			element.click();
		}

		else if (type.equalsIgnoreCase("double click")) {
			a.doubleClick(element).build().perform();
		} else if (type.equalsIgnoreCase("click")) {
			a.contextClick(element).build().perform();
		}

	}

}
