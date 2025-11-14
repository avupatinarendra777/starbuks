package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	

  public void LoginPageDriver(WebDriver driver) {
	  
	  this.driver=driver;
  }
  
  public void faceBook() {
	  
 WebElement fbelement = driver.findElement(By.xpath("(//h3[text()='SOCIAL MEDIA ']//following-sibling::ul//child::li//following-sibling::li)[1]"));
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;

  
  Wait<WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//h3[text()='SOCIAL MEDIA ']//following-sibling::ul//child::li//following-sibling::li)[1]")));
	  
	  js.executeScript("arguments[0].scrollIntoView();",  fbelement);  
	 // js.executeScript("arguments[0].click();",  fbelement);
	  
	  Actions actions=new Actions(driver);
	  actions.moveToElement(fbelement).click().perform();
	  
	  
	  Set<String> set=driver.getWindowHandles();
	  ArrayList<String> tabs=new ArrayList<String>(set);
	 driver.switchTo().window(tabs.get(1));
	  
	  WebElement element = driver.findElement(By.xpath("(//span[contains(text(),'Starbucks ')])[3]"));
	  
	  String actualText = element.getText();
	  String expectedText = "See more from Starbucks India"; 
	  
	  if(actualText.equals(expectedText)) {
		  
		  System.out.println("text is present in the page and validation successful");
		  
	  }else {
		  System.out.println("text is not present in the page and validation failed");
	  }
	  
	  
//	public WebElement findElement(By by) throws Exception
//	{
//		
//		WebElement elem  = driver.findElement(by);
//		
//		if(driver instanceof JavascriptExecutor) {
//			((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid blue'", elem);
//		}
//		return elem;
//	}
	  
	  
	  
  }
}
