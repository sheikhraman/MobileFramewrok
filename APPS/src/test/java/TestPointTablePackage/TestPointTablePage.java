package TestPointTablePackage;

import PointTablePackage.PointTablePage;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class TestPointTablePage extends MobileAPI {
    PointTablePage pointTablePage;
    @BeforeMethod
    public void init(){
        pointTablePage= PageFactory.initElements(ad,PointTablePage.class);
    }
    @Test(priority = 1)
    public void TestSeeetings(){
        pointTablePage.setSetting();
    }
    @Test(priority = 2)
    public void TestArrowButton(){
        pointTablePage.checkNevigateArrow();
    }
    @Test(priority = 3)
    public void TestPointTableButton(){
        pointTablePage.checkPointTable();
    }
    @Test(priority = 4)
    public void TestNews(){
        pointTablePage.checkNewsButton();
    }
    @Test(priority = 5)
    public void TestSquadButton(){
        pointTablePage.checkSquadsButton();
    }
    @Test(priority = 6)
    public void TestStatusButton(){
        pointTablePage.checkSttusButton();
    }
    @Test(priority = 7)
    public void TestVenuesButton(){
        pointTablePage.checkVenuesButton();
    }
    @Test(priority = 8)
    public void TestPointTablesButton(){
        pointTablePage.checkPointTable();
    }
    @Test(priority = 9)
    public void TestBestBattingAverage(){

    }
}
