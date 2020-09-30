package stepdefinitions;

import common.WebAPI;
import home.LibMutHome;
import io.cucumber.java.*;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LibMutStepDefinitions extends WebAPI {

    static LibMutHome libMutHome;


    //Cucumber Hook
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
// Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","Demo1"); // ... and embed it in the report.
        }
        cleanUp();
    }

// @After
// public void closeBrowser(){
// cleanUp();
// }

    @BeforeStep
    public static void getInit() {
        libMutHome = PageFactory.initElements(driver,LibMutHome.class);
    }


    //1st Scenario
    @Given("I am in LibertyMutual homepage")
    public void i_am_in_liberty_mutual_homepage() {
        try {
            libMutHome.openBrowser();
        }
        catch(Exception exception) {getInit();}

    }

    @And("I click on Customer Support Button")
    public void i_click_on_customer_support_button() {
        libMutHome.customerSupportButtonCheck();
    }

    @Then("I verify Customer Support is appear properly")
    public void i_verify_customer_support_is_appear_properly() {
        libMutHome.validateCustomerSupportText();
    }

    @And("I verify page title as Customer Support")
    public void i_verify_page_title_as_customer_support() {
        String expectedTitle="Save Money with a Free Insurance Quote from Liberty Mutual | Liberty Mutual";
        String actualTitle= driver.getTitle().toString();
        Assert.assertEquals("Title does not match",actualTitle,expectedTitle);
    }


    //2nd Scenario
    @And("I click on Covid support Button")
    public void i_click_on_covid_support_button() {
        libMutHome.customerCovidSupportButtonCheck();
    }

    @Then("I verify Covid support is appear properly")
    public void i_verify_covid_support_is_appear_properly() {
        libMutHome.validateCustomerCovidSupportText();
    }

    @And("I verify page title as Covid support Support")
    public void i_verify_page_title_as_covid_support_support() {
        String expectedTitle="COVID-19 | Liberty Mutual";
        String actualTitle= driver.getTitle().toString();
        Assert.assertEquals("Title does not match",actualTitle,expectedTitle);

    }
}
