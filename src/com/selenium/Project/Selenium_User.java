package com.selenium.Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_User {

	private static WebElement findElement;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		Thread.sleep(4000);

		driver.manage().window().maximize();

		WebElement login_in = driver.findElement(By.xpath("//a[@class='login']"));
		login_in.click();

		WebElement Email_id = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		Email_id.sendKeys("lingaa1123212@gmail.com");

		WebElement click_btn = driver.findElement(By.xpath("//i[@class='icon-user left']"));
		click_btn.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement radio_btn = driver.findElement(By.name("id_gender"));
		radio_btn.click();

//		boolean enabled = radio_btn.isEnabled();

		WebElement first_name = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		first_name.sendKeys("karthik");

		WebElement last_name = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		last_name.sendKeys("v");

		WebElement password_btn = driver.findElement(By.xpath("//input[@type='password']"));
		password_btn.sendKeys("karthik");

		WebElement days = driver.findElement(By.id("days"));
		Select s = new Select(days);
		s.selectByIndex(29);

//		Thread.sleep(2000);

		WebElement months = driver.findElement(By.id("months"));
		Select s1 = new Select(months);
		s1.selectByVisibleText("July ");

		WebElement years = driver.findElement(By.id("years"));
		Select s2 = new Select(years);
		s2.selectByValue("2020");

		WebElement text_word = driver.findElement(By.xpath("//label[text()='Sign up for our newsletter!']"));
		text_word.click();

		WebElement id_name = driver.findElement(By.id("lastname"));
		id_name.sendKeys("keyan");

		WebElement company_btn = driver.findElement(By.id("company"));
		company_btn.sendKeys("Accenture");

		WebElement address = driver.findElement(By.id("address1"));
		address.sendKeys("No:10 avadi chennai: oooooo, Accenture");

		WebElement address2 = driver.findElement(By.id("address2"));
		address2.sendKeys("DLF");

		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("chennai");

		WebElement id_state = driver.findElement(By.id("id_state"));
		Select s3 = new Select(id_state);
		s3.selectByVisibleText("California");

		WebElement postcode = driver.findElement(By.id("postcode"));
		postcode.sendKeys("00000");

		WebElement id_country = driver.findElement(By.id("id_country"));
		Select s4 = new Select(id_country);
		s4.selectByVisibleText("United States");

//		Thread.sleep(2000);

		WebElement other = driver.findElement(By.id("other"));
		other.sendKeys("9994451666");

		WebElement phone = driver.findElement(By.id("phone"));
		phone.sendKeys("9012345611");

		WebElement phone_mobile = driver.findElement(By.id("phone_mobile"));
		phone_mobile.sendKeys("9994455111");

		WebElement alias = driver.findElement(By.id("alias"));
		alias.sendKeys("Avadi");

//		Thread.sleep(2000);

		WebElement register_btn = driver.findElement(By.xpath("//span[text()='Register']"));
		register_btn.click();

//		WebElement down_btn = driver.findElement(By.xpath("//i[@class='icon-chevron-left']"));
//		JavascriptExecutor j= (JavascriptExecutor) driver;
//		j.executeScript("arguments[0].scrollIntoView();", down_btn);

		WebElement signout = driver.findElement(By.xpath("//a[@class='logout']"));
		signout.click();

		WebElement email_id = driver.findElement(By.id("email"));
		email_id.sendKeys("lingaaaaa12@gmail.com");

		WebElement passwd_btn = driver.findElement(By.id("passwd"));
		passwd_btn.sendKeys("karthik");

		WebElement SubmitLogin = driver.findElement(By.id("SubmitLogin"));
		SubmitLogin.click();

	}

}
