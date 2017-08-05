package com.project.start;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootSeleniumHtmlunitdriverApplicationTests {

	@Test
	public void contextLoads() {
		
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
//		assertEquals("1", "1");
	}

}
