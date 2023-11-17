package steps;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {
	LoginPage loginPage;

	@Given("user is on techfios login page")
	public void user_is_on_techfios_login_page() {

		initDriver();
		driver.get("https://techfios.com/billing/?ng=login/");

	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(username);

	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		loginPage.enterPassword(password);
	}

	@When("User clicks on login")
	public void user_clicks_on_login() {
		loginPage.clicksigninbutton();
	} 
	@Then("User should land on Dashboard page")
	public void user_should_land_on_Dashboard_page() {
	 loginPage.dashboardHeader();
	}

	@When("User should clicks on bankCash")
	public void user_should_clicks_on_bankCash() {
		loginPage.clickbankcash();
	}

	@When("User clicks on newAccount")
	public void user_clicks_on_newAccount() {
		loginPage.newaccount();
	}

	@When("User enters accounttitle as {string}")
	public void user_enters_accounttitle_as(String accounttitle) {
		loginPage.enterAccountTitle(accounttitle);

	}

	@When("User enters description as the {string} field in accounts page")
	public void user_enters_description_as_the_field_in_accounts_page(String description) {
		loginPage.fillUpDescription(description);
	}
	
	@When("User enters initialBalance in the {string} field in accounts page")
	public void user_enters_initialBalance_in_the_field_in_accounts_page(String balance) {
	    loginPage.insertBalance(balance);
	}
	
	@When("User enters accountNumber in the {string} field in accounts page")
	public void user_enters_accountNumber_in_the_field_in_accounts_page(String accountnumber) {
	  loginPage.inputAccountNumber(accountnumber);
	}
	@When("User enters contactPerson in the {string} field in accounts page")
	public void user_enters_contactPerson_in_the_field_in_accounts_page(String addperson) {
	    loginPage.contactPerson(addperson);
	}
	
	@When("User enters Phone in the {string} field in accounts page")
	public void user_enters_Phone_in_the_field_in_accounts_page(String number) {
	    loginPage.addNumber(number);
	}
	@When("User enters internetBankingURL in the {string} field in accounts page")
	public void user_enters_internetBankingURL_in_the_field_in_accounts_page(String url) {
	   loginPage.addBankUrl(url);
	}
	
	@When("User clicks on submit")
	public void user_clicks_on_submit() {
	  loginPage.submit();
	}



}
