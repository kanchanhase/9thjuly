package com.testbase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
public LoginPage login;
	public void setup() {
	
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();

	
	driver.get("https://www.apps.dalalstreet.ai/login");
}
}