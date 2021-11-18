package com.selenium.class12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploading {
	public static void main(String[] args) {
		
		// Open browser
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				WebDriver driver = new ChromeDriver();

				// Maximize
				driver.manage().window().maximize();

				// Loading url in the browser
				driver.get("https://www.globalsqa.com/samplepagetest/");
				
				// upload file 
				WebElement choosebtn =driver.findElement(By.xpath("//span[@class='wpcf7-form-control-wrap file-553']/input"));
				choosebtn.sendKeys("C:\\Users\\PROTOCOL\\Pictures\\tanflex spray.JPG");
				
				
				

	}

}
