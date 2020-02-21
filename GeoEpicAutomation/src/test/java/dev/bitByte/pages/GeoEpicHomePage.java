package dev.bitByte.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeoEpicHomePage {

	WebDriver driver;
	
	public GeoEpicHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"check\"]/div[1]/input")
	public WebElement username;
	
	@FindBy(xpath = "//*[@id=\"check\"]/div[2]/input")
	public WebElement password;
	
	@FindBy(xpath = "//*[@id=\"check\"]/button[1]")
	public WebElement submitButton;
	
	@FindBy(xpath = "//*[@id=\"boop\"]/div/div[1]/div/div/table/tr/td[1]/button")
	public WebElement locationOneButton;
	
	//*[@id="border"]/div[2]/div/div/div[2]/div/div/button
	//@FindBy(xpath = "//*[@id=\"change\"]")
	@FindBy(xpath = "//*[@id=\"border\"]/div[2]/div/div/div[2]/div/div/button")
	public WebElement pokeBoxButton;
	
	@FindBy(xpath = "/html/body/app-root/app-login/html/nav/button[2]")
	public WebElement goToLocationButton;
	
	@FindBy(xpath = "/html/body/app-root/app-login/html/nav/button[4]")
	public WebElement logout; 
}
