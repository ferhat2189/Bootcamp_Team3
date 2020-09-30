package ferAetna;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static ferAetna.FerAetnaWebElements.*;
public class FerAetna extends WebAPI {

    public void jsFooter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,9000)");
    }

    public void timer(int time) {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }


    @FindBy(xpath = aetnaLogoXpath)
    public WebElement Logo;
    public void aetnaLogoIsDisplay(){
        Logo.isDisplayed();
        System.out.println("Aetna Logo is displayed : "+ Logo.isDisplayed());
    }

    @FindBy(xpath = keepUpWithYourCareXpath)
    public WebElement kUpWYourCare;
    public void keepUpWYourCareBAct(){
        kUpWYourCare.click();
    }

    @FindBy(xpath = keepUpWithYourCareTXpath)
    public WebElement kUpWYourCareT;
    public void keepUpWYourCareBVAl(String expectedResult){
        String actualResult= kUpWYourCareT.getText();
        Assert.assertEquals(actualResult,expectedResult,"Text do not match");
    }
    @FindBy(xpath = aetnaMedicareXpath)
    public WebElement Medicare;
    @FindBy(xpath = viewPlansXpath)
    public WebElement VPlans;
    public void MedButtAct(){
        Medicare.click();
        VPlans.click();
    }
    public void MedButtVal(){
        Assert.assertEquals("Aetna Medicare | Medicare Advantage, Part D & Supplement Plans", driver.getTitle());
    }
    @FindBy(xpath = shopForAPlanXpath)
    public WebElement ShopPlan;
    public void shopFAPlanButtAct() {
        ShopPlan.click();
        timer(5);
        Medicare.click();
    }

    public void shopFAPlanVal(){
        Assert.assertEquals( "Aetna Medicare | Medicare Advantage, Part D & Supplement Plans",driver.getTitle());
    }
    @FindBy(xpath = memberSupportXpath)
    public WebElement memberSupport;
    public void memberSupportButtAct()  {
        memberSupport.sendKeys(Keys.RETURN);
        timer(3);
    }
    public void memberSuppButtVal(){
        Assert.assertEquals("Individual & Family Health Insurance Plans | Aetna",driver.getTitle());
    }
    @FindBy(xpath = findADoctorXpath)
    public WebElement findADoctor;

    @FindBy(xpath = findADoctorLogoXpath)
    public WebElement findADoctorLogo;

    public void findDocButtAct()  {
        findADoctor.click();
        findADoctorLogo.click();
    }
    @FindBy(xpath = secureMemberLogInTXpath)
    public WebElement secureMemberLogInText;
    public void findADocButtVal(String expectedResult){
        String actualResult=secureMemberLogInText.getText();
        Assert.assertEquals(actualResult,expectedResult,"Text do not match.");
    }
}



