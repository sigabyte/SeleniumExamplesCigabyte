package com.selenium.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassAssignment {
	public static void main(String[] args) throws InterruptedException {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://testsheepnz.github.io/BasicCalculator.html");

		WebElement dropDwn = driver.findElement(By.id("selectBuild"));
		Select selectDropDown = new Select(dropDwn);

		WebElement frstNum = driver.findElement(By.id("number1Field"));

		WebElement scndNum = driver.findElement(By.id("number2Field"));

		WebElement dropDwn2 = driver.findElement(By.id("selectOperationDropdown"));
		Select selectDropDown2 = new Select(dropDwn2);

		WebElement calcbutton = driver.findElement(By.id("calculateButton"));

		WebElement answer = driver.findElement(By.id("numberAnswerField"));

		WebElement clr = driver.findElement(By.id("clearButton"));

		selectDropDown.selectByValue("2");
		frstNum.sendKeys("2");
		scndNum.sendKeys("3");
		selectDropDown2.selectByValue("2");
		calcbutton.click();

		Thread.sleep(5000);

		System.out.println(answer.getAttribute("value"));

		clr.click();

	}

}
