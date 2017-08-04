package com.project.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Test {

	public static void main(String[] args) {
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("http://localhost:8087/test");
		System.out.println("Driver: "+driver.getTitle());
		WebElement usernameInput = driver.findElement(By.id("username"));

		usernameInput.sendKeys("test-user");

		WebElement passwordInput = driver.findElement(By.id("password"));

		passwordInput.sendKeys("123456");

		WebElement loginButton = driver.findElement(By.id("login"));

		loginButton.click();
		System.out.println("Successful....");
		driver.quit();
	}
}
