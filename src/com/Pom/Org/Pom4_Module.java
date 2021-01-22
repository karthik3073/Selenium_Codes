package com.Pom.Org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom4_Module {
	public static WebDriver driver;

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement T_Shirt_Btn;

	public WebElement getQuick_view() {
		return Quick_view;
	}

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
	private WebElement Quick_view;

	public Pom4_Module(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getT_Shirt_Btn() {
		return T_Shirt_Btn;
	}

}
