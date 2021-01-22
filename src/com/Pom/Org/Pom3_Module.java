package com.Pom.Org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom3_Module {
	public static WebDriver driver;

	@FindBy(xpath = "//a[text()='Women']")
	private WebElement Select_option;

	@FindBy(xpath = "(//a[@class='img'])[1]")
	private WebElement Click_img;

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")
	private WebElement Quick_view;

	public Pom3_Module(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getClick_img() {
		return Click_img;
	}

	public WebElement getQuick_view() {
		return Quick_view;
	}

	public WebElement getSelect_option() {
		return Select_option;
	}

}
