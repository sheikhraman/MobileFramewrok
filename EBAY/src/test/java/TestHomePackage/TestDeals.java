package TestHomePackage;
import HomePackage.Deals;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestDeals extends MobileAPI {
    Deals deals;
    @BeforeMethod
    public void init(){
        deals = PageFactory.initElements(ad,Deals.class);
    }
    @Test(priority = 1)
    public void testDeals(){
        deals.searchDeals();
    }
    @Test(priority = 2)
    public void testFeature(){
        deals.searchFeatured();
    }
    @Test(priority = 3)
    public void testTec(){
        deals.searchTech();
    }
    @Test(priority = 4)
    public void testFshion(){
        deals.searchFasion();
    }
    @Test(priority = 5)
      public void testHomGarden(){
       deals.searchHomeGarden();
    }
    @Test(priority = 6)
    public void testSportGood(){
        deals.searhSportingGoods();
    }
    @Test(priority = 7)
    public void testAutomatv(){
        deals.searchAutomative();
    }
    @Test(priority = 8)
    public void testOtherrDeal(){
        deals.searchOtherDeal();
    }

}
