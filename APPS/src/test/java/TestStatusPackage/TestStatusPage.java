package TestStatusPackage;

import PointTablePackage.PointTablePage;
import StatusPackage.StatusPage;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestStatusPage extends MobileAPI {
    StatusPage statusPage;
    @BeforeMethod
    public void init(){
        statusPage= PageFactory.initElements(ad,StatusPage.class);
    }
    @Test(priority = 1)
    public void TestSeeetings(){
        statusPage.setSetting();
    }
    @Test(priority = 2)
    public void TestArrowButton(){
        statusPage.checkNevigateArrow();
    }
    @Test(priority = 3)
    public void TestPointTableButton(){
        statusPage.checkPointTable();
    }
    @Test(priority = 4)
    public void TestStatusButtons(){
        statusPage.checkStatusButon();
    }
    @Test(priority = 5)
    public void TestBattings(){
        statusPage.checkBattings();
    }
    @Test(priority = 6)
    public void TestMostRun(){
        statusPage.checkMostRun();
    }
    @Test(priority = 7)
    public void TestHigestScore(){
        statusPage.checkHighestScore();
    }
    @Test(priority = 8)
    public void TestBestBattingAverage(){
        statusPage.checkBestBattingAverage();
    }
    @Test(priority = 9)
    public void TestBestBattingStrike(){
        statusPage.checkBestBattingStrikeRate();
    }
    @Test(priority = 10)
    public void TestMostHundred(){
        statusPage.checkMostHundred();
    }
    @Test(priority = 11)
    public void TestMotFifties(){
        statusPage.checkMostFiftees();
    }
    @Test(priority = 12)
    public void TestMostFours(){
        statusPage.checkMostFours();
    }
    @Test(priority = 13)
    public void TestMostSix(){
        statusPage.checkMostSixs();
    }
    @Test(priority = 14)
    public void TestMostNintees(){
        statusPage.checkMostNinties();
    }
    @Test(priority = 15)
    public void TestBowlings(){
        statusPage.checkBowLing();
    }
}
