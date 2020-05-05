package stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class MyAccountLoginStepDefinitions {
	
	
	public WebDriver driver=null;
	
	
	@Given("^open browser$")
	public void open_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	}

	@When("^Enter URL \"([^\"]*)\"$")
	public void enter_URL(String url) throws Throwable {
		driver.get(url);


	}

	@When("^Click on My Account Menu$")
	public void click_on_My_Account_Menu() throws Throwable {
		driver.findElement(By.linkText("My Account")).click();


	}

	/*@When("^Enter registered username and password$")
	public void enter_registered_username_and_password() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("pavanoltraining");
		driver.findElement(By.id("password")).sendKeys("Test@selenium123");		

	}*/
	
	/*@When("^Enter registered \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_registered_and(String user, String pwd) throws Throwable {
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pwd);	
	}*/

	// Login with DataTable method
	/*@When("^Enter registered username and password$")
	public void enter_registered_username_and_password(DataTable credentials) throws Throwable {
		List <List<String>> data=credentials.raw();
		driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
		
	}*/
	
	// Login with DataTable method using header - map table
	@When("^Enter registered username and password$")
	public void enter_registered_username_and_password(DataTable credentials) throws Throwable {
		List<Map<String,String>> data=credentials.asMaps(String.class,String.class);
		driver.findElement(By.id("username")).sendKeys(data.get(0).get("user"));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get("password"));
		
	}
	
	

	@When("^Click on login button$")
	public void click_on_login_button() throws Throwable {
		driver.findElement(By.name("login")).click();
		

	}

	@Then("^User must successfully login to the web page$")
	public void user_must_successfully_login_to_the_web_page() throws Throwable {
		String capText=driver.findElement(By.xpath("//*[@id=\'page-36\']/div/div[1]/div/p[1]/strong")).getText();
		Assert.assertEquals(true, capText.contains("pavanoltraining"));
		
		
		
	}
	
	@Then("^Verify Login$")
	public void verify_Login() throws Throwable {
		String capText=driver.findElement(By.xpath("//*[@id=\'page-36\']/div/div[1]/ul/li/strong")).getText();
		if(capText.contains("ERROR")) // test for invalid error
		{
	
			Assert.assertTrue("Invalidinput - Error Page", true);
			
			driver.close();
	}
	
	
	
}

}	