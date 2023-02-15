package com.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Insta {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vinod M\\eclipse-workspace\\Selenium23\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement mob = driver.findElement(By.xpath("//a[@data-csa-c-type='link'][4]"));
		mob.click();*/

		driver.navigate().to("https://www.facebook.com/");
		//WebElement cn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		WebElement cn = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		cn.click();
		Thread.sleep(5000);

		WebElement fn = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		fn.sendKeys("Vijay");

		WebElement sn = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		sn.sendKeys("M");

		WebElement mn = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		mn.sendKeys("9294012500");

		WebElement np = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		np.sendKeys("indiadfhsli");
		Thread.sleep(5000);
		
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select s = new Select(day);
		s.selectByValue("13");
		
		WebElement mon = driver.findElement(By.xpath("//select[@title='Month']"));
		Select m = new Select(mon);
		m.selectByValue("1");
		
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select yr = new Select(year);
		yr.selectByVisibleText("1955");
		
		WebElement gen = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		gen.click();				
		
		
		

	}
	

}
