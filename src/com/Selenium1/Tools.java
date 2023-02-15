package com.Selenium1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tools {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vinod M\\eclipse-workspace\\Selenium23\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		WebElement grp = driver.findElement(By.xpath("//select[@name='cars']"));
		
		Select g = new Select(grp);
		
		g.selectByVisibleText("Volvo");
		g.selectByIndex(2);
		
		List<WebElement> sel = g.getOptions();
		
		for(int i=0;i<sel.size();i++){
			System.out.println(sel.get(i).getText());
		}
		System.out.println("==============================");
		List<WebElement> all = g.getAllSelectedOptions();
		
		for(WebElement a:all) {
			System.out.println(a.getText());
		}
		System.out.println("==============================");
		WebElement first = g.getFirstSelectedOption();
		System.out.println(first.getText());
	}
}