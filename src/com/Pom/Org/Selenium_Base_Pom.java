package com.Pom.Org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Pom.Org.Pom2_Module;
import com.selenium.Org.Selenium_Base_class;

public class Selenium_Base_Pom extends Selenium_Base_class {

	public static void main(String[] args) throws Throwable {

		getDriver("Chrome");

		geturl("http://automationpractice.com/index.php");

//		WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
//
////		clickonelement(login);

		Pom1_Module p1 = new Pom1_Module(driver);
		clickonelement(p1.getLogin_btn());
		sleep(2000);

		Pom2_Module p2 = new Pom2_Module(driver);
		Inputvalueelement(p2.getEnter_value(), "lingaa12@gmail.com");
		Inputvalueelement(p2.getPs_enter(), "karthik");
		clickonelement(p2.getSubmit_btn());

		Pom4_Module p4 = new Pom4_Module(driver);
		Actions(p4.getT_Shirt_Btn(), "mouse");
		clickonelement(p4.getQuick_view());

//		sleep(2000);
//		Pom3_Module p3 = new Pom3_Module(driver);
//		Actions(p3.getSelect_option(), "mouse");
//		clickonelement(p3.getQuick_view());
		// sleep(2000);

		// Pom4_Module p4 = new Pom4_Module(driver);
//		Actions(p4.getClick_img(), "mouse");
//		clickonelement(p4.getQuick_view());
//		sleep(2000);

		// close();

		// lingaa12@gmail.com karthik
//		WebElement id = driver.findElement(By.id("email"));
//		Inputvalueelement(id, "lingaa12@gmail.com");
//
//		WebElement passwd = driver.findElement(By.id("passwd"));
//		Inputvalueelement(passwd, "karthik");
//
//		WebElement id_btn = driver.findElement(By.id("SubmitLogin"));
//		clickonelement(id_btn);
//
//		Navigate_refresh();
//		

//
//		Navigate_to("http://demo.automationtesting.in/Alerts.html");
//
//		WebElement button = driver.findElement(By.xpath("(//button[contains(text(),'click')])[1]"));
//		clickonelement(button);
//		sleep(2000);
//		Alert1();
//
//		sleep(2000);

//		WebElement click_5 = driver.findElement(By.xpath("(//button[contains(text(),'click')])[3]"));
//		clickonelement(click_5);
//		Alert2("karthik");

//		Navigate_to("https://www.facebook.com/");
//		sleep(2000);
//
//		WebElement search = driver.findElement(By.xpath("(//a[@role='button'])[1]"));
//		clickonelement(search);
//
//		sleep(2000);
//		WebElement day = driver.findElement(By.id("day"));
//		dropdown(day, "byindex", "2");
//
//		WebElement month = driver.findElement(By.id("month"));
//		dropdown(month, "byvisibletext", "Mar");
//
//		WebElement year = driver.findElement(By.id("year"));
//		dropdown(year, "byvalue", "1990");
//
//		Snapshot("C:\\Users\\karthik\\eclipse-workspace\\Selenium_Class\\Image\\Base.png");
		// close();

//		Navigate_to("http://demo.automationtesting.in/Frames.html");
//
//		frame("singleframe");
//
//		WebElement text_btn = driver.findElement(By.xpath("//input[@type='text']"));
//		Inputvalueelement(text_btn, "watch ev");

//		Navigate_to("https://www.google.com/");
//		WebElement Gmail_btn = driver.findElement(By.xpath("//a[text()='Gmail']"));
//		Robot(Gmail_btn);
//
//		WebElement search = driver.findElement(By.id("email"));
//		enabled(search);

	}

}
