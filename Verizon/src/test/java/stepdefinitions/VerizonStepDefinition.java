package stepdefinitions;

import common.WebAPI;

import verizonHome.VerizonWebElements;
import verizonHome.VerizonWebElements.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class VerizonStepDefinition extends WebAPI {
    VerizonWebElements verizonWebElements ;

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
//
//    @BeforeStep
//    public static void getInit() {
//        verizonWebElements = PageFactory.initElements(driver, VerizonWebElements.class);
//    }



}
