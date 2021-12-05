package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Browser {
		
	WebDriver driver;
	
	public Browser(WebDriver driver)
	{
		this.driver = driver;	
		driver.manage().window().maximize();
	}

	@Before
	public void beforeScenario()
	{	
		
	} 
		 
	@After
	public void afterScenario()
	{
		driver.close();
		driver.quit(); 
	}
}