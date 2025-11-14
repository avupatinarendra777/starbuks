package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;

public class Testcase {
	
	WebDriver driver;
  @Test
  public void MainTest() {
	  
	  LoginPage lp = new LoginPage();
	  lp.LoginPageDriver(driver);
	  lp.faceBook();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
      driver= new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.starbucks.in/dashboard");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  
  }

  @AfterTest
  public void afterTest() {
//	  driver.quit();
  }

}



  
  
  
  
  
  


