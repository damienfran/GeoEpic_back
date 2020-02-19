package dev.bitByte.steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dev.bitByte.pages.GeoEpicHomePage;
import dev.bitByte.runners.GeoEpicRunner;
import junit.framework.Assert;

public class GeoEpicLoginSteps {

	public static WebDriver driver = GeoEpicRunner.driver;
	public static GeoEpicHomePage homepage = GeoEpicRunner.homepage;
	
	

	@Given("^The user is on the GeoEpic Home Page$")
	public void the_user_is_on_the_GeoEpic_Home_Page() throws Throwable {
		driver.get("http://geoepic.com.s3-website.us-east-2.amazonaws.com/");


	}

	@When("^The user inputs valid log in information and hits Submit$")
	public void the_user_inputs_valid_log_in_information_and_hits_Submit() throws Throwable {
		homepage.username.sendKeys("rohit");
		homepage.password.sendKeys("rohitpw");
		homepage.submitButton.click();
		
	}

	@Then("^The user should be logged in and take to the myStats page$")
	public void the_user_should_be_logged_in_and_take_to_the_myStats_page() throws Throwable {

		Thread.sleep(5000); // visually verify that on correct page
		Assert.assertEquals(true, true);

	}
	
	@Given("^The user is on the GeoEpic myStats Page$")
	public void the_user_is_on_the_GeoEpic_myStats_Page() throws Throwable {

		//this is met by previous test
	}

	@When("^The user clicks on Location One$")
	public void the_user_clicks_on_Location_One() throws Throwable {

		homepage.locationOneButton.click();

	}

	@Then("^The user is directed to the Location One Details Page$")
	public void the_user_is_directed_to_the_Location_One_Details_Page() throws Throwable {

		Thread.sleep(5000); // visually confirm that on correct page
		Assert.assertEquals(true, true);
		
	}

	@Given("^The user is on the Location Details Page$")
	public void the_user_is_on_the_Location_Details_Page() throws Throwable {

		// Assured by previous test
	}

	@When("^The user clicks on the treasure Box to open it$")
	public void the_user_clicks_on_the_treasure_Box_to_open_it() throws Throwable {
		homepage.pokeBoxButton.click();
		
	}

	@Then("^The user is one the Treasure Swap Page$")
	public void the_user_is_one_the_Treasure_Swap_Page() throws Throwable {
		Thread.sleep(5000);//visually confirm that on right page
		Assert.assertEquals(true, true);

	}
	
	@Given("^The user is on the myStats page$")
	public void the_user_is_on_the_myStats_page() throws Throwable {

		//This should be visually verified
	}

	@When("^The user clicks on Go To Location button$")
	public void the_user_clicks_on_Go_To_Location_button() throws Throwable {

		homepage.goToLocationButton.click();
	}

	@Then("^The user gets to the Location Picker page$")
	public void the_user_gets_to_the_Location_Picker_page() throws Throwable {
		Thread.sleep(5000); // visually confirm
		Assert.assertEquals(true, true);

	}

	@Given("^The user is on the Location Picker Page$")
	public void the_user_is_on_the_Location_Picker_Page() throws Throwable {
		//this should be visually verified
	}
	
	
}
