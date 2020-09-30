package foxnewsAll;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

import static foxnewsAll.FoxNewsAllWebElements.*;

public class FoxNewsAll  extends WebAPI {

    //Main JS Executor
    public void jsFooter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,2000)");
    }
    public void implicitWait(int time) {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @FindBy(xpath = WebElementLogoXpath) public WebElement FXLogo;
    public void logoFXDisplay(){
        boolean logoPresent = FXLogo.isDisplayed();
        if (logoPresent == true)
            System.out.println("Logo is displayed :  TC Passed");
        else System.out.println("Logo is not dispalyed:  TC Failed");
    }
    @FindBy(xpath = WebElemetUsXpath) public WebElement UsLinkH;
    @FindBy(xpath = WebElemetWorldXpath) public WebElement WorldLinkH;

    public void headerNavBackACT(){
        UsLinkH.click();
        navigateBack();
        implicitWait(3);
        WorldLinkH.click();
    }
    public void headerNavBackVal(){
        implicitWait(5);
        String actualUrl=driver.getCurrentUrl();
        implicitWait(1);
        String expectedUrl="https://www.foxnews.com/world";
        Assert.assertEquals(actualUrl,expectedUrl);
    }
    @FindBy(xpath = WebElemetOpinionXpath)public WebElement Oppinion;
    public void oppinionAct(){
        Oppinion.click();
    }
    @FindBy(xpath=WebElemetOpinionGetTextXpath)public WebElement OppinionText;
    public void oppinionVal(){
        implicitWait(2);
        String actualText=OppinionText.getText();
        String expectedText="Opinion";
        Assert.assertEquals(actualText,expectedText);
    }
    @FindBy(xpath = WebElemetFacebookXpath)public WebElement FacebookFooter;
    public void facebookLinkAct(){
        jsFooter();
        implicitWait(4);
        FacebookFooter.click();
    }
    public void facebookLinkVal(){
        implicitWait(6);
        String actualURL=driver.getCurrentUrl();
        implicitWait(1);
        String expectedURL="https://www.facebook.com/FoxNews";
        Assert.assertEquals(actualURL,expectedURL);
    }

    @FindBy(xpath = WebElemetTwitterXpath)public WebElement TwitterFooter;
    public void twitterLinkAct(){
        jsFooter();
        implicitWait(3);
        TwitterFooter.click();
    }
    public void twitterLinkVal(){
        implicitWait(7);
        String actualURL=driver.getCurrentUrl();
        implicitWait(1);
        String expectedURL="https://twitter.com/foxnews";
        Assert.assertEquals(actualURL,expectedURL);
    }
    @FindBy(xpath = WebElemetFlipboardXpath)public WebElement FlipboardFooter;
    public void flipBoardLinkAct(){
        jsFooter();
        implicitWait(2);
        FlipboardFooter.click();
    }
    public void flipBoardLinkVal(){
        implicitWait(7);
        String actualURL=driver.getCurrentUrl();
        implicitWait(1);
        String expectedURL="https://flipboard.com/@FoxNews";
        Assert.assertEquals(actualURL,expectedURL);
    }
    @FindBy(xpath = WebElemetGoogleXpath)public WebElement GooglePlusFooter;
    public void googleLinkAct(){
        jsFooter();
        implicitWait(3);
        GooglePlusFooter.click();
    }
    public void googleLinkVal(){
        implicitWait(8);
        String actualURL=driver.getCurrentUrl();
        implicitWait(1);
        String expectedURL="https://www.google.com/+FoxNews";
        Assert.assertEquals(actualURL,expectedURL);
    }

    @FindBy(xpath = WebElemetInstagramXpath)public WebElement InstagramFooter;
    public void instagramLinkAct(){
        jsFooter();
        implicitWait(3);
        InstagramFooter.click();
    }
    public void instagramLinkVal(){
        implicitWait(7);
        String actualURL=driver.getCurrentUrl();
        implicitWait(1);
        String expectedURL="https://www.instagram.com/foxnews/";
        Assert.assertEquals(actualURL,expectedURL);
    }

    @FindBy(xpath = WebElemetRssXpath)public WebElement RssFooter;
    public void rssLinkAct(){
        jsFooter();
        implicitWait(3);
        RssFooter.click();
    }
    public void rssLinkVal(){
        implicitWait(8);
        String actualURL=driver.getCurrentUrl();
        implicitWait(1);
        String expectedURL="https://www.foxnews.com/about/rss/";
        Assert.assertEquals(actualURL,expectedURL);
    }
    @FindBy(xpath = WebElemetEmailXpath)public WebElement EmailFooter;
    public void emailLinkAct(){
        jsFooter();
        implicitWait(3);
        EmailFooter.click();
    }
    public void emailLinkVal(){
        implicitWait(7);
        String actualURL=driver.getCurrentUrl();
        implicitWait(1);
        String expectedURL="https://www.foxnews.com/newsletters";
        Assert.assertEquals(actualURL,expectedURL);
    }
    @FindBy(xpath = WebElemetXpathPolitics) public WebElement PoliticsLink;
    @FindBy(xpath =WebElemetXpathBusiness ) public WebElement BusinessLink;

    public void headersLinkAct(){
        PoliticsLink.click();
        navigateBack();
        implicitWait(3);
        BusinessLink.click();
        implicitWait(3);
    }
    public void headersLinkVal(){
        implicitWait(6);
        String actualURL=driver.getCurrentUrl();
        implicitWait(1);
        String expectedURL="https://www.foxbusiness.com/";
        Assert.assertEquals(actualURL,expectedURL);
    }

    public void getPageSrc(){
        System.out.println(driver.getPageSource());
    }
    @FindBy(xpath = WebElemetXpathEntertainment) public WebElement EntertainmentLink;
    public void switchLinkAct(){
        EntertainmentLink.click();
        implicitWait(3);
        driver.navigate().to("https://twitter.com/foxnews");
    }
    public void switchLinkVal(){
        implicitWait(7);
        String actualURL=driver.getCurrentUrl();
        implicitWait(1);
        String expectedURL="https://twitter.com/foxnews";
        Assert.assertEquals(actualURL,expectedURL);
    }
    @FindBy(xpath = WebElemetXpathLifestyle)public WebElement LifestyleLink;
    @FindBy(xpath = imageClickXpath)public WebElement ClickOnImage;

    public void LifestyleLInkAct(){
        LifestyleLink.click();
        implicitWait(4);
        ClickOnImage.click();
    }
    public void LifestyleLInkVal(){
       implicitWait(20);
       //waiting for video to play
    }
    @FindBy(xpath = WebElemetWatchLiveXpath )public WebElement WatchLiveLink;
    public void watchLiveLinkAct(){
        jsFooter();
        implicitWait(2);
        WatchLiveLink.click();

    }
    public void watchLiveLinkVal(){
        implicitWait(7);
        String actualURL=driver.getCurrentUrl();
        implicitWait(1);
        String expectedURL = WatchLiveTitle;
        Assert.assertEquals(actualURL,expectedURL);
    }


                //////////
    public void validateInnovationButton() {
        boolean imagePresent= driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[1]/div[2]/section/header/div/picture/img")).isDisplayed();
        System.out.println(imagePresent);
        boolean expected = true;
        Assert.assertEquals(imagePresent,expected);
    }

    @FindBy(xpath = WebElemetScienceXpath )public WebElement scienceLink;
    public void scienceLInkAct(){
        jsFooter();
        scienceLink.click();
        implicitWait(4);

    }
    public void scienceLInkVal(){
        implicitWait(7);
        String actualURL=driver.getCurrentUrl();
        implicitWait(1);
        String expectedURL="https://www.foxnews.com/science";
        Assert.assertEquals(actualURL,expectedURL);
    }
    @FindBy(xpath = WebElemetTechXpath )public WebElement TechLink;
    public void techLInkAct(){
        jsFooter();
        implicitWait(2);
        TechLink.click();


    }
    public void techLInkVal(){
        implicitWait(8);
        String actualURL=driver.getCurrentUrl();
        implicitWait(1);
        String expectedURL="https://www.foxnews.com/tech";
        Assert.assertEquals(actualURL,expectedURL);
    }

    @FindBy(xpath = WebElemetHealthXpath )public WebElement HealthLink;
    public void healthLInkAct(){
        jsFooter();
        implicitWait(2);
        HealthLink.click();


    }
    public void healthLInkVal(){
        implicitWait(8);
        String actualURL=driver.getCurrentUrl();
        implicitWait(1);
        String expectedURL="https://www.foxnews.com/health";
        Assert.assertEquals(actualURL,expectedURL);
    }

    @FindBy(xpath = WebElemetNaturalScienceXpath )public WebElement NaturalScienceLink;
    public void naturalScienceLInkAct(){
        jsFooter();
        implicitWait(3);
        NaturalScienceLink.click();


    }
    public void naturalScienceLInkVal(){
        implicitWait(7);
        String actualURL=driver.getCurrentUrl();
        implicitWait(1);
        String expectedURL="https://www.foxnews.com/category/science/natural-science";
        Assert.assertEquals(actualURL,expectedURL);
    }

    @FindBy(xpath = WebElemetCoronavirusXpath )public WebElement CoronavirusLink;
    public void coronavirusLInkAct(){
        jsFooter();
        implicitWait(3);
        CoronavirusLink.click();
    }
    public void coronavirusLInkVal(){
        implicitWait(8);
        String actualURL=driver.getCurrentUrl();
        implicitWait(1);
        String expectedURL="https://www.foxnews.com/category/health/infectious-disease/coronavirus";
        Assert.assertEquals(actualURL,expectedURL);
    }

    @FindBy(xpath = WebElemetInnovationXpath )public WebElement InnovationLink;
    public void innovationLinkAct(){
        jsFooter();
        implicitWait(3);
        InnovationLink.click();

    }
    public void innovationLinkVal(){
        implicitWait(9);
        String actualURL=driver.getCurrentUrl();
        implicitWait(1);
        String expectedURL="https://www.foxnews.com/category/tech/topics/innovation";
        Assert.assertEquals(actualURL,expectedURL);
    }
    @FindBy(xpath = WebElemetCareersXpath )public WebElement CareersLink;
    public void careersLinkAct(){
        jsFooter();
        implicitWait(3);
        CareersLink.click();

    }
    public void careersLinkVal(){
        implicitWait(7);
        String actualURL=driver.getCurrentUrl();
        implicitWait(1);
        String expectedURL = CareerTitle;
        Assert.assertEquals(actualURL,expectedURL);
    }
    @FindBy(xpath = WebElemetArchaeologyXpath )public WebElement ArchaeologyLink;
    public void archaeologyAct(){
        jsFooter();
        implicitWait(4);
        ArchaeologyLink.click();

    }
    public void archaeologyVal(){
        implicitWait(8);
        String actualURL=driver.getCurrentUrl();
        implicitWait(1);
        String expectedURL = ArchaeologyTitle;
        Assert.assertEquals(actualURL,expectedURL);
    }
    @FindBy(xpath = WebElemetVideoGamesXpath )public WebElement VideoGamesLink;
    public void videoGamesAct(){
        jsFooter();
        implicitWait(4);
        VideoGamesLink.click();

    }
    public void videoGamesVal(){
        implicitWait(8);
        String actualURL=driver.getCurrentUrl();
        implicitWait(1);
        String expectedURL = VideoGamesTitle;
        Assert.assertEquals(actualURL,expectedURL);
    }

}
