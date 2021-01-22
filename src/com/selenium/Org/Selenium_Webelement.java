package com.selenium.Org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Webelement {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthik\\eclipse-workspace\\Selenium_Class\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.id("email"));
		// isEnabled(whether an element is editable or clickable)
		boolean enabled = search.isEnabled();
		System.out.println(enabled);
		// sendkeys
		search.sendKeys("kkkk");
		// clear
		search.clear();
		search.sendKeys("keyankarthik3073@gmail.com");
		// getAttribute
		String attribute = search.getAttribute("value");
		System.out.println(attribute);

		String attribute2 = search.getAttribute("id");
		System.out.println(attribute2);
		// isDisplayed
		boolean displayed = search.isDisplayed();
		System.out.println(displayed);
		// getText
		WebElement enterkey = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		String text = enterkey.getText();
		System.out.println(text);
		// click
		WebElement click_btn = driver.findElement(By.xpath("(//a[@role='button'])[1]"));
		click_btn.click();

		Thread.sleep(2000);
		// click
		WebElement radio_btn = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		radio_btn.click();
		// isSelected
		boolean option = radio_btn.isSelected();
		System.out.println(option);

	}
}
