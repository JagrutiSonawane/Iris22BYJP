package com.Bhagyashri;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Keyword.UIKeyword;
import dev.failsafe.internal.util.Assert;

public class TestCase {
	@BeforeMethod
	public void SetupUrl() {
		UIKeyword.openBrowser("chrome");
		UIKeyword.launchUrl("https://www.urbanladder.com/");
	}
	@Test
 public void chkTrackOrdertooltip() {
	// to check tooltip of Track Order 
	 WebElement m = UIKeyword.driver.findElement(By.xpath("//a[@title=\"Track Order\"]"));
	 String s = m.getAttribute("title");
	 assertEquals("Track Order", s);
	 System.out.println("Tooltip text is matched");
}
	@Test(enabled=false)
	//Verify on the mouse hover, mouse pointer changes or not.
	public void verifyOverMousePointerIsChange() {
		Actions action=new Actions(UIKeyword.driver);
    	WebElement e=UIKeyword.driver.findElement(By.xpath("//a[@title=\"Track Order\"]"));
		  action.moveToElement(e).perform();
		  System.out.println(e.toString());
	}
//	@AfterMethod
//	public void shutDown()
//	{
//		UIKeyword.closeBrowser();
//	}
}
