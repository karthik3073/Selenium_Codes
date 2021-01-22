package com.selenium.Org;

public class Selenium_PojoB {

	public static void main(String[] args) {

		Selenium_PojoA po = new Selenium_PojoA();

		po.setA(17);
		int a = po.getA();

		System.out.println(a);
	}

}
