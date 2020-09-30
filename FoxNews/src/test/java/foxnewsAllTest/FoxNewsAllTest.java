package foxnewsAllTest;

import common.WebAPI;
import foxnewsAll.FoxNewsAll;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FoxNewsAllTest extends WebAPI {
    FoxNewsAll foxNewsAll;

    @BeforeMethod
    public void getInit() {
        foxNewsAll = PageFactory.initElements(driver,FoxNewsAll.class);
    }

    @Test
    public void logoFXDisplayTest(){
    foxNewsAll.logoFXDisplay();
    }
    @Test
    public void headerNavBackTest(){
        foxNewsAll.headerNavBackACT();
        foxNewsAll.headerNavBackVal();
    }
    @Test
    public void oppinionTest(){
        foxNewsAll.oppinionAct();
        foxNewsAll.oppinionVal();
    }
    @Test
    public void facebookLinkTest(){
        foxNewsAll.facebookLinkAct();
        foxNewsAll.facebookLinkVal();
    }
    @Test
    public void twotterLinkTest(){
        foxNewsAll.twitterLinkAct();
        foxNewsAll.twitterLinkVal();
    }
    @Test
    public void flipBoardLinkTest(){
        foxNewsAll.flipBoardLinkAct();
        foxNewsAll.flipBoardLinkVal();
    }
    @Test
    public void googleLinkTest(){
        foxNewsAll.googleLinkAct();
        foxNewsAll.googleLinkVal();
    }
    @Test
    public void instagramLinkTest(){
        foxNewsAll.instagramLinkAct();
        foxNewsAll.instagramLinkVal();
    }
    @Test
    public void rssLinkTest(){
        foxNewsAll.rssLinkAct();
        foxNewsAll.rssLinkVal();
    }
    @Test
    public void emailLinkTest(){
        foxNewsAll.emailLinkAct();
        foxNewsAll.emailLinkVal();
    }
    @Test
    public void headersLinkTest(){
        foxNewsAll.headersLinkAct();
        foxNewsAll.headersLinkVal();
    }
    @Test
    public void getPageSrcTest(){
        foxNewsAll.getPageSrc();
    }
    @Test
    public void switchLinkTest(){
        foxNewsAll.switchLinkAct();
        foxNewsAll.switchLinkVal();
    }
    @Test
    public void LifestyleLInkTest(){
        foxNewsAll.LifestyleLInkAct();
        foxNewsAll.LifestyleLInkVal();
    }
    @Test
    public void scienceLInkTest (){
        foxNewsAll.scienceLInkAct();
        foxNewsAll.scienceLInkVal();
    }
    @Test
    public void techTest (){
        foxNewsAll.techLInkAct();
        foxNewsAll.techLInkVal();
    }
    @Test
    public void healthTest (){
        foxNewsAll.healthLInkAct();
        foxNewsAll.healthLInkVal();
    }
    @Test
    public void naturalScienceLInkTest (){
        foxNewsAll.naturalScienceLInkAct();
        foxNewsAll.naturalScienceLInkVal();
    }
    @Test
    public void coronavirusLinkLInkTest(){
        foxNewsAll.coronavirusLInkAct();
        foxNewsAll.coronavirusLInkVal();
    }
    @Test
    public void innovationLinkTest (){
        foxNewsAll.innovationLinkAct();
        foxNewsAll.innovationLinkVal();
    }
    @Test
    public void sienceCheckTest (){
        foxNewsAll.scienceLInkAct();
        foxNewsAll.scienceLInkVal();
    }
    @Test
    public void rssCheckTest(){
        foxNewsAll.rssLinkAct();
        foxNewsAll.rssLinkVal();
    }
    @Test
    public void flipCheckTest(){
        foxNewsAll.flipBoardLinkAct();
        foxNewsAll.flipBoardLinkVal();
    }
    @Test
    public void pageSTest(){
        foxNewsAll.getPageSrc();
    }
    @Test
    public void switchToANewLinkTest(){
        foxNewsAll.switchLinkAct();
        foxNewsAll.switchLinkVal();
    }
    @Test
    public void watchLiveTest (){
        foxNewsAll.watchLiveLinkAct();
        foxNewsAll.watchLiveLinkVal();
    }

    @Test
    public void careersLinkTest (){
        foxNewsAll.careersLinkAct();
        foxNewsAll.careersLinkVal();
    }
    @Test
    public void archaeologyTest (){
        foxNewsAll.archaeologyAct();
        foxNewsAll.archaeologyVal();
    }
    @Test
    public void videoGamesTest (){
        foxNewsAll.videoGamesAct();
        foxNewsAll.videoGamesVal();
    }
    @Test
    public void naturalTest (){
        foxNewsAll.naturalScienceLInkAct();
        foxNewsAll.naturalScienceLInkVal();
    }

}
