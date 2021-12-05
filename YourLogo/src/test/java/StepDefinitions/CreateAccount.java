package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Pages.RegisterUser;
import io.cucumber.java.en.When;

public class CreateAccount {

	RegisterUser registerUser;
	WebDriver driver = null;
		  
    @When("I see the message {string} on Create Account page")
    public void i_see_the_message_on_create_account_page(String string) {
    	registerUser = new RegisterUser(Browser.driver);
    	String message = registerUser.ValidateCreateAccountMessage();
    	message.equals(string);
    }
    
}