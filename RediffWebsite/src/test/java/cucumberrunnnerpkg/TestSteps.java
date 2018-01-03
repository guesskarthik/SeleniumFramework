package cucumberrunnnerpkg;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dotcom.RediffWebsite.HomePageFactory;
import dotcom.RediffWebsite.SignOnBusinessFunctions;
import dotcom.RediffWebsite.TestPlan;

public class TestSteps {
	
	TestPlan tp;
	WebDriver driver;
	SignOnBusinessFunctions SBF;
	HomePageFactory hf;
	
	@Before
	public void initialize()
	{
		tp = new TestPlan();
		driver = tp.getDriver();
		SBF = PageFactory.initElements(driver, SignOnBusinessFunctions.class);
		hf = PageFactory.initElements(driver, HomePageFactory.class);
	}
	
	@After
	public void teardown()
	{
		driver.close();
	}
	
	@Given("^User navigates to \"([^\"]*)\"$")
	public void user_navigates_to(String arg1) throws Throwable {
		
		SBF.NavigateURL(arg1);
		
	}

	@When("^User enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_username_as_and_password_as(String arg1, String arg2) throws Throwable {
		//tp = new TestPlan();
		//driver = tp.getDriver();
		//SBF = PageFactory.initElements(driver, SignOnBusinessFunctions.class);
		SBF.Login(arg1, arg2);
	}

	@When("^Clicks go$")
	public void clicks_go() throws Throwable {
		SBF.ClickGoBtn();
	}

	@Then("^successful logged in$")
	public void successful_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Successfully logged in");
	}
	

	@When("^user click \"([^\"]*)\"$")
	public void user_click(String arg1) throws Throwable {
	    hf.ClickLink(arg1);
	}
	
	@Then("^user navigates to \"([^\"]*)\" page$")
	public void user_navigates_to_page(String arg1) throws Throwable {
	    hf.validatePageName(arg1);
}

}
