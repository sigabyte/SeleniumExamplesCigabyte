package com.selenium.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAssignment2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://www.saucedemo.com/");

		WebElement userName = driver.findElement(By.name("user-name"));
		userName.sendKeys("standard_user");
		WebElement Pssword = driver.findElement(By.name("password"));
		Pssword.sendKeys("secret_sauce");
		WebElement button = driver.findElement(By.name("login-button"));
		button.click();

		WebElement bckBag = driver.findElement(By.id("item_4_title_link"));
		bckBag.click();

		WebElement price = driver.findElement(By.className("inventory_details_price"));
		System.out.println(price.getText());

		System.out.println(" ");

		WebElement cartButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		cartButton.click();

		WebElement cartIcon = driver.findElement(By.className("shopping_cart_link"));
		cartIcon.click();

		WebElement cartPrice = driver.findElement(By.className("inventory_item_price"));
		System.out.println(cartPrice.getText());

		System.out.println(" ");

		WebElement chkoutButton = driver.findElement(By.id("checkout"));
		chkoutButton.click();

		WebElement frstName = driver.findElement(By.id("first-name"));
		frstName.sendKeys("Ciga");
		WebElement lastName = driver.findElement(By.id("last-name"));
		lastName.sendKeys("byte");
		WebElement zpcode = driver.findElement(By.id("postal-code"));
		zpcode.sendKeys("9008208");

		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();

		WebElement overviewPrice = driver.findElement(By.className("summary_subtotal_label"));
		System.out.println(overviewPrice.getText());
		WebElement tax = driver.findElement(By.className("summary_tax_label"));
		System.out.println(tax.getText());
		WebElement total = driver.findElement(By.className("summary_total_label"));
		System.out.println(total.getText());

		WebElement finishButton = driver.findElement(By.id("finish"));
		finishButton.click();

		WebElement thanksmssge = driver.findElement(By.className("complete-header"));
		System.out.println(thanksmssge.getText());
		WebElement thanksmssge2 = driver.findElement(By.className("complete-text"));
		System.out.println(thanksmssge2.getText());

	}

}
