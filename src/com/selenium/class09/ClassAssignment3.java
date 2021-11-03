package com.selenium.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAssignment3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("http://the-internet.herokuapp.com/tables");

		List<WebElement> listofrows = driver.findElements(By.xpath("//table[@id='table2']/tbody/tr"));

		String xpathData = "//table[@id='table1']/tbody/tr[%s]/td[not(./a)]";

		for (int i = 1; i <= listofrows.size(); i++) {
			
			String xpathRowData = String.format(xpathData, i);
			
			List<WebElement> ListofdatainEachRow = driver.findElements(By.xpath(xpathRowData));
			
			for (WebElement data : ListofdatainEachRow) {
			
				System.out.print(data.getText() + "      ");
			}
			System.out.println();
		}
	}

}
