package com.selenium.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		Thread.sleep(3000);
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		
		driver.switchTo().frame(iframe);		
		
		WebElement img = driver.findElement(By.xpath("//ul[@id='gallery']//img[@alt='The peaks of High Tatras']"));
		WebElement trash =driver.findElement(By.id("trash"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(img, trash).build().perform();
		
		

	}

}
