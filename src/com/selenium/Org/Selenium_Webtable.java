package com.selenium.Org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.dynamic.scaffold.InstrumentedType.Frozen;

public class Selenium_Webtable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthik\\eclipse-workspace\\Selenium_Class\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

		driver.manage().window().maximize();

		// row_data
		List<WebElement> row_data = driver.findElements(By.xpath("//table//tbody/tr[2]/td"));
		System.out.println("Row_data");
		for (WebElement datas : row_data) {
			String data = datas.getText();

			System.out.println(data);

		}

		// column_data
		List<WebElement> column_datas = driver.findElements(By.xpath("//table//tbody/tr/td[1]"));
		System.out.println("Column_data");
		for (WebElement datas : column_datas) {

			String data = datas.getText();

			System.out.println(data);
		}

		// particular_data
		WebElement particular_data = driver.findElement(By.xpath("//table//tbody/tr[2]/td[2]"));
		String data = particular_data.getText();

		System.out.println(data);

		// all_datas
		List<WebElement> all_datas = driver.findElements(By.xpath("//table//tbody/tr/td"));
		System.out.println("all_datas");
		for (int i = 0; i < all_datas.size(); i++) {

			String text = all_datas.get(i).getText();

			System.out.println(text);
		}

		System.out.println("Header_data");
		List<WebElement> Header_data = driver.findElements(By.tagName("th"));

		for (int i = 0; i <= Header_data.size(); i++) {

			String headers = Header_data.get(i).getText();

			System.out.println(headers);

		}

	}

}
