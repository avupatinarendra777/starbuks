package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Amazon {
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  
  }
}
