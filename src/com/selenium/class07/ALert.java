package com.selenium.class07;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALert {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement frstbutton = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		frstbutton.click();
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(4000);
		System.out.println(alt.getText());
		alt.accept();
		
		
		
		
	}

}
