package com.yogita;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Keyword.UIKeyword;

public class TestCaseY {
	@Test
public void searchText() {
	UIKeyword.openBrowser("chrome");
	UIKeyword.launchUrl("https://www.urbanladder.com/");
	UIKeyword.sendText(By.cssSelector("input[type='search']"), "hello");
    UIKeyword.click(By.cssSelector("span.search-icon.icofont-search"));
}
	@Test
public void SofasAndRecliners() {
	UIKeyword.openBrowser("chrome");
	UIKeyword.launchUrl("https://www.urbanladder.com/");
    UIKeyword.moveToCursorOnElement(By.cssSelector("li.topnav_item.sofasunit>span.topnav_itemname")); 
	}
	
}
