package chaseheaderbarTest;

import chaseheaderBar.ChaseHeaderBar;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ChaseHeaderBarTest extends WebAPI {
    ChaseHeaderBar chaseHeaderBar;

    @BeforeMethod
    public void getInit() {
        chaseHeaderBar = PageFactory.initElements(driver,ChaseHeaderBar.class);
    }

    @Test
    public void hoverOverHeaderTest(){
    chaseHeaderBar.hoverOverHeader();
    }
    @Test
    public void chaseLogoTest(){
        chaseHeaderBar.chaseLogoACT();
    }
    @Test
    public void chekingAccTest(){
        chaseHeaderBar.chekingAccACT();
    }
    @Test
    public void creditCardsTest(){
        chaseHeaderBar.creditCardsACT();
    }
    @Test
    public void savingAccountTest() {
        chaseHeaderBar.savingAccountACT();
    }
    @Test
    public void cDsOnHeaderTest(){
        chaseHeaderBar.cDsOnHeaderACT();
    }
    @Test
    public void buyingCarTest(){
        chaseHeaderBar.buyingCarACT();
    }
    @Test
    public void mortgageHTest(){
        chaseHeaderBar.mortgageHACT();
    }
    @Test
    public void investingTest(){
        chaseHeaderBar.investingACT();
    }
    @Test
    public void chaseForBusinessTest(){
        chaseHeaderBar.chaseForBusinessACT();
    }
    @Test
    public void commercialTest(){
        chaseHeaderBar.commercialACT();
    }
    @Test
    public void sellOnHeaderTest(){
        chaseHeaderBar.sellOnHeaderACT();
    }
    @Test
    public void atmANBranchTest(){
        chaseHeaderBar.atmANBranchHACT();
        chaseHeaderBar.atmANBranchVAl();
    }
    @Test
    public void searchIconTest(){
        chaseHeaderBar.searchIconAct();
        chaseHeaderBar.searchIconVal();
    }
    @Test
    public void atmANBranchResultText(){
    chaseHeaderBar.atmANBranchResultACT();
    chaseHeaderBar.atmANBranchResultVAl();
    }
    @Test
    public void searchIconOpenAccTest(){
        chaseHeaderBar.searchIconAct();
        chaseHeaderBar.searchIconOpenAccVal();
    }
    @Test//--//
    public void BranchTest(){
        chaseHeaderBar.atmANBranchHACT();
        chaseHeaderBar.atmANBranchVAl();
    }
    @Test
    public void chaseTest(){
        chaseHeaderBar.chaseLogoACT();
    }
    @Test//
    public void iconTest(){
        chaseHeaderBar.searchIconAct();
        chaseHeaderBar.searchIconVal();
    }
    @Test
    public void accountTest() {
        chaseHeaderBar.savingAccountACT();
    }

}
