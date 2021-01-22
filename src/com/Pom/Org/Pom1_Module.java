package com.Pom.Org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class Pom1_Module {

	public static WebDriver driver;

	@FindBy(xpath = "//a[@class='login']")
	private WebElement login_btn;

	public Pom1_Module(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement getLogin_btn() {
		return login_btn;
	}

}
