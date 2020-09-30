package footerEbayTest;

import common.WebAPI;
import footerEbay.BuyCategory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static footerEbay.BuyCategoryWebElement.webElementYourEbayAcountTextXpath;

public class BuyCategoryTest extends WebAPI  {
   BuyCategory buyCategory;

    @BeforeMethod
    public void getInit() {
        buyCategory = PageFactory.initElements(driver,BuyCategory.class);
//        registrationPage = PageFactory.initElements(driver,RegistrationPage.class);
    }
    //TC-1/
    @Test(timeOut = 7000)
    public void buyLinkTest(){
        buyCategory.buyLinkAction();
    //validation
      String expectedResult= driver.getTitle();
      String actualResul="Shop by Category | eBay";
       Assert.assertEquals(expectedResult,actualResul);
    }
    //TC-2/
    @Test(timeOut = 7000)
    public void healthAndBeatyLinkTest()  {
        buyCategory.healthAndBeatyAct();
    }
    //TC-3/
    @Test(timeOut = 11000)
    public void SellLInkActTest()  {
        buyCategory.sellLInkAct();
    }
    //Tc-4/
    @Test()
    public void moneyBackGuarenteeTest(){
    buyCategory.moneyBackGuarenteeAct();
    }
    //TC-5/
    @Test()
    public void biddinAndBuyingTest (){
        buyCategory.biddinAndBuyingAct();
    }
    //Tc-6/
    @Test()
    public void ebayCompaniesLinkTest(){
        buyCategory.ebayCompaniesLinkAct();
        buyCategory.timer(5);
       Assert.assertEquals(driver.getTitle(),driver.getTitle());
    }
    //Tc-7/
    @Test()
    public void policiesLinkTest(){
        buyCategory.policiesLinkAct();
    }
    //TC-8/
    @Test()
    public void copyrightTest(){
        buyCategory.copyrightAct();
    }
    //TC-9/
    @Test()
    public void languageSelectTest(){
        buyCategory.languageSelectAct();
    }
    //TC-10/
    @Test()
    public void countrySelectHKTest(){
        buyCategory.countrySelectHonkKongAct();
    }
    //TC-11/
    @Test()
    public void collectibleArtTest(){
        buyCategory.collectibelAndArtSideAct();
    }
    //TC-12/
    @Test()
    public void northonIdTest(){
        buyCategory.northonSAct();
    }
    //Tc-13/
    @Test()
    public void communityLinkTest(){
        buyCategory.communityLinkAct();
    }
    //Tc-14/
    @Test()
    public void communitySearchBox(){
        buyCategory.communitySearchAct();
    }
    //TC-15/
    @Test
    public void communitySearchDropSellerNewsTest(){
        buyCategory.communitySeachDropLocationAct();
    }
    //TC-16
    @Test
    public void StoreLinkTest(){
        buyCategory.storeLinkAct();
        //validation
        String actualUrl= getCurrentPageUrl();
       String expectedUrl = "https://www.ebay.com/b/Stores-HUB/bn_7004224522";
       Assert.assertEquals(actualUrl,expectedUrl);
    }
    //TC-17
    @Test
    public void registrationTest(){
        buyCategory.registrationAct();
        buyCategory.registrationVal();
    }
    //TC-18
    @Test
    public void settingUpAcctUnderRegTest(){
        buyCategory.settingUpAccountRegAct();
        buyCategory.settingUpAccountRegVal();
    }
    //TC-19
    @Test
    public void signUpForAnAccTest(){
        buyCategory.setCreateAccUndRegiterAct();
        buyCategory.setCreateAccUndRegiterVal();
    }
    //TC-20
    @Test
    public void sendKeysToSignUpTest(){
        buyCategory.signUpInfoACT();
    }

}
