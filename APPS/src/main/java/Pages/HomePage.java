package Pages;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class HomePage extends MobileAPI {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ImageView")
    private WebElement setting;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.TextView[1]")
    private WebElement themeText;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.Switch")
    private WebElement themeOffTab;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView[1]")
    private WebElement darkThemeText;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.Switch")
    WebElement DarkThemeButton;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.TextView[2]")
    private WebElement dataSaver;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView[1]")
    private WebElement autoFreshText;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Switch\n")
    WebElement AutomaticDataRefreshButton;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView[2]")
    private WebElement manualRefresh;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Switch")
    private WebElement refreshTab;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.TextView[1]")
    private WebElement loadImage;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.TextView[2]")
    private WebElement effectUsage;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.Switch")
    private WebElement loadIMGTab;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.TextView[1]")
    private WebElement lowQualityText;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.TextView[2]")
    private WebElement videoStreamingText;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget." +
            "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android." +
            "support.v7.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget." +
            "LinearLayout/android.widget.Switch")
    private WebElement lowQualityTab;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget." +
            "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android." +
            "widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.TextView[2]")
    WebElement videoOptions;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
            "/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.TextView[2]")
    WebElement notificationsText;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.RelativeLayout/android.widget.TextView")
    WebElement allowNotificatis;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.RelativeLayout/android.widget.TextView[1]")
    WebElement videoLanguage;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.Switch")
    WebElement AllowNotificationButton;
    @FindBy(xpath = "//android.widget.TextView[@text='Sound']")
    WebElement soundTab;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.LinearLayout/android.widget.Switch")
    WebElement SoundButton;
    @FindBy(xpath = "//android.widget.TextView[@text='Vibration']")
    WebElement vibrationTab;
    @FindBy(xpath = "//android.widget.TextView[@text='DO NOT DISTURB']")
    WebElement donotDisturb;
    public void setSetting(){
        setting.click();
    }
        public void setThemeText() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Theme text");
        setSetting();
        boolean select = themeText.isDisplayed();
        Assert.assertTrue(select);
        String text = themeText.getText();
        Assert.assertEquals(text, "THEME");
        boolean select1 = themeText.isEnabled();
        Assert.assertTrue(select1);
    }
    public void setThemeOffTab() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Theme Tab");
        setSetting();
        String text = themeOffTab.getText();
        Assert.assertEquals(text, "OFF");
        themeOffTab.click();
        boolean select = themeOffTab.isDisplayed();
        Assert.assertTrue(select);
        boolean select1 = themeOffTab.isEnabled();
        Assert.assertTrue(select1);
        themeOffTab.click();
    }
    public void setDarkThemeText() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Dark Theme Text");
        setSetting();
        String text = darkThemeText.getText();
        Assert.assertEquals(text, "Dark Theme");
        boolean select = darkThemeText.isDisplayed();
        Assert.assertTrue(select);
        boolean select1 = darkThemeText.isEnabled();
        Assert.assertTrue(select1);
    }
    public void checkDarkThemeButton(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Dark Theme Button");
        setSetting();
        DarkThemeButton.click();
    }
    public void setDataSaver() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Dark Theme Text");
        setSetting();
        String text = dataSaver.getText();
        Assert.assertEquals(text, "DATA SAVER OPTIONS");
        boolean select = dataSaver.isDisplayed();
        Assert.assertTrue(select);
        boolean select1 = dataSaver.isSelected();
        Assert.assertFalse(select1);
        boolean select3 = dataSaver.isEnabled();
        Assert.assertTrue(select3);
    }
        public void setAutoFreshText() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Auto Data Refresh Text");
        setSetting();
        String text = autoFreshText.getText();
        Assert.assertEquals(text, "Automatic data refresh");
        boolean select = autoFreshText.isDisplayed();
        Assert.assertTrue(select);
        boolean select1 = autoFreshText.isEnabled();
        Assert.assertTrue(select1);
        boolean select3 = autoFreshText.isSelected();
        Assert.assertFalse(select3);
    }
    public void checkAutomaticDataRefreshButton(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Auto Data Refresh Button");
        setSetting();
        AutomaticDataRefreshButton.click();
    }
    public void setManualRefresh() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Manual Data Refresh Text");
        setSetting();
        String text = manualRefresh.getText();
        Assert.assertEquals(text, "Manual refresh is still available");
        boolean select = manualRefresh.isEnabled();
        Assert.assertTrue(select);
        boolean select1 = manualRefresh.isDisplayed();
        Assert.assertTrue(select1);
    }
    public void setRefreshTab() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Auto Data Refresh Tab");
        setSetting();
        String text = refreshTab.getText();
        Assert.assertEquals(text, "ON");
        boolean select = refreshTab.isDisplayed();
        Assert.assertTrue(select);
        boolean select1 = refreshTab.isSelected();
        Assert.assertFalse(select1);
        refreshTab.click();
        String text1 = refreshTab.getText();
        Assert.assertEquals(text1, "OFF");
    }

    public void setLoadImage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Load Image Text");
        setSetting();
        String text = loadImage.getText();
        Assert.assertEquals(text, "Load images");
        boolean select = loadImage.isDisplayed();
        Assert.assertTrue(select);
        boolean select1 = loadImage.isEnabled();
        Assert.assertTrue(select1);
        boolean select3 = loadImage.isSelected();
        Assert.assertFalse(select3);
    }
    public void setEffectUsage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Effects data usage Text");
        setSetting();
        String text = effectUsage.getText();
        Assert.assertEquals(text, "Effects data usage");
        boolean select = effectUsage.isDisplayed();
        Assert.assertTrue(select);
        boolean select1 = effectUsage.isSelected();
        Assert.assertFalse(select1);
        boolean select3 = effectUsage.isEnabled();
        Assert.assertTrue(select3);
    }
    public void setLoadIMGTab() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Load Image Tab");
        setSetting();
        String text = loadIMGTab.getText();
        Assert.assertEquals(text, "ON");
        boolean select = loadIMGTab.isDisplayed();
        Assert.assertTrue(select);
        loadIMGTab.click();
        String text1 = loadIMGTab.getText();
        Assert.assertEquals(text1, "OFF");
        boolean selec1 = loadIMGTab.isEnabled();
        Assert.assertTrue(selec1);
    }

    public void setLowQualityText() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Load Image Tab");
        setSetting();
        String text = lowQualityText.getText();
        Assert.assertEquals(text, text);
        boolean select = lowQualityText.isDisplayed();
        Assert.assertTrue(select);
        boolean select1 = lowQualityText.isSelected();
        Assert.assertFalse(select1);
    }
    public void setVideoStreamingText() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Load Image Tab");
        setSetting();
        String text = videoStreamingText.getText();
        Assert.assertEquals(text, "Save data on video streaming");
        boolean select = videoStreamingText.isDisplayed();
        Assert.assertTrue(select);
    }

    public void setLowQualityTab() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Low Quality Video Tab");
        setSetting();
        String text = lowQualityTab.getText();
        Assert.assertEquals(text, "OFF");
        boolean select = lowQualityTab.isDisplayed();
        Assert.assertTrue(select);
        lowQualityTab.click();
        String text1 = lowQualityTab.getText();
        Assert.assertEquals(text1, "ON");
        boolean selcct1 = lowQualityTab.isEnabled();
        Assert.assertTrue(selcct1);
    }
    public void setVideoOptionstext() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Video Options text)");
        setSetting();
        String text = videoOptions.getText();
        Assert.assertEquals(text, text);
        boolean select = videoOptions.isDisplayed();
        Assert.assertTrue(select);
    }
    public void setVideoLanguage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Video Language text)");
        setSetting();
        String text = videoLanguage.getText();
        Assert.assertEquals(text, "Video Language");
        boolean select = videoLanguage.isDisplayed();
        Assert.assertTrue(select);
    }
    public void setNotificationsText(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test NOTIFICATIONS text)");
        setSetting();
        String text = notificationsText.getText();
        Assert.assertEquals(text,text);
        boolean select = notificationsText.isDisplayed();
        Assert.assertTrue(select);
        boolean select1 = notificationsText.isEnabled();
        Assert.assertTrue(select1);
    }
    public void setAllowNotificatis(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Allow NOTIFICATIONS text)");
        setSetting();
        String text = allowNotificatis.getText();
        Assert.assertEquals(text,"Video Language");
        boolean select = allowNotificatis.isDisplayed();
        Assert.assertTrue(select);
    }
    public void checkAllowNotificationButton(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Allow NOTIFICATIONS Button)");
        setSetting();
        AllowNotificationButton.click();

    }
    public void checkTextOfSoundButton(){
        TestLogger.log(getClass().getSimpleName()+""+convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"->"+"Test Sound Text)");
        setSetting();
        String text =soundTab.getText();
        Assert.assertEquals(text,"Sound");
        boolean select = soundTab.isDisplayed();
        Assert.assertTrue(select);
    }
    public void checkSoundButton(){
        TestLogger.log(getClass().getSimpleName()+""+convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"->"+"Test Click SoundButton)");
        setSetting();
        SoundButton.click();
    }

}
