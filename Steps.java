package week6.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	
	public RemoteWebDriver driver;
	public String leadID;
	
	@Given("launch browser")
	public void launch_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Given("Navigate to URL")
	public void navigate_to_url() {
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Given("Enter the UserName {string}")
	public void enter_the_user_name(String Uname) {
		driver.findElement(By.id("username")).sendKeys(Uname);
	}
	
	@Given("Enter the Password {string}")
	public void enter_the_password(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	@When("Click the Login Link")
	public void click_the_login_link() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if(displayed) {
			System.out.println("HomePage is displayed");
		}else {
			System.out.println("HomePage is not displayed");
		}
	}
	
	@Given("Click the CRM link")
	public void click_the_crm_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@When("Click the Leads link")
	public void click_the_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@Then("Leads page should be displayed")
	public void leads_page_should_be_displayed() {
		boolean displayed1 = driver.findElement(By.linkText("Create Lead")).isDisplayed();
		if(displayed1) {
			System.out.println("LeadsPage is displayed");
		}else {
			System.out.println("LeadsPage is not displayed");
		}
	}
	
	@Given("Click the Create Leads")
	public void clickCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@Given("Enter the CompanyName as {string}")
	public void enter_the_company_name(String cmp) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cmp);
	}
	
	@Given("Enter the firstName as {string}")
	public void enter_the_first_name(String Fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(Fname);
	}
	
	@Given("Enter the LastName as {string}")
	public void enter_the_last_name(String Lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);
	}
	
	@When("Click the Submit Button to Create Lead")
	public void click_the_submit_button_to_create_lead() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then("Lead Status should be assigned")
	public void lead_status_should_be_assigned() {
		String text = driver.findElement(By.xpath("//span[@id='viewLead_statusId_sp']")).getText();
		if(text.equals("Assigned")) {
			System.out.println("Lead created successfully");
		}else {
			System.out.println("Lead not created");
		}
	}
	
	@Given("Click the Find Leads link")
	public void clickFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@Given("Click the phonetab")
	public void clickPhoneTab() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	
	@Given("Enter the phone Number {string}")
	public void enterPhoneNum(String ph) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(ph);
	}
	
	@Given("Click the Find Leads button")
	public void clickFindLeadsButton() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	
	@Given("manual wait")
	public void manualWait() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	@Given("Click the lead ID")
	public void clickLeadID() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	
	@Given("Click the Edit Link")
	public void clickEditLink() {
		driver.findElement(By.linkText("Edit")).click();
	}
	
	@Given("Enter the companyName in EditLead Page {string}")
	public void enterCompanyName_EditLead(String cmp) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cmp);
	}
	
	@Given("Get the LeadID text")
	public void getTextOfLeadID() {
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	}
	
	@Given("delete the Lead")
	public void deleteLead() {
		driver.findElement(By.linkText("Delete")).click();
	}
	
	@Given("Enter the LeadID text")
	public void enterLeadIDText() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}
	
	@When("Click the Find Lead Button")
	public void clickFindLeadButton() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	
	@Then("No records to display message displayed")
	public void verifyLeadDeleted() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		driver.close();
	}
	
	@Given("Click the Merge Lead")
	public void clickMergeLead() {
		driver.findElement(By.linkText("Merge Leads")).click();
	}
	
	@Given("Click the fromLead link")
	public void clickFromLead() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	}
	
	@Given("Click the toLead link")
	public void clickToLead() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	}
	
	@Given("Select the Window {int}")
	public void selectWindow(int windowNum) {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(windowNum));
	}
	
	@Given("Select the Lead {string}")
	public void selectTheLead(String leadName) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(leadName);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	
	@Given("Click the Merge Button")
	public void clickMergeButton() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
	}
	
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	@Given("Close the browser")
	public void closeBrowser() {
		driver.close();
	}
}
