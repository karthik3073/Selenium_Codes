package com.selenium.Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Tag {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthik\\eclipse-workspace\\Selenium_Class\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();

		WebElement id = driver.findElement(By.id("email"));
		id.sendKeys("lingaa12@gmail.com");

		WebElement passwd = driver.findElement(By.id("passwd"));
		passwd.sendKeys("karthik");

		WebElement id_btn = driver.findElement(By.id("SubmitLogin"));
		id_btn.click();

		WebElement Tshirts_btn = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
		Tshirts_btn.click();

//		// Using Action key
//		WebElement image = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
//		WebElement quick_view = driver.findElement(By.xpath("//a[@class='quick-view']"));
//		Actions a = new Actions(driver);
//		a.moveToElement(image).build().perform();
//		a.moveToElement(quick_view).build().perform();
//		a.click(quick_view).build().perform();
//
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement quickview_btn = driver.findElement(By.xpath("//div[@id='center_column']/ul/li/div/div/div/a/img"));
		quickview_btn.click();

//		WebElement frame_btn = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(0);
		System.out.println("done");
		WebElement quantity_wanted = driver.findElement(By.id("quantity_wanted"));
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		quantity_wanted.clear();
		quantity_wanted.sendKeys("6");

		Thread.sleep(2000);
		WebElement day = driver.findElement(By.name("group_1"));
		Select s = new Select(day);
		s.selectByVisibleText("M");

		WebElement color_btn = driver.findElement(By.id("color_14"));
		color_btn.click();

		WebElement Submit_btn = driver.findElement(By.name("Submit"));
		Submit_btn.click();

		Thread.sleep(3000);
		WebElement proceed_btn = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceed_btn.click();

		WebElement proceed_btn1 = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		proceed_btn1.click();

		WebElement message_btn = driver.findElement(By.name("message"));
		message_btn.sendKeys("This is selenium");

		WebElement proceed_1 = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		proceed_1.click();

		WebElement click_btn = driver.findElement(By.name("cgv"));
		click_btn.click();

		WebElement name = driver.findElement(By.name("processCarrier"));
		name.click();

		WebElement name_1 = driver.findElement(By.xpath("(//span[text()='(order processing will be longer)'])[1]"));
		name_1.click();

		WebElement name_2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		name_2.click();

		WebElement scrolldown = driver.findElement(By.xpath("//div[@class='box']"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView();", scrolldown);

		WebElement Back_btn = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		Back_btn.click();

		WebElement account_btn = driver.findElement(By.xpath("(//i[@class='icon-chevron-left'])[1]"));
		account_btn.click();

		WebElement dresses_btn = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		dresses_btn.click();

//		WebElement next_btn = driver.findElement(By.xpath("(//a[@title='Printed Dress'])[2]"));
//		next_btn.click();

		WebElement img_btn = driver.findElement(By.xpath("(//img[@title='Printed Dress'])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(img_btn).build().perform();

		WebElement quickview = driver.findElement(By.xpath("//span[text()='Quick view']"));
		a.moveToElement(quickview).build().perform();
		a.click(quickview).build().perform();

//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		System.out.println("done1");
		WebElement icon_plus = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		Thread.sleep(2000);
		icon_plus.click();
		icon_plus.click();
		icon_plus.click();

		Thread.sleep(2000);
		System.out.println("=====");
		WebElement size_btn = driver.findElement(By.name("group_1"));
		Select s1 = new Select(size_btn);
		s1.selectByVisibleText("M");

		WebElement addtocart_1 = driver.findElement(By.xpath("//button[@name='Submit']"));
		addtocart_1.click();

		Thread.sleep(2000);
		WebElement select_btn = driver.findElement(By.xpath("//a[@title='Close']"));
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();

	}

}
