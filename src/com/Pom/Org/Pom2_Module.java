package com.Pom.Org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2_Module {

	public static WebDriver driver;

	@FindBy(id = "email")
	private WebElement enter_value;

	@FindBy(id = "passwd")
	private WebElement ps_enter;

	@FindBy(id = "SubmitLogin")
	private WebElement Submit_btn;

	public Pom2_Module(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement getEnter_value() {
		return enter_value;
	}

	public WebElement getPs_enter() {
		return ps_enter;
	}

	public WebElement getSubmit_btn() {
		return Submit_btn;
	}

}
