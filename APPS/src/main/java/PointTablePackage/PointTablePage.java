package PointTablePackage;
import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;
public class PointTablePage extends MobileAPI {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ImageView")
    private WebElement setting;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton")
    WebElement NevigateArrow;
    @FindBy(id = "com.cricbuzz.android:id/txt_pointstable")
    WebElement PointTable;
    @FindBy(xpath = "//android.widget.TextView[@text='NEWS']")
    WebElement NewsButton;
    @FindBy(xpath = "//android.widget.TextView[@text='SQUADS']")
    WebElement SquadsButton;
    @FindBy(xpath = "//android.widget.TextView[@text='STATS']")
    WebElement StatsButton;
    @FindBy(xpath = "//android.widget.TextView[@text='VENUES']")
    WebElement VenuesButton;
    @FindBy(xpath = "//android.widget.TextView[@text='POINTS TABLE']")
    WebElement PointsTableButton;
    public void setSetting(){
        setting.click();
    }
    public void checkNevigateArrow(){
        setSetting();
        NevigateArrow.click();
    }
    public void checkPointTable(){
        checkNevigateArrow();
        ad.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        PointTable.click();
    }
    public void checkNewsButton(){
        checkPointTable();
        NewsButton.click();
    }
    public void checkSquadsButton(){
        checkPointTable();
        SquadsButton.click();
    }
    public void checkSttusButton(){
        checkPointTable();
        StatsButton.click();
    }
    public void checkVenuesButton(){
        checkPointTable();
        VenuesButton.click();
    }
    public void checkPoitsTables(){
        checkPointTable();
        PointsTableButton.click();
    }
}
