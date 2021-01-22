package com.selenium.Org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_DynamicXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/walle");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> list = driver.findElements(
				By.xpath("//span[@class='product-discountedPrice']//following-sibling::span[@class='product-strike']"));
		List<Integer> li = new ArrayList<Integer>();

		for (WebElement price_list : list) {
			String rate = price_list.getText().replace("Rs. ", "");
			int values = Integer.parseInt(rate);
			System.out.println(values);
			li.add(values);
		}
		int size = li.size();

		System.out.println("Size is:" + size);
		System.out.println("Maximum value:" + Collections.max(li));

	}

}
