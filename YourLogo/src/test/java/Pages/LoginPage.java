package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver driver;
	WebDriverWait wait;

	By btn_SignIn = By.xpath("//a[@class='login']");
	By txt_EmailAddress = By.xpath("//*[@id='email_create']");
	By btn_CreateAccount = By.id("SubmitCreate");
	By btn_Logout = By.xpath("//a[@class='logout']");
	By txt_SignInEmail = By.id("email");
	By txt_SignInPassword = By.id("passwd");
	By btn_SubmitLogin = By.id("SubmitLogin");
	By txt_UserName = By.xpath("//a[@title='View my customer account']/span");

	public LoginPage(WebDriver driver)
	{
		this.driver = driver;	
		driver.manage().window().maximize();
	}		

	public void ClickSignInButton () {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(btn_SignIn).click();
	}

	public void EnterEmailAddress(String email) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(txt_EmailAddress).sendKeys(email);
	}

	public void ClickCreateAccount() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.findElement(btn_CreateAccount).click();
	}

	public void LogOut() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(btn_Logout).click();
	}
	
	public void EnterSignInEmailAddress(String email) {
		driver.findElement(txt_SignInEmail).sendKeys(email);
	}
	
	public void EnterSignInPassword(String password) {
		driver.findElement(txt_SignInPassword).sendKeys(password);
	}
	
	public void SubmitLogin() {
		driver.findElement(btn_SubmitLogin).click();
	}
	
	public String ReturnUserNameOnLandingPage() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		return driver.findElement(txt_UserName).getText();
	}
}