package com.selenium.class11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InClassAssignment2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		
		WebElement startbtn = driver.findElement(By.xpath("//div[@id='start']/button"));
		startbtn.click();
		
		WebElement text = driver.findElement(By.xpath("//div[@id='finish']/h4"));
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(text));
		
		System.out.println(text.getText());

	}

}
