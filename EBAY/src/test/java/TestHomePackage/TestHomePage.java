package TestHomePackage;

import HomePackage.HomePage;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends MobileAPI {
    @Test(priority = 1)
    public void tesSearchMenubar(){
        HomePage  homePage = PageFactory.initElements(ad,HomePage.class);
        homePage.clickOnMenuBar();
    }
    @Test(priority = 2)
    public void tesSearchShoppingCart(){
        HomePage homePage = PageFactory.initElements(ad,HomePage.class);
        homePage.checkShoppingCart();
    }
    @Test(priority = 3)
    public void tesSearchBox(){
        HomePage homePage = PageFactory.initElements(ad,HomePage.class);
        homePage.clicSearchBtn();
    }
    @Test(priority = 4)
    public void tesVoiceSearch(){
        HomePage homePage = PageFactory.initElements(ad,HomePage.class);
        homePage.checkVoiceSearch();
    }
    @Test(priority = 5)
    public void tesSearchCamera(){
        HomePage homePage = PageFactory.initElements(ad,HomePage.class);
        homePage.checkCamera();
    }
    @Test(priority = 6)
    public void tesSearchSellingButton(){
        HomePage homePage = PageFactory.initElements(ad,HomePage.class);
        homePage.checkSellingBtn();
    }
    @Test(priority = 7)
    public void tesSearchDeals(){
        HomePage homePage = PageFactory.initElements(ad,HomePage.class);
        homePage.searchDeals();
    }
    @Test(priority = 8)
    public void tesSearchCatagories(){
        HomePage homePage = PageFactory.initElements(ad,HomePage.class);
        homePage.searchCatagories();
    }
    @Test(priority = 9)
    public void tesSearchSave(){
        HomePage homePage = PageFactory.initElements(ad,HomePage.class);
        homePage.searchSaved();
    }
    @Test(priority = 10)
    public void tesSearchRegisterButton(){
        HomePage homePage = PageFactory.initElements(ad,HomePage.class);
        homePage.searchRegister();
    }
    @Test(priority = 11)
    public void tesSearchSignInButton(){
        HomePage homePage = PageFactory.initElements(ad,HomePage.class);
        homePage.searchSignInButton();
    }
    @Test(priority = 12)
    public void tesSearchDailyDeals() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(ad,HomePage.class);
        homePage.searchDailyDeals();
    }
    @Test(priority = 13)
    public void tesSearchAllDeals() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(ad,HomePage.class);
        homePage.searchseeAllDeals();
    }
    @Test(priority = 13)
    public void tesTrendingEbay(){
        HomePage homePage = PageFactory.initElements(ad,HomePage.class);
        homePage.searchTrendingEbay();
    }
    @Test(priority = 13)
    public void tesAllTrend(){
        HomePage homePage = PageFactory.initElements(ad,HomePage.class);
        homePage.searchAllTrend();
    }
}
