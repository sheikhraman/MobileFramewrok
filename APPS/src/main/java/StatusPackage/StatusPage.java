package StatusPackage;
import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StatusPage extends MobileAPI {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ImageView")
    private WebElement setting;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton")
    WebElement NevigateArrow;
    @FindBy(id = "com.cricbuzz.android:id/txt_pointstable")
    WebElement PointTable;
    @FindBy(xpath = "//android.widget.TextView[@text='STATS']")
    WebElement StatsButton;
    @FindBy(xpath = "//android.widget.TextView[@text='BATTING']")
    WebElement Batting;
    @FindBy(className = "//android.widget.TextView[@text='Most runs']")
    WebElement MostRun;
    @FindBy(xpath = "//android.widget.TextView[@text='Highest Scores']")
    WebElement HighestScores;
    @FindBy(xpath = "//android.widget.TextView[@text='Best Batting Average']")
    WebElement BestBattingAverage;
    @FindBy(xpath = "//android.widget.TextView[@text='Best Batting Strike Rate']")
    WebElement BestBattingStrikeRate;
    @FindBy(xpath = "//android.widget.TextView[@text='Most Hundreds']")
    WebElement MostHundreds;
    @FindBy(xpath = "//android.widget.TextView[@text='Most Fifties']")
    WebElement MostFifties;
    @FindBy(xpath = "//android.widget.TextView[@text='Most Fours']")
    WebElement MostFours;
    @FindBy(xpath = "//android.widget.TextView[@text='Most Sixes']")
    WebElement MostXis;
    @FindBy(xpath = "//android.widget.TextView[@text='Most Nineties']")
    WebElement MostNineties;
    @FindBy(xpath = "//android.widget.TextView[@text='BOWLING']")
    WebElement Bowlings;
    public void setSetting(){
        setting.click();
    }
    public void checkNevigateArrow(){
        setSetting();
        NevigateArrow.click();
    }
    public void checkPointTable(){
        checkNevigateArrow();
        PointTable.click();
    }
    public void checkStatusButon(){
        checkPointTable();
        StatsButton.click();
    }
    public void checkBattings(){
        checkStatusButon();
        Batting.click();
    }
    public void checkMostRun(){
        checkStatusButon();
        MostRun.click();
    }
    public void checkHighestScore(){
        checkStatusButon();
        HighestScores.click();
    }
    public void checkBestBattingAverage(){
        checkStatusButon();
        BestBattingAverage.click();
    }
    public void checkBestBattingStrikeRate(){
        checkStatusButon();
        BestBattingStrikeRate.click();
    }
    public void checkMostHundred(){
        checkStatusButon();
        MostHundreds.click();
    }
    public void checkMostFiftees(){
        checkStatusButon();
        MostFifties.click();
    }
    public void checkMostFours(){
        checkStatusButon();
        MostFours.click();
    }
    public void checkMostSixs(){
        checkStatusButon();
        MostXis.click();
    }
    public void checkMostNinties(){
        checkStatusButon();
        MostNineties.click();
    }
    public void checkBowLing(){
        checkStatusButon();
        Bowlings.click();
    }


}
