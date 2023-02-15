package com.Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMS {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Vinod M\\eclipse-workspace\\Selenium23\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://in.bookmyshow.com/explore/movies-trivandrum");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
	
	driver.findElement(By.xpath("//img[@alt='Thunivu']")).click();
	driver.findElement(By.xpath("(//span[text()='Book tickets'])[1]")).click();
	
	WebElement cl = driver.findElement(By.xpath("(//div[@class='__text'])[6]"));	
	cl.click();
	
	WebElement ac = driver.findElement(By.id("btnPopupAccept"));
	ac.click();
	
	WebElement sl = driver.findElement(By.id("pop_1"));
	sl.click();
	
	WebElement slc = driver.findElement(By.id("proceed-Qty"));
	slc.click();
	
	WebElement seat = driver.findElement(By.xpath("//a[@onclick='fnSelectSeat('A_1_01')]"));
	
	seat.click();
}
}
