package TestPoint;

import PointTable.PointPage;
import PointTablePackage.PointTablePage;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPointPage extends MobileAPI {
    PointPage pointPage;
    @BeforeMethod
    public void init(){
        pointPage= PageFactory.initElements(ad,PointPage.class);
    }
    @Test(priority = 1)
    public void TestSettings() throws InterruptedException {
        pointPage.checkSettings();
    }
    @Test(priority = 2)
    public void TestNevigateArrow() throws InterruptedException {
        pointPage.checkNevigateArrow();
    }
    @Test(priority = 3)
    public void TestPointTableBtn() throws InterruptedException {
        pointPage.checkPointTableBtn();
    }
    @Test(priority = 4)
    public void TestCSK() throws InterruptedException {
        pointPage.checkCSK();
    }
    @Test(priority = 5)
    public void TestMI() throws InterruptedException {
        pointPage.checkMI();
    }
    @Test(priority = 6)
    public void TestDC() throws InterruptedException {
        pointPage.checkDC();
    }
    @Test(priority = 7)
    public void TestKXIP() throws InterruptedException {
        pointPage.checkKXIP();
    }
    @Test
    public void TestSRM() throws InterruptedException {
        pointPage.checkSRH();
    }
    @Test(priority = 8)
    public void TestKKR() throws InterruptedException {
        pointPage.checkKKR();
    }
    @Test(priority = 9)
    public void TestRR() throws InterruptedException {
        pointPage.checkRR();
    }
    @Test(priority = 10)
    public void TestRCB() throws InterruptedException {
        pointPage.checkRCB();
    }
}
