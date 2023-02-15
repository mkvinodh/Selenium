package com.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vinod M\\eclipse-workspace\\Selenium23\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		// driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		// WebElement dc = driver.findElement(By.xpath("//button[text()='Double Click
		// Me']"));

		Actions ac = new Actions(driver);

		// ac.doubleClick(dc).build().perform();

		WebElement mo = driver.findElement(By.xpath("//a[text()='Mobiles']"));

		ac.contextClick(mo).build().perform();

	}

}
