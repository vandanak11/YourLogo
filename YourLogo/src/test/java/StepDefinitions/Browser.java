package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Browser {
		public static WebDriver driver;

	@Before
	public void beforeScenario(){	
		String driverPath = ".\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		} 
		 
	@After
	public void afterScenario(){
		driver.close();
		driver.quit(); 
		}
}