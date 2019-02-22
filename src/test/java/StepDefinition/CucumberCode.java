package StepDefinition;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

import IntegratedFramworks.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberCode extends Base{

	Logger logs = Logger.getLogger(CucumberCode.class.getName());
	
	@Given("^User is on youtube homeppage$")
	public void user_is_on_youtube_homeppage() throws Throwable {
		browserSetup("chrome");
		driver.get("https://www.youtube.com/");
	}

	@When("^user inputs \"([^\"]*)\" and click search botton$")
	public void user_inputs_and_click_search_botton(String arg1) {
	driver.findElement(By.id("search")).sendKeys("Ethiopian music");
	driver.findElement(By.id("search-icon-legacy")).click();
	}

	@Then("^user gets list of ethiopian music videos$")
	public void user_gets_list_of_ethiopian_music_videos() throws Throwable {
		String actual = driver.getCurrentUrl();
		String expected = "https://www.youtube.com/results?search_query=ethiopian+music";
		logs.debug("----------------------Test executed.-----------------------");
			Assert.assertEquals(actual, expected);
		}
	
}		
