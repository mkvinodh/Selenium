package com.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vinod M\\eclipse-workspace\\Selenium23\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("vijayakumar2023");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("QAZ2022$$$");
		Thread.sleep(2000);
		driver.findElement(By.id("login")).click();
		WebElement loc = driver.findElement(By.id("location"));
		Select l = new Select(loc);
		l.selectByIndex(6);

		WebElement hot = driver.findElement(By.id("hotels"));
		Select h = new Select(hot);
		h.selectByIndex(2);

		WebElement rt = driver.findElement(By.name("room_type"));
		Select r = new Select(rt);
		r.selectByVisibleText("Double");

		WebElement rn = driver.findElement(By.id("room_nos"));
		Select n = new Select(rn);
		n.selectByValue("5");

		WebElement dt = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		dt.clear();
		dt.sendKeys("29/02/2050");

		WebElement co = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		co.clear();
		co.sendKeys("15/10/2060");

		WebElement ad = driver.findElement(By.id("adult_room"));
		Select a = new Select(ad);
		a.selectByValue("2");

		WebElement ch = driver.findElement(By.id("child_room"));
		Select c = new Select(ch);
		c.selectByValue("2");
		Thread.sleep(2000);

		driver.findElement(By.id("Submit")).click();
		
	}

}
