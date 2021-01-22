package com.selenium.Org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Collections2;

public class Selenium_classin {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.flipkart.com/search?q=lingam&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		driver.manage().deleteAllCookies();

		List<WebElement> list_1 = driver
				.findElements(By.xpath("//div[@class='_30jeq3']//following_sibling::div[@class='_3I9_wc']"));

		List<Integer> li = new ArrayList<Integer>();

		for (WebElement Full_list : list_1) {
			String value_replace = Full_list.getText().substring(1).replace("", "");
			int changed_value = Integer.parseInt(value_replace);

			li.add(changed_value);
		}
		int size = li.size();
		System.err.println("Size is:" + size);
		System.out.println("maximum is:" + Collections.max(li));

	}

}
