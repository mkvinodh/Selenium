package com.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void Mynt() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vinod M\\eclipse-workspace\\Selenium23\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();

		Dimension ss = new Dimension(500, 500);
		driver.manage().window().setSize(ss);
		WebElement acc = driver.findElement(By.name("search_query"));

		acc.sendKeys("Java");
		WebElement sar = driver.findElement(By.id("search-icon-legacy"));

		sar.click();

	}

	public static void SetSize() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vinod M\\eclipse-workspace\\Selenium23\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();

		Dimension ss = new Dimension(500, 500);
		driver.manage().window().setSize(ss);
	}

	public static void main(String[] args) {

		SetSize();
	}

}
