package com.testbase;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import com.pagelayer.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;


 public class TestBase {
 
  public LoginPage login;

  public void setup() { 
	 WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
  
  driver.get("https://www.apps.dalalstreet.ai/login");
  driver.manage().window().maximize();
  driver.manage().deleteAllCookies();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  
  
  // ------------- objec creation -------------
  
  login= new LoginPage
		  
 //--------------login steps---------
		  
   login.enterEmailID("amarwaghmare573@gmail.com");
	login.enterPassword("Test@1234");
	login.clickOnLoginButton();
	Thread.sleep(4000);
}
	@AfterMethod
	public void tearDown() {
		
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.quit();
	}
 }