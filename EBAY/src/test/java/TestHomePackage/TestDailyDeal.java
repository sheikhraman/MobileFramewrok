package TestHomePackage;
import HomePackage.DailyDeal;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestDailyDeal extends MobileAPI {
    DailyDeal dailyDeal;
    @BeforeMethod
    public void init(){
       dailyDeal = PageFactory.initElements(ad, DailyDeal.class);
    }
    @Test(priority = 1)
    public void testDailyDeals() throws InterruptedException {
        dailyDeal.checkDailyDeals();
    }
    @Test(priority = 2)
    public void tesFeatured() throws InterruptedException {
        dailyDeal.checkFeatured();
    }
    @Test(priority = 3)
    public void TestTech() throws InterruptedException {
        dailyDeal.checkTech();
    }
    @Test(priority = 4)
    public void TestFshion() throws InterruptedException {
        dailyDeal.checkFashion();
    }
    @Test(priority = 5)
    public void TestHomeGarden() throws InterruptedException {
        dailyDeal.checkHomeAndGarden();
    }
    @Test(priority = 6)
    public void TestSportingGoods() throws InterruptedException {
        dailyDeal.checkSpofrtingGoods();
    }
    @Test(priority = 7)
    public void TestAutomative() throws InterruptedException {
        dailyDeal.checkAutomative();
    }
    @Test(priority = 8)
    private void TestOtherDeals() throws InterruptedException {
        dailyDeal.checkOtherDeals();
    }

}
