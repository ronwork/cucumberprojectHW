package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement UserName;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SignInButton;
	@FindBy(how = How.XPATH, using = "/html/body/section/div/nav/div/ul/li[10]/a/span[1]")
	WebElement bankCash;
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='New Account']")
	WebElement NewAccount;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement AccountTitleInput;
	
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement InputDescription;
	
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement InputBalance;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement InputAccountNumber;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement AddContactPerson;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	WebElement AddPhoneNumber;
	@FindBy(how = How.XPATH, using = "//input[@id='ib_url']")
	WebElement BankingUrl;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Submit']")
	WebElement ClickSubmit;
	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Dashboard']")
	WebElement DashboardHeader;
	
	
	// Methods to interact with the elements
	public void enterUserName(String userName) {
		UserName.sendKeys(userName);
	}

	public void enterPassword(String password) {
		Password.sendKeys(password);
	}

	public void clicksigninbutton() {
		SignInButton.click();

		try {
			// Sleep for 3 seconds (3000 milliseconds)
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// Handle the exception if needed
			e.printStackTrace();
		}

	}
	
public void dashboardHeader() {
	Assert.assertTrue("Dashboard page not found", DashboardHeader.isDisplayed());
	}

	public void clickbankcash() {
		bankCash.click();
	}

	public void newaccount() {
		NewAccount.click();
	}
	
	public void enterAccountTitle(String accounttitle) {
	    AccountTitleInput.sendKeys(accounttitle);
	}
	
	public void fillUpDescription(String description) {
		InputDescription.sendKeys(description);
	}
	
	public void insertBalance(String balance) {
		InputBalance.sendKeys(balance);
	}
	public void inputAccountNumber(String accountnumber) {
		InputAccountNumber.sendKeys(accountnumber);
	}
	public void contactPerson(String addperson) {
		AddContactPerson.sendKeys(addperson);
	}
	public void addNumber(String number) {
		AddPhoneNumber.sendKeys(number);
	}
	public void addBankUrl(String url) {
		BankingUrl.sendKeys(url);
	}
	public void submit() {
		ClickSubmit.click();
	}
	

}
