package com.selenium.class11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InClassAssignment1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
		
		WebElement startbtn = driver.findElement(By.xpath("//div[@id='start']/button"));
		startbtn.click();
		
		WebElement text =driver.findElement(By.xpath("//div[@id='finish']/h4"));
		System.out.println(text.getText());

	}

}
