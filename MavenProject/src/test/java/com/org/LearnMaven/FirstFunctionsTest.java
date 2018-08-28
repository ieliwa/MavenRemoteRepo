package com.org.LearnMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstFunctionsTest {

	@Test
	public void Test1(){
		System.out.println("Test scenario 1");
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.hotmail.com");
	}
	
}
