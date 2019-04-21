package HomePackage;
import common.MobileAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class HomePage extends MobileAPI {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Main navigation, open']")
    WebElement menuBar;
    @FindBy(xpath = "//android.widget.TextView[@text='Search for anything']")
    WebElement clickOnSearchButton;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc='shopping cart']")
    WebElement shoppingCart;
    @FindBy(id = "com.ebay.mobile:id/search_voice_btn")
    WebElement voiceSearch;
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Image search options']")
    WebElement camera;
    @FindBy(xpath = "//android.widget.TextView[@content-desc='Selling button']")
    WebElement selling;
    @FindBy(xpath = "//android.widget.TextView[@content-desc='Deals button']")
    WebElement deals;
    @FindBy(xpath = "//android.widget.TextView[@content-desc='Categories button']")
    WebElement catagories;
    @FindBy(xpath = "//android.widget.TextView[@content-desc='Saved button']")
    WebElement saved;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Button[1]")
    WebElement register;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Button[2]")
    WebElement signIn;
    @FindBy(xpath = "//android.widget.TextView[@text='Daily Deals' and @resource-id='com.ebay.mobile:id/textview_header_title']")
    WebElement dailyDeals;
    @FindBy(xpath = "//android.widget.Button[@text='SEE ALL'and @resource-id='com.ebay.mobile:id/button_header_more']")
    WebElement seeAllDeals;
    @FindBy(xpath = "//android.widget.TextView[@content-desc='Trending on eBay']")
    WebElement TrendingEbay;
    @FindBy(xpath = "//android.widget.Button[@content-desc='See All Trends']")
    WebElement AllTrends;
    public void clickOnMenuBar(){
        menuBar.click();
    }
    public void checkShoppingCart(){
        shoppingCart.click();
    }
    public void clicSearchBtn(){
        clickOnSearchButton.sendKeys("cellphoe", Keys.ENTER);
    }
    public void checkVoiceSearch(){
        voiceSearch.click();
    }
    public void checkCamera(){
        camera.click();
    }
    public void checkSellingBtn(){
        selling.click();
    }
    public void searchDeals(){
        deals.click();
    }
    public void searchCatagories(){
        catagories.click();
    }
    public void searchSaved(){
        saved.click();
    }
    public void searchRegister(){
        register.click();
    }
    public void searchSignInButton(){
        signIn.click();
    }
    public void searchDailyDeals() throws InterruptedException {
        sleep(15);
        dailyDeals.click();
    }
    public void searchseeAllDeals() throws InterruptedException {
        sleep(40);
            seeAllDeals.click();
    }
    public void searchTrendingEbay(){TrendingEbay.click();}
    public void searchAllTrend(){AllTrends.click();}
}
