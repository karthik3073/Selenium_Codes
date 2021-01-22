package com.selenium.Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Trycatch_Screenshot {

	public static void main(String[] args) throws AWTException, InterruptedException, Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthik\\eclipse-workspace\\Selenium_Class\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement google_search = driver.findElement(By.xpath("//input[@type='text']"));
		google_search.sendKeys("automation practice");

		// Robot
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		WebElement page_btn = driver.findElement(By.xpath("//span[text()='Automation Practice']"));
		page_btn.click();

		WebElement sign_btn = driver.findElement(By.xpath("//a[@class='login']"));
		sign_btn.click();

		WebElement scroll_down = driver.findElement(By.xpath("//h1[text()='Authentication']"));
		Thread.sleep(6000);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView();", scroll_down);

		WebElement id = driver.findElement(By.id("email"));
		id.sendKeys("lingaa12@gmail.com");

		WebElement passwd = driver.findElement(By.id("passwd"));
		passwd.sendKeys("karthik");

		WebElement id_btn = driver.findElement(By.id("SubmitLogin"));
		id_btn.click();

		WebElement women_btn = driver.findElement(By.xpath("//a[text()='Women']"));
		women_btn.click();

		WebElement selection_btn = driver.findElement(By.xpath("(//a[@class='img'])[1]"));
		selection_btn.click();

		// Actions
		WebElement img_btn = driver.findElement(By.xpath("//img[@title='Blouse']"));
		Actions a = new Actions(driver);
		a.moveToElement(img_btn).build().perform();

		// try catch method

		try {
			WebElement quickview22 = driver.findElement(By.xpath("quickview"));
			quickview22.click();
		} catch (Exception e) {
			System.out.println("Please check");
			e.printStackTrace();
		}

		WebElement quickview = driver.findElement(By.xpath("(//span[text()='Quick view'])[2]"));
		a.moveToElement(quickview).build().perform();
		a.click().build().perform();

		// Frame
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement pluse_icon = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		pluse_icon.click();
		Thread.sleep(1000);
		pluse_icon.click();
		Thread.sleep(1000);
		pluse_icon.click();
		Thread.sleep(2000);

		// Dropdown
		WebElement value_pass = driver.findElement(By.xpath("//select[@name='group_1']"));
		Select s = new Select(value_pass);
		s.selectByVisibleText("M");

		WebElement addtocart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		addtocart.click();

		Thread.sleep(3000);

		WebElement proceed_1 = driver.findElement(By.xpath("//span[contains(text(),'Proceed ')]"));
		proceed_1.click();

		WebElement proceed_2 = driver.findElement(By.xpath("(//span[contains(text(),'checkout')])[2]"));
		proceed_2.click();

		WebElement proceed_3 = driver.findElement(By.xpath("(//span[contains(text(),'checkout')])[2]"));
		proceed_3.click();

		WebElement terms = driver.findElement(By.xpath("//input[@name='cgv']"));
		terms.click();

		WebElement proceed_4 = driver.findElement(By.xpath("(//span[contains(text(),'Proceed ')])[2]"));
		proceed_4.click();

		WebElement payment_btn = driver.findElement(By.xpath("(//a[contains(text(),'Pay')])[1]"));
		payment_btn.click();

		WebElement confirm_btn = driver.findElement(By.xpath("//span[contains(text(),'confirm')]"));
		confirm_btn.click();

		WebElement scroll_btn = driver.findElement(By.xpath("//div[@class='box']"));
		j.executeScript("arguments[0].scrollIntoView();", scroll_btn);

		TakesScreenshot t = (TakesScreenshot) driver;
		File source = t.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\karthik\\eclipse-workspace\\Selenium_Class\\Image\\project1.png");

		FileUtils.copyFile(source, destination);

	}

}
