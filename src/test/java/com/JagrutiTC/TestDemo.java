package com.JagrutiTC;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Keyword.UIKeyword;
//Urban Ladder LogIn Page Test cases
public class TestDemo {
	
	@BeforeMethod
	public void SetupUrl() {
		UIKeyword.openBrowser("chrome");
		UIKeyword.launchUrl("https://www.urbanladder.com/");
	}
@Test	
public void clickOnBeforeLogInIcon() {
UIKeyword.click("//span[@class='header-icon-link user-profile-icon']");
UIKeyword.click("//a[contains(text(),'Log In')]");
}

@Test
public void validLogin() {
	UIKeyword.click("//span[@class='header-icon-link user-profile-icon']");
	UIKeyword.click("//a[contains(text(),'Log In')]");
	UIKeyword.input(By.xpath("//div[@id=\"password-credentials\"]//input[@id=\"spree_user_email\"]"),"jagrutirsonawane@gmail.com");
	UIKeyword.input(By.xpath("//div[@class=\"password\"]//input[@placeholder=\"Password\"]"), "Jagruti12#");
	UIKeyword.click("(//input[@value='Log In']");
	UIKeyword.closeBrowser();
}


}
