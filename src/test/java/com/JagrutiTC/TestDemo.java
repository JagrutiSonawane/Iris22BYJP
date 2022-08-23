package com.JagrutiTC;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Keyword.UIKeyword;
//Urban Ladder LogIn Page Test cases
public class TestDemo {
	
@Test	
public void clickOnBeforeLogInIcon() {
UIKeyword.openBrowser("chrome");
UIKeyword.launchUrl("https://www.urbanladder.com/");
UIKeyword.click("//span[@class='header-icon-link user-profile-icon']");
UIKeyword.click("//a[contains(text(),'Log In')]");
}

@Test
public void validLogin() {
	UIKeyword.openBrowser("chrome");
	UIKeyword.launchUrl("https://www.urbanladder.com/");
	UIKeyword.click("//span[@class='header-icon-link user-profile-icon']");
	UIKeyword.click("//a[contains(text(),'Log In')]");
	UIKeyword.input(By.cssSelector("input.email.required.input_authentication.error"),"jagrutirsonawane@gmail.com");
	//UIKeyword.input("//input[@class=\\\"required input_authentication\\\"]", "Jagruti12#");
	//UIKeyword.click("(//input[@type=\\\"submit\\\"])[3]");
	UIKeyword.closeBrowser();
}

}
