package chaseheaderBar;

//import jdk.swing.interop.SwingInterOpUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import common.WebAPI;
import org.testng.Assert;


import java.util.concurrent.TimeUnit;

import static chaseheaderBar.ChaseHeaderBarWebElements.*;

public class ChaseHeaderBar extends WebAPI {
    //Main JS Executor
    public void jsFooter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,9000)");
    }

    public void timer(int time) {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    //AM-1
    @FindBy(className = chaseLogoClassName)
    public WebElement ChaseLogo;

    public void chaseLogoACT() {
        boolean logoPresent = ChaseLogo.isDisplayed();
        if (logoPresent == true)
            System.out.println("Logo is displayed :  TC Passed");
        else System.out.println("Logo is not dispalyed:  TC Failed");
    }

    //AM-2
    @FindBy(xpath = hoverOverXpath)
    public WebElement hoverOver;

    public void hoverOverHeader() {
        Actions actions = new Actions(driver);
        timer(3);
        actions.moveToElement(hoverOver).perform();
        timer(3);

    }

    @FindBy(xpath = WebElementCheckingAccount)
    public WebElement ChekingAccH;

    public void chekingAccACT() {
        hoverOverHeader();
        ChekingAccH.click();
    }

    @FindBy(xpath = WebElementCreditCards)
    public WebElement CreditCardsH;

    public void creditCardsACT() {
        hoverOverHeader();
        timer(3);
        CreditCardsH.click();
    }

    @FindBy(xpath = webElementSavingAccount)
    public WebElement SavingAccH;

    public void savingAccountACT() {
        hoverOverHeader();
        timer(3);
        SavingAccH.click();
    }

    @FindBy(xpath = WebElementCds)
    public WebElement CDsOnHeader;

    public void cDsOnHeaderACT() {
        hoverOverHeader();
        timer(3);
        CDsOnHeader.click();
    }

    @FindBy(xpath = WebElementBuyingCar)
    public WebElement BuyingCar;

    public void buyingCarACT() {
        hoverOverHeader();
        timer(3);
        BuyingCar.click();
    }

    @FindBy(xpath = WebElementMortgage)
    public WebElement MortgageH;

    public void mortgageHACT() {
        hoverOverHeader();
        timer(3);
        MortgageH.click();
    }

    @FindBy(xpath = WebElementInvesting)
    public WebElement InvestingH;

    public void investingACT() {
        hoverOverHeader();
        timer(3);
        InvestingH.click();
    }

    @FindBy(xpath = WebElementChasForBusiness)
    public WebElement ChaseForBusiness;

    public void chaseForBusinessACT() {
        hoverOverHeader();
        timer(3);
        ChaseForBusiness.click();
    }

    @FindBy(xpath = WebElementCommercial)
    public WebElement ComercialH;

    public void commercialACT() {
        hoverOverHeader();
        timer(3);
        ComercialH.click();
    }

    @FindBy(xpath = WebElementSel)
    public WebElement SellOnHeader;

    public void sellOnHeaderACT() {
        hoverOverHeader();
        timer(3);
        SellOnHeader.click();
    }
    @FindBy(xpath = WebElemetAtmBranchXpath)
    public WebElement AtmANBranchH;
    @FindBy(xpath = WebElementSearchUnderATMBrXpath)
    public WebElement SearchAtmANBranchH;
    public void atmANBranchHACT() {
        hoverOverHeader();
        timer(3);
        AtmANBranchH.click();
        SearchAtmANBranchH.sendKeys("75013");
        SearchAtmANBranchH.submit();
    }//Val

    public void atmANBranchVAl(){
        timer(4);
        String actualTitle=driver.getCurrentUrl();
        String expectedTitle="https://locator.chase.com/search?q=75013";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @FindBy(xpath = WebElemetSearchIconXp)
    public WebElement SearchIcon;
    @FindBy(className = WebElemetSearchSendClassName)
    public WebElement SearchIconSend;

    public void searchIconAct(){
        SearchIcon.click();
        SearchIconSend.sendKeys("open account");
        SearchIconSend.submit();
    }
    public void searchIconVal(){
        timer(2);
        String actualTitle=driver.getCurrentUrl();
        String expectedTitle="https://www.chase.com/digital/resources/search-results.html?q=open%20account&site=cfsAll";
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    public void atmANBranchResultACT() {
        hoverOverHeader();
        timer(3);
        AtmANBranchH.click();
        SearchAtmANBranchH.sendKeys("75013");
        SearchAtmANBranchH.submit();
    }//Val
    @FindBy(xpath = WebElemetMcdermontAnAlmaXpath)public WebElement McdermontAndAlmaAtmSearch;
    public void atmANBranchResultVAl(){
        timer(4);
        String actualText= McdermontAndAlmaAtmSearch.getText();
        String expectedText="McDermott and Alma";
        Assert.assertEquals(actualText,expectedText);
    }
    @FindBy(xpath = WebElementNextButtonOnSearchXpath) public WebElement NextButtonOnSearch;
    //serachIcon
    public void searchIconOpenAccVal(){
        timer(2);
        boolean buttonDisplayed = NextButtonOnSearch.isDisplayed();
        if (buttonDisplayed == true)
            System.out.println("Button is displayed Many serach pages available :  TC Passed");
        else System.out.println("Button is not dispalyed:  TC Failed");
    }


}
