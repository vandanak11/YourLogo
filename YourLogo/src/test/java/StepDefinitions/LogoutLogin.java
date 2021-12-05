package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Pages.LoginPage;
import Pages.RegisterUser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutLogin {

	RegisterUser registerUser;
	LoginPage loginPage;
	RandomTestDataGenerator randomTestDataGenerator;
	WebDriver driver = null;
		  
    @When("I click on Sign in button")
    public void i_click__on_sign_in_button() {
    	loginPage = new LoginPage(Browser.driver);
    	loginPage.ClickSignInButton();
    }
	
	@Given("I am logged in to YourLogo web site and the message {string} is displayed on the page")
	public void i_am_logged_in_to_yourlogo_web_site_and_the_message_is_displayed_on_the_page(String string) {
		registerUser = new RegisterUser(Browser.driver);
		String message = registerUser.ValidateWelcomeMessage();
		message.equals(string);
	}
	
	@Given("I click on SignIn button on Login form")
	public void i_click_on_signin_button_on_login_form() {
		loginPage.SubmitLogin();
	}
	
    @When("I click on Logout")
    public void i_click_on_logout() {
    	loginPage.LogOut();
    }
    
    @When("I enter Email address {string} and Password {string} on home page")
    public void i_enter_email_address_and_password_on_home_page(String email, String password) {
    	loginPage.EnterSignInEmailAddress(email);    	
    	loginPage.EnterSignInPassword(password);
    }  
    
    @Then("I am logged back to the web site and the message {string} is displayed on the page")
    public void i_am_logged_back_to_the_web_site_and_the_message_is_displayed_on_the_page(String string) {
    	String message = registerUser.ValidateWelcomeMessage();
		message.equals(string);
    }	
    
    @Then("I am logged in to YourLogo web site and correct name {string} is displayed on the page")
    public void i_am_logged_in_to_yourlogo_web_site_and_correct_name_is_displayed_on_the_page(String string) {
    	String name = loginPage.ReturnUserNameOnLandingPage();
    	name.equals(string);
    }
}