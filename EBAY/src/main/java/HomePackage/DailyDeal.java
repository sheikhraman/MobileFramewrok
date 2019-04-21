package HomePackage;
import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class DailyDeal extends MobileAPI {
    @FindBy(xpath = "//android.widget.TextView[@text='FEATURED']")
    WebElement Featured;
    @FindBy(xpath = "//android.widget.TextView[@text='TECH']")
    WebElement Tech;
    @FindBy(xpath = "//android.widget.TextView[@text='FASHION']")
    WebElement Fashion;
    @FindBy(xpath = "//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Home & Garden. Button. 4 of 7.\"]/android.widget.TextView")
    WebElement HomeGarden;
    @FindBy(xpath = "//android.widget.TextView[@text='SPORTING GOODS']")
    WebElement SportingGoods;
    @FindBy(xpath = "//android.widget.TextView[@text='AUTOMOTIVE']")
    WebElement Automative;
    @FindBy(xpath = "//android.widget.TextView[@text='OTHER DEALS']")
    WebElement OtherDeal;
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"See All Deals\"]")
    WebElement DailyDeals;
    public void checkDailyDeals() throws InterruptedException {
        sleep(20);
        DailyDeals.click();
    }
    public void checkFeatured() throws InterruptedException {
        checkDailyDeals();
        Featured.click();
    }
    public void checkTech() throws InterruptedException {
        checkDailyDeals();
        Tech.click();
    }
    public void checkFashion() throws InterruptedException {
        checkDailyDeals();
        Fashion.click();
    }
    public void checkHomeAndGarden() throws InterruptedException {
        checkDailyDeals();
        HomeGarden.click();
    }
    public void checkSpofrtingGoods() throws InterruptedException {
        checkDailyDeals();
        SportingGoods.click();
    }
    public void checkAutomative() throws InterruptedException {
        checkDailyDeals();
        Automative.click();
    }
    public void checkOtherDeals() throws InterruptedException {
        checkDailyDeals();
        OtherDeal.click();
    }
}
