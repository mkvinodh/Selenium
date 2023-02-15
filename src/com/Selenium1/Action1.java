package com.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 { 
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vinod M\\eclipse-workspace\\Selenium23\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		Actions ac = new Actions(driver);
		
		WebElement myn = driver.findElement(By.xpath("(//a[@data-type='navElements'])[3]"));
		
		ac.moveToElement(myn).build().perform();
	}

}
