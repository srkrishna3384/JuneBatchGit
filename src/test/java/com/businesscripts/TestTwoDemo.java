package com.businesscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTwoDemo {
	@Test
	public static void demo() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser Launched successfully....");
		driver.manage().window().maximize();
		System.out.println("Maximized window successfully....");
		driver.get("https://www.flipkart.com");
		System.out.println("Navigated to :"+driver.getCurrentUrl());
		
	}

}
