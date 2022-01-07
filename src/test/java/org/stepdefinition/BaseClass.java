package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	
	public static void launchUrl(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM SARATH KUMAR\\eclipse-workspace\\CucumberLearnAfternoon\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get(url);
	}
	
	public static WebElement locators(String locators, String value) {
		
		if(locators.equalsIgnoreCase("id")) {
			WebElement element = driver.findElement(By.id(value));
			return element;
		}
		else if(locators.equalsIgnoreCase("name")) {
			WebElement element = driver.findElement(By.name(value));
			return element;
		}
		
		else {
			WebElement element = driver.findElement(By.xpath(value));
			return element;
		}
	}
	
	public static void enterText(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public static void buttonClick(WebElement element) {
		element.click();
	}
	
}
