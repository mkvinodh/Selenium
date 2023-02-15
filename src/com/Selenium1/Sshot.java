package com.Selenium1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vinod M\\eclipse-workspace\\Selenium23\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.apple.com/in/");
		driver.manage().window().maximize();

		TakesScreenshot ss = (TakesScreenshot) driver;
		File f1 = ss.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\Vinod M\\eclipse-workspace\\Selenium23\\Screenshot\\apple1.png");
		//FileHandler.copy(f1, f);
		FileUtils.copyFile(f1,f);
	}

}
