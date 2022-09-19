package Keyword;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeyword {
	
	public static RemoteWebDriver driver;
	
	public static void openBrowser(String browserName) { 
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		System.out.println(browserName+" is launched");
	}
	
	public static void launchUrl(String url) 
	{
		driver.get(url);
		System.out.println("Url launched :"+url);
	}
	
	public static void closeBrowser() 
	{
		driver.close();
		System.out.println("Browser closed");
	}
   public static void click(String b) {
	   driver.findElement(By.xpath(b)).click();
   }
   
   public static void click(By cssSelect) {
  driver.findElement(cssSelect).click();	

}
   public static String getUrl() {
	   String s=driver.getCurrentUrl();
	   return s;
}
   public static boolean isdisplayed(By element) {
	boolean t=driver.findElement(element).isDisplayed();
 return t;
}

public static List<String> Elements(By xpath) {
	List<WebElement> elements= driver.findElements(xpath);
	List<String> elemnts = new ArrayList();
	for (WebElement ele : elements) {
		 elemnts.add(ele.getText());
	}
	return  elemnts;
}

public static void input(By locator, String input) {
driver.findElement(locator).sendKeys(input);	
}

public static void jseInput(String string) {
	driver.executeAsyncScript(string);
}

public static void submitForm(String sub) {
	driver.findElement(By.xpath(sub)).submit();
	
}

public static void sendText(By path, String text) {
	driver.findElement(path).sendKeys(text);
	
}
public static void moveToCursorOnElement(By cssSelector) {
	Actions moveto = new Actions(driver);
	WebElement ele= driver.findElement(cssSelector);
	moveto.moveToElement(ele);

}

}
