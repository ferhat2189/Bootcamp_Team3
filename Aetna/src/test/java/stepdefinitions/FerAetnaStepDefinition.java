package stepdefinitions;

import common.WebAPI;
import ferAetna.FerAetna;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

//import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static ferAetna.FerAetnaWebElements.*;

public class FerAetnaStepDefinition extends WebAPI {
    static FerAetna ferAetna ;

    // Cucumber Hook
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Demo1"); // ... and embed it in the report.

        }
        cleanUp();
    }
//    @AfterClass
//    public void closeBrowser() {
//        cleanUp();
//    }

    @BeforeStep
    public static void getInit() {
        ferAetna = PageFactory.initElements(driver, FerAetna.class);
    }

    @Given("I am Aetna home page")
    public void i_am_aetna_home_page() throws IOException {
        openBrowser();
    }

    @When("I wait for four seconds")
    public void i_wait_for_four_seconds() {
      driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }
    @FindBy(xpath = WebElemetLogoXpath) public WebElement Logo;
    @Then("I verify if the logo is displayed")
    public void i_verify_if_the_logo_is_displayed() {
        boolean logoCheck= Logo.isDisplayed();
        boolean expected = true;
        Assert.assertEquals(logoCheck,expected);
       // System.out.println(driver.getTitle());
    }

//    @Given("I am on Aetna home page")
//    public void i_am_on_aetna_home_page() throws IOException {
//        openBrowser();
//    }
//    @Then("I click Find Doctor")
//    public void i_click_find_doctor() {
//        homePage.clickFindDoctor1();
//    }
//
//    @Then("I verify find doctor appears properly")
//    public void i_verify_find_doctor_appears_properly() {
//        homePage.validateFindDoctor("Find Doctor, Dentist or Hospital");
//    }
////    @Then("user enter\"(.*)\" and \"(.*)\"")
////    public void user_enter_username_and_password() {
////     homePage.sendVariable();
////    }
//
//    @Then("user enter {string} and {string}")
//    public void user_enter_username_and_password(String string) {
//
//    }
//    @Then("user click en log in button")
//    public void user_click_en_log_in_button(DataTable dataTable) {
//        homePage.logIn();
//    }
//    //scenario #2
//    @Given("I click log in")
//    public void i_click_log_in() {
//        driver.findElement(By.xpath("/html/body/div[2]/div/nav/div/ul[2]/li/a")).click();
//    }
//    @Then("I click register")
//    public void i_click_register() {
//        homePage.clickRegister();
//    }
//    @Then("I enter \"(.*)\" and \"(.*)\" and \"(.*)\" and\"(.*)\"")
//    public void i_enter_and_and_and_and(String MemberID,String FirstName,String lastName,String zipcode) {
//        driver.findElement(By.xpath(webElementMemberID)).sendKeys(MemberID);
//        driver.findElement(By.xpath(webElementFirstName)).sendKeys(FirstName);
//        driver.findElement(By.xpath(webElementLastName)).sendKeys(lastName);
//        driver.findElement(By.xpath(webElementZipCode)).sendKeys(zipcode);
//    }
//    @Then("I click continue")
//    public void i_click_continue() {
//        homePage.clickContinue();
//    }
//    //scenario #3
//    @Then("I click login")
//    public void i_click_login() {
//        driver.findElement(By.xpath("//*[@id=\"content_section_tabs_panel_1\"]/div/div/div[1]/div/div[1]/div[2]/form/input")).click();
//    }
//    @Then("I enter \"(.*)\" and \"(.*)\"")
//    public void i_enter_and(String username, String password) {
//        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
//        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
//    }
//    @Then("I click enter")
//    public void i_click_enter() {
//        homePage.clickContinue();
//    }
////*********************************************************************
//
//    @Given("I am on aetna home page1")
//    public void i_am_on_aetna_home_page1() throws IOException{
//        openBrowser();
//    }
//    @Then("I click on member support")
//    public void i_click_on_member_support() {
//        driver.findElement(By.xpath(webElementMemberSupport)).click();
//    }
//    @Then("I click on account management")
//    public void i_click_on_account_management() {
//        driver.findElement(By.xpath(webElementAccountManagement)).click();
//    }
//    @Then("Iclick on get your id")
//    public void iclick_on_get_your_id() {
//        driver.findElement(By.xpath(webElementGetYourID)).click();
//    }
//    @Then("I enter VARIABLE {string} and {string}")
//    public void i_enter_variable_and(String username, String password) {
//        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
//        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
//    }
//    @Then("I click enter to continue")
//    public void i_click_enter_to_continue() {
//        driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();
//    }
//    //#####################################################################
//    @Given("I am on aetna home page2")
//    public void i_am_on_aetna_home_page2()throws IOException {
//        openBrowser();
//    }
//    @Then("I click on login1 and i scroll down")
//    public void i_click_on_login1_and_i_scroll_down() {
//        driver.findElement(By.xpath(webElementLog)).click();
//
//        ((JavascriptExecutor)driver).executeScript("scroll(0,500)");
//    }
//    @Then("I click on contact member service")
//    public void i_click_on_contact_member_service() {
//        driver.findElement(By.xpath(webElementMemberService)).click();
//
//        ((JavascriptExecutor)driver).executeScript("scroll(0,500)");
//    }
//    @Then("I file {string} and {string} and click yesOrNo and {string}")
//    public void i_file_and_and_click_yes_or_no_and(String LastName, String FirstName, String email) {
//        driver.findElement(By.xpath(webElementLN)).sendKeys(LastName);
//        driver.findElement(By.xpath(webElementFN)).sendKeys(FirstName);
//        driver.findElement(By.xpath(webElementNO)).click();
//        driver.findElement(By.xpath(webElementClickEmail)).click();
//        driver.findElement(By.xpath(webElementEmail)).sendKeys(email);
//        driver.findElement(By.xpath(webElementTryEmail)).sendKeys(email);
//        //driver.findElement(By.xpath("//*[@id=\"buttonText\"]")).click();
//    }
//    //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
//    @Then("I click find a pharmacist")
//    public void i_click_find_a_pharmacist() {
//        driver.findElement(By.xpath(webElementPharmacist)).click();
//    }
//    //scenario 7
//    @Then("I click on employer")
//    public void i_click_on_employer() {
//        driver.findElement(By.xpath(webElementEmployer)).click();
//    }
//    @Then("I try to log in")
//    public void i_try_to_log_in( DataTable dataTable) {
//        List<List<String>> data = dataTable.asList(String.class);
//
//        for (int i = 0; i < data.size(); i++) {
//            driver.findElement(By.xpath(webElementusername2)).sendKeys(data.get(i).get(0));
//            driver.findElement(By.xpath(webElementPassWord2)).sendKeys(data.get(i).get(1));
//        }
//    }
//    @Then("I log in")
//    public void i_log_in() {
//        driver.findElement(By.xpath(webElementLogInEmployer)).click();
//    }
//    //scenario #8
//    @Given("I click search")
//    public void i_click_search() {
//        driver.findElement(By.xpath(webElementSearch)) .click();
//    }
//
//    @Then("I send word to seach")
//    public void i_send_word_to_seach(DataTable dataTable) {
//        List<Map<String,String>> data1=dataTable.asMaps(String.class,String.class);
//        for (int i = 0; i < data1.size(); i++) {
//            driver.findElement(By.xpath(webElementSearch1)).sendKeys(data1.get(i).get("deantist"));
//        }
//
//    }

}
