package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterUser {

	WebDriver driver;

	By btnMrTitle = By.id("id_gender1");
	By btnMrsTitle = By.id("id_gender2");	
	By txt_FirstName = By.id("customer_firstname");
	By txt_LastName = By.id("customer_lastname");
	By txt_Email = By.id("email");
	By txt_Password = By.id("passwd");
	By txt_AddressFirstName = By.id("firstname");
	By txt_AddressLastName = By.id("lastname");
	By txt_Address = By.id("address1");
	By txt_City = By.id("city");
	By drp_State = By.id("id_state");
	By txt_PostCode = By.id("postcode");
	By txt_MobilePhone = By.id("phone_mobile");
	By txt_AddressAlias = By.id("alias");
	By btn_Register = By.id("submitAccount");
	By txt_Message = By.xpath("//*[@id='center_column']/h1");
	By txt_CreateAccount = By.xpath("//*[@id='noSlide']/h1");

	public RegisterUser(WebDriver driver)
	{
		this.driver = driver;	
	}

	public void EnterText (By element, String string) {
		driver.findElement(element).sendKeys(string);
	}

	public void EnterTitle(String string) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		if(string.equals("Mr")) {
			driver.findElement(btnMrTitle).click();
		}
		else {
			driver.findElement(btnMrsTitle).click();
		}
	}

	public void EnterFirstName (String string) {
		EnterText(txt_FirstName, string);
	}

	public void EnterLastName (String string) {
		EnterText(txt_Email, string);
	}

	public void EnterEmail (String string) {
		EnterText(txt_AddressLastName, string);
	}

	public void EnterPassword (String string) {
		EnterText(txt_Password, string);
	}

	public void EnterAddressFirstName (String string) {
		EnterText(txt_AddressFirstName, string);
	}

	public void EnterAddressLastName (String string) {
		EnterText(txt_LastName, string);
	}

	public void EnterAddress (String string) {
		EnterText(txt_Address, string);
	}

	public void EnterCity (String string) {
		EnterText(txt_City, string);
	}

	public void EnterState (String string) {
		Select sel = new Select(driver.findElement(drp_State));
		sel.selectByVisibleText(string);
	}

	public void EnterPostCode (String string) {
		EnterText(txt_PostCode, string);
	}

	public void EnterMobileNum (String string) {
		EnterText(txt_MobilePhone, string);
	}

	public void EnterAddressAlias (String string) {
		EnterText(txt_AddressAlias, string);
	}

	public void SubmitUserDetails() {
		driver.findElement(btn_Register).click();
	}	
	
	public String ValidateWelcomeMessage() {
		return (driver.findElement(txt_Message).getText());
		
	}
	
	public String ValidateCreateAccountMessage() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		return (driver.findElement(txt_CreateAccount)).getText();
	}

}
