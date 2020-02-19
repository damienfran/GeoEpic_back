package dev.bitByte.runners;


import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import dev.bitByte.pages.GeoEpicHomePage;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "dev.bitByte.steps")
public class GeoEpicRunner {

	public static WebDriver driver;
	public static GeoEpicHomePage homepage;
	
	static {
		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		
		homepage = new GeoEpicHomePage(driver);
	}
	
	
	
//	@Test
//	void test() throws InterruptedException {
//		driver.get("http://geoepic.com.s3-website.us-east-2.amazonaws.com/");
//		homepage.username.sendKeys("rohit");
//		homepage.password.sendKeys("rohitpw");
//		homepage.submitButton.click();
//		
//		Thread.sleep(8000);
//
//	}
//	
//	@Test
//	void test2() throws InterruptedException {
//		driver.get("http://geoepic.com.s3-website.us-east-2.amazonaws.com/");
//		homepage.username.sendKeys("rohit");
//		homepage.password.sendKeys("rohitpw");
//		homepage.submitButton.click();
//		
//		Thread.sleep(2000); //need some time for button to load
//		
//		homepage.locationOneButton.click();
//		
//		Thread.sleep(8000);	
//	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
	

}
