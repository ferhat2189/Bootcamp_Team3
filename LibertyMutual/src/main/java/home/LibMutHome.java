package home;
import common.WebAPI;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static home.LibMutWebElements.*;
public class LibMutHome extends WebAPI {
    String expectedResult;

    @FindBy(xpath = webElementCustomerSupportButton)
    public WebElement CustomerSupportButton;
    @FindBy(xpath = webElementCustomerSupportText)
    public WebElement CustomerSupportText;

    @FindBy(xpath = webElementCovidSupportButton)
    public WebElement CustomerCovidSupportButton;
    @FindBy(xpath = webElementCovidSupportText)
    public WebElement CustomerCovidSupportText;

    @FindBy(xpath = webElementFrequentlyAskedQuestionsButton)
    public WebElement FrequentlyAskedQuestionsButton;
    @FindBy(xpath = webElementFrequentlyAskedQuestionsText)
    public WebElement FrequentlyAskedQuestionsText;

    @FindBy(xpath = webElementManageYourPolicyButton)
    public WebElement ManageYourPolicyButton;
    @FindBy(xpath = webElementManageYourPolicyText)
    public WebElement ManageYourPolicyText;

    @FindBy(xpath = webElementBillingPaymentOptionsButton)
    public WebElement BillingPaymentOptionsButton;
    @FindBy(xpath = webElementBillingPaymentOptionsText)
    public WebElement BillingPaymentOptionsText;


    public void customerSupportButtonCheck() {
        CustomerSupportButton.click();
    }


    public void validateCustomerSupportText() {
        String actualResult = CustomerSupportText.getText();
        expectedResult = "Get answers";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    public void customerCovidSupportButtonCheck() {
//CustomerSupportButton.click();
        CustomerCovidSupportButton.click();
    }


    public void validateCustomerCovidSupportText() {
        String actualResult = CustomerCovidSupportText.getText();
        expectedResult = "Our continued commitment to customers during coronavirus";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }


    public void frequentlyAskedQuestionsButtonCheck() {
//CustomerSupportButton.click();
        FrequentlyAskedQuestionsButton.click();
    }
}
