package StepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import Pages.LoginPage;
import Pages.RegisterUser;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterYourLogo {
	
	RegisterUser registerUser;
	LoginPage loginPage;
	RandomTestDataGenerator randomTestDataGenerator;
	WebDriver driver = null;

	@Given("I open YourLogo Web site")
	public void i_open_your_logo_web_site() {
		String url="http://automationpractice.com/index.php";
		Browser.driver.get(url);
	}

	@Given("I click on Sign in")
	public void i_click_on_sign_in() {
		loginPage = new LoginPage(Browser.driver);
		loginPage.ClickSignInButton();
	}

	@Given("I enter email address {string} to register")
	public void i_enter_email_address_to_register(String string) {		
		randomTestDataGenerator = new RandomTestDataGenerator();
		String email = randomTestDataGenerator.ReturnRandomEmail(string);
		loginPage.EnterEmailAddress(email);		
	}

	@Given("I click on Create an account button")
	public void i_click_on_create_an_account_button() {
		loginPage.ClickCreateAccount();
	}
	
	 @When("I enter Title as {string}")
	 public void i_enter_title_as(String string) {
		registerUser = new RegisterUser(Browser.driver);		
		registerUser.EnterTitle(string);			
	 }

	@When("I enter valid data on page")
	public void i_enter_valid_data_on_page(DataTable dataTable) {
		List<List<String>> userList = dataTable.asLists(String.class);
		String firstName = userList.get(0).get(0);
		String lastName = userList.get(0).get(1);
		String password = userList.get(0).get(3);
		password = randomTestDataGenerator.ReturnRandomString(password);
		String address = userList.get(0).get(4);
		String city = userList.get(0).get(5);
		String state = userList.get(0).get(6);
		String postCode = userList.get(0).get(7);
		String mobileNum = userList.get(0).get(8);
		String addressAlias = userList.get(0).get(9);		

		registerUser.EnterFirstName(firstName);
		registerUser.EnterLastName(lastName);
		registerUser.EnterPassword(password);
		registerUser.EnterAddressFirstName(firstName);
		registerUser.EnterAddressLastName(lastName);
		registerUser.EnterAddress(address);
		registerUser.EnterCity(city);
		registerUser.EnterState(state);
		registerUser.EnterPostCode(postCode);
		registerUser.EnterMobileNum(mobileNum);
		registerUser.EnterAddressAlias(addressAlias);		
	}

	@When("I click on register button")
	public void i_click_on_register_button() {
		registerUser.SubmitUserDetails();
	}

	@Then("I am registered to YourLogo web site and the message {string} is displayed on the page")
	public void i_am_registered_to_your_logo_web_site(String string) {
		String message = registerUser.ValidateWelcomeMessage();
		message.equals(string);
	}

}