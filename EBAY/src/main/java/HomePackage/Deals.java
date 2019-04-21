package HomePackage;
import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Deals extends MobileAPI {
    @FindBy(xpath = "//android.widget.TextView[@content-desc='Deals button']")
    WebElement deals;
    @FindBy(xpath = "//android.widget.TextView[@text='FEATURED']")
    WebElement Featured;
    @FindBy(xpath = "//android.widget.TextView[@text='TECH']")
    WebElement Tech;
    @FindBy(xpath = "//android.widget.TextView[@text='FASHION']")
    WebElement Fashion;
    @FindBy(xpath = "//android.widget.TextView[@text='HOME &amp; GARDEN']")
    WebElement HomeGarden;
    @FindBy(xpath = "//android.widget.TextView[@text='SPORTING GOODS']")
    WebElement SportingGoods;
    @FindBy(xpath = "//android.widget.TextView[@text='AUTOMOTIVE']")
    WebElement Automative;
    @FindBy(xpath = "//android.widget.TextView[@text='OTHER DEALS']")
    WebElement OtherDeal;
    public void searchDeals(){
        deals.click();
    }
    public void searchFeatured(){
        searchDeals();
        Featured.click();
    }
    public void searchTech(){
        searchDeals();
        Tech.click();
    }
    public void searchFasion(){
        searchDeals();
        Fashion.click();
    }
    public void searchHomeGarden(){
        searchDeals();
        HomeGarden.click();
    }
    public void searhSportingGoods(){
        searchDeals();
        SportingGoods.click();
    }
    public void searchAutomative(){
        searchDeals();
        Automative.click();
    }
    public void searchOtherDeal(){
        searchDeals();
        OtherDeal.click();
    }
}
