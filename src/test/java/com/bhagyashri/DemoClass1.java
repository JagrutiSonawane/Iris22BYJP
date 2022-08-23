package com.bhagyashri;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoClass1 {
@Test
	public void loginChk() {
	WebDriverManager.chromedriver().setup();
    RemoteWebDriver driver = new ChromeDriver();
    driver.get("https://www.urbanladder.com/");
    System.out.println("Sucessfully launched");
    driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
    driver.findElement(By.xpath("//input[@class='email required input_authentication']")).sendKeys("bpadhyar@gmail.com");
    System.out.println("email entered");
//	UIKeyword.click("//a[contains(text(),'Log In')]");
//	UIKeyword.input(By.cssSelector("input.email.required.input_authentication.error"),"jagrutirsonawane@gmail.com");
//	//UIKeyword.input("//input[@class=\\\"required input_authentication\\\"]", "Jagruti12#");
//	//UIKeyword.click("(//input[@type=\\\"submit\\\"])[3]";
}

}
