package com.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vinod M\\eclipse-workspace\\Selenium23\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		/*driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);
		System.out.println("========================");
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		String title1 = driver.getTitle();
		System.out.println(title1);
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		System.out.println("========================");
		driver.navigate().back();
		Thread.sleep(2000);*/
		driver.get("https://www.amazon.in/");
		String title2 = driver.getTitle();
		System.out.println(title2);
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		WebElement find = driver.findElement(By.id("twotabsearchtextbox"));
		find.sendKeys("mobile");
		WebElement search = driver.findElement(By.id("nav-search-submit-button"));
		search.click();
		

	}
}
