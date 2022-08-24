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
<<<<<<< HEAD
	UIKeyword.input(By.xpath("//input[@class='email required input_authentication error']"),"jagrutirsonawane@gmail.com");
	//UIKeyword.input("//input[@class=\\\"required input_authentication\\\"]", "Jagruti12#");
	//UIKeyword.click("(//input[@type=\\\"submit\\\"])[3]");
=======
	UIKeyword.input(By.xpath("//div[@id=\"password-credentials\"]//input[@id=\"spree_user_email\"]"),"jagrutirsonawane@gmail.com");
	UIKeyword.input(By.xpath("//div[@class=\"password\"]//input[@placeholder=\"Password\"]"), "Jagruti12#");
	UIKeyword.click("(//input[@type=\\\"submit\\\"])[3]");
>>>>>>> db5ed8498975b815b6598da1989d4a467625f85c
	UIKeyword.closeBrowser();
}


}
