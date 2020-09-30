package footerEbay;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


import java.util.concurrent.TimeUnit;

import static footerEbay.BuyCategoryWebElement.*;

public class BuyCategory extends WebAPI {
    //AM-1
    @FindBy(how = How.XPATH,using = webElementBuyXpath ) public WebElement Buylink;
    //AM-2
    @FindBy(how = How.XPATH,using = webElementHealthBeautyXpath) public WebElement H_Beautylink;
    @FindBy(how = How.XPATH,using = webElementHealthBeautyTextXpath) public WebElement H_BeautylinkText;
    //AM-3
    @FindBy(how = How.XPATH,using = webElementSellLinkXpath) public WebElement SellLInk;
    //AM-4
    @FindBy(how = How.LINK_TEXT,using = webElementMoneyBackGarLinkText) public WebElement MoneyB_Guaranty;
    //AM-5
    @FindBy(how = How.LINK_TEXT,using = webElementBiddingAndBuyingLinkText) public WebElement BiddingAndBuying;
    @FindBy(how = How.XPATH,using = webElementBuyingItemsXpath) public WebElement BuyingItems;
    //AM-6
    @FindBy(how = How.XPATH,using = webElementAboutEbayXpath) public WebElement AboutEbayLink;
    //AM-7
    @FindBy(how = How.XPATH,using = webElementPoliciesXpath) public WebElement PoliciesLink;
    @FindBy(how = How.ID,using = webElementPoliciesTextID) public WebElement PoliciesTextId;
    //AM-8
    @FindBy(how = How.CLASS_NAME,using = webElementCopyrightClassName) public WebElement Copyright;
    //Am-9
    @FindBy(how = How.ID,using = webElementCountryId) public WebElement CountrySelect;
    @FindBy(how = How.XPATH,using = webElementTurkeyCXpath) public WebElement CountrySelectTurkey;
   //AM-10
    @FindBy(how = How.XPATH,using = webElementHongKongXpath) public WebElement CountrySelectHonkKong;
    //Am-11
    @FindBy(how = How.CSS,using = webElementCollectibleAndArtSideCss) public WebElement ColectibleArt;
    //AM-12
    @FindBy(how = How.ID,using = webElementNorthonId) public WebElement NorthonId;
    //AM-13
    @FindBy(how = How.XPATH,using = webElementCommunityLinkXpath) public WebElement CommunityLink;
    //AM-14
    @FindBy(how = How.ID,using = webElementCommunitySearchId) public WebElement CommunitySearchBox;
    //Am-15
    @FindBy(how = How.XPATH,using = webElementCommunitySearchLocationDropXpath) public WebElement CommunityLocationDrop;
    @FindBy(how = How.CSS,using = webElementCommunitySearchLocationDropSellerID) public WebElement CommunityLocationDropSeller;





