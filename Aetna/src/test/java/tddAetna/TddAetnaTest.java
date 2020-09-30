package tddAetna;

import common.WebAPI;
import ferAetna.FerAetna;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TddAetnaTest extends WebAPI {
    FerAetna ferAetna;

    @BeforeMethod
    public void getInIt() {
        ferAetna = PageFactory.initElements(driver, FerAetna.class);
    }
    @Test
    public void keepUpWYCareTest() {
        ferAetna.keepUpWYourCareBAct();
        ferAetna.keepUpWYourCareBVAl("Time for you and your needs");
    }
    @Test
    public void findADocTest() {
        ferAetna.findDocButtAct();
        ferAetna.findADocButtVal("Welcome to Aetna's member website");
    }

    @Test
    public void medicareTest() {
        ferAetna.MedButtAct();
        ferAetna.MedButtVal();
    }

    @Test
    public void shopFAPlanTest() {
        ferAetna.shopFAPlanButtAct();
        ferAetna.shopFAPlanVal();
    }
    @Test
    public void logoTest() {
        ferAetna.aetnaLogoIsDisplay();
    }

    @Test
    public void memberSuppTest() {
        ferAetna.memberSupportButtAct();
        ferAetna.memberSuppButtVal();
    }


}
