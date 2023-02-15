package com.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fkart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vinod M\\eclipse-workspace\\Selenium23\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		String url = driver.getCurrentUrl();
		System.out.println("FB URL is " + url);
		Thread.sleep(2000);

		System.out.println("=========================");

		driver.navigate().to("https://www.youtube.com/");
		driver.navigate().refresh();
		Thread.sleep(2000);

		String yt = driver.getTitle();
		System.out.println("YouTube Title is " + yt);
		driver.navigate().back();
		Thread.sleep(5000);

		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("vinod@mail.com");

		WebElement pwd = driver.findElement(By.name("pass"));

		pwd.sendKeys("32jhdf3443");

		WebElement log = driver.findElement(By.name("login"));

		log.click();

	}

}