    //Main JS Executor
    public void jsFooter(){
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("scrollBy(0,9000)");
    }
    public void timer(int time){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    //AM-1
    public void buyLinkAction(){
        jsFooter();
        timer(4);
        Buylink.click();
    }
    //AM-2
    public void healthAndBeatyAct()  {
        buyLinkAction();
        timer(3);
        H_Beautylink.click();
    }
    //AM-3
    public void sellLInkAct()  {
        jsFooter();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        SellLInk.click();
    }
    //AM-4
    public void moneyBackGuarenteeAct(){
        jsFooter();
        MoneyB_Guaranty.click();
    }
    //AM-5
    public void biddinAndBuyingAct(){
        jsFooter();
        BiddingAndBuying.click();
        BuyingItems.click();
    }
    //AM-6
    public void ebayCompaniesLinkAct(){
        jsFooter();
        timer(2);
        AboutEbayLink.click();
    }
    //AM-7
    public void policiesLinkAct(){
        jsFooter();
        timer(4);
        PoliciesLink.click();
        PoliciesTextId.getText();
    }
    //AM-8
    public void copyrightAct(){
        jsFooter();
        timer(5);
        String CopyrightText=Copyright.getText();
    }
    //AM-9
    public void languageSelectAct(){
        jsFooter();
        timer(4);
        CountrySelect.click();
        CountrySelectTurkey.click();
    }
    //AM-10
    public void countrySelectHonkKongAct(){
        jsFooter();
        timer(4);
        CountrySelect.click();
        CountrySelectHonkKong.click();
    }
    //AM-11
    public void collectibelAndArtSideAct(){
        jsFooter();
        timer(4);
        Buylink.click();
        ColectibleArt.click();
    }
    //AM-12
    public void northonSAct(){
        jsFooter();
        timer(4);
        NorthonId.click();
        driver.getTitle();
    }
    //Am-13
    public void communityLinkAct(){
        jsFooter();
        timer(3);
        CommunityLink.click();
    }
    //Am-14
    public void communitySearchAct(){
        communityLinkAct();
        timer(3);
        CommunitySearchBox.sendKeys("Seller Links");
        CommunitySearchBox.submit();
    }
    //Am-15
    public void communitySeachDropLocationAct(){
        communitySearchAct();
        timer(5);
        CommunityLocationDrop.click();
   //     timer(5);
   //     jsFooter();
//        CommunityLocationDropSeller.click();
    }

    //Am-16
    @FindBy(linkText = webElementStoreLinkLText) public WebElement StoreLinkUnderBuy;
    public void storeLinkAct(){
        StoreLinkUnderBuy.click();
    }
    //Am-17
    @FindBy(xpath = webElementRegistrationLinkXpath) public WebElement RegistrationLink;
    @FindBy(xpath = webElementYourEbayAcountTextXpath) public WebElement YourEbayAccText;

    public void registrationAct(){
        RegistrationLink.click();

    }
    //Validation
    public void registrationVal(){
        String actualText= YourEbayAccText.getText();
        String expectedText= "Your eBay account";
        Assert.assertEquals(actualText,expectedText);
    }
    //AM-18
    @FindBy(xpath = webElementSettingUpAccRegistrationXpath) public WebElement SetingUpAccUndReg;
    @FindBy(xpath = signInToYAccUndRegistrationXpath) public WebElement signInUnderRegister;
    public void settingUpAccountRegAct(){
        registrationAct();
        timer(3);
        signInUnderRegister.click();
    }
    //Validation
    @FindBy(xpath = singInToAccTextXpath) public WebElement singToAccText;
    public void settingUpAccountRegVal(){
    String actualText= singToAccText.getText();
    String expectedText= "Signing in to your account";
    Assert.assertEquals(actualText,expectedText);
    }
    //TC-19
    @FindBy(css = creatAnAccUderRegisterCSS) public WebElement createAccUndRegister;
    @FindBy(xpath = SignUpForAccButtonUderRegXpath) public WebElement signUpforAccButton;

    public void setCreateAccUndRegiterAct(){
        settingUpAccountRegAct();
        createAccUndRegister.click();
        signUpforAccButton.click();
    }
    //Validation

  //  @FindBy(css = signInToYAccUndRegistrationXpath) public WebElement signUpforAccButton1;
    public void setCreateAccUndRegiterVal(){
    String actualTitle= driver.getTitle();
    String expectedTitle= "Register";
    Assert.assertEquals(actualTitle,expectedTitle);
    }
    //TC-20
    @FindBy(xpath = firstNameXpath) public WebElement FirstNameUderRegister;
    @FindBy(xpath = lastNameXpath) public WebElement LastNameUnderRegister;
    @FindBy(xpath = emailUnderRegiXpath) public WebElement EmailUnderRegister;
    @FindBy(xpath = passwordUnderRegiXpath) public WebElement PasswordUnderRegister;
    @FindBy(id = createAccButtonID) public WebElement CreateButton;

    public void signUpInfoACT(){
        setCreateAccUndRegiterAct();
        timer(10);
        FirstNameUderRegister.sendKeys("Fer");
        LastNameUnderRegister.sendKeys("Bel");
        EmailUnderRegister.sendKeys("bell@gmail.com");
        PasswordUnderRegister.sendKeys("aaa123$");
        CreateButton.click();
    }
}
