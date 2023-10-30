package stepsdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	public ChromeDriver driver;

	@Given("Launch the browser")
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("Load the url")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@And("Enter the username as {string}")
	public void enterUsername(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	}

	@Given("Enter the password as {string}")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("Click on the Login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("WelcomePage is displayed")
	public void verifyWelcomePage() {
		System.out.println(driver.getTitle());
	}

	@But("ErrorMessage is displayed")
	public void error_message_is_displayed() {
		String errorOccurred = driver
				.findElement(By.xpath("//p[text()='following error occurred during login: User not found.']"))
				.getText();
		System.out.println(errorOccurred);
	}

	@When("Click on {string} link")
	public void click_on_crmsfa_link(String links) {
		driver.findElement(By.linkText(links)).click();
	}
	/*
	 * @When("Click on Leads link") public void click_on_leads_link() {
	 * driver.findElement(By.linkText("Leads")).click(); }
	 * 
	 * @When("Click on Create Lead link") public void click_on_create_lead_link() {
	 * driver.findElement(By.linkText("Create Lead")).click(); }
	 */

	@When("Enter the {string} as {string}")
	public void enter_the_company_name_as(String locator,String cname) {
		driver.findElement(By.id(locator)).sendKeys(cname);

	}
	
	/*
	 * @When("Enter the {} as {string}") public void enter_the_first_name_as(String
	 * fname) {
	 * driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname); }
	 */

	@When("Enter the lastName as {string}")
	public void enter_the_last_name_as(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);

	}

	@When("Click on CreateLead button")
	public void click_on_create_lead_button() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("ViewLeadPage is displayed")
	public void view_lead_page_is_displayed() {
		System.out.println(driver.getTitle());
	}

}
