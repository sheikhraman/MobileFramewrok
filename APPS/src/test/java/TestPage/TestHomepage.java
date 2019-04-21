package TestPage;
import Pages.HomePage;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestHomepage extends MobileAPI {
    HomePage setting;
    @BeforeMethod
    public void init(){
        setting = PageFactory.initElements(ad,HomePage.class);
    }
    @Test(priority = 1)
    public void testSoundTab(){
        setting.setSetting();
    }
    @Test(priority = 2)
    public void TestThemeText(){
        setting.setThemeText();
    }
    @Test(priority = 3)
    public void TestThemeOfTab(){
        setting.setThemeOffTab();
    }
    @Test(priority = 4)
    public void TestDarkThemeText(){
        setting.setDarkThemeText();
    }
    @Test(priority = 5)
    public void TestDarkThemeButton(){setting.checkDarkThemeButton();}
    @Test(priority = 6)
    public void TestDataSaver(){
        setting.setDataSaver();
    }
    @Test(priority = 7)
    public void TestAutoRefreshText(){
        setting.setAutoFreshText();
    }
    @Test(priority = 8)
    public void TestAutomaticDataRefershButton(){
        setting.checkAutomaticDataRefreshButton();
    }
    @Test(priority = 9)
    public void TestManualRefresh(){
        setting.setManualRefresh();
    }
    @Test(priority = 10)
    public void TestRefreshTab(){
        setting.setRefreshTab();
    }
    @Test(priority = 11)
    public void TestLoadImage(){
        setting.setLoadImage();
    }
    @Test(priority = 12)
    public void TestEffectUsage(){
        setting.setEffectUsage();
    }
    @Test(priority = 13)
    public void TestImagTab(){
        setting.setLoadIMGTab();
    }
    @Test(priority = 14)
   public void TestLowQualityText(){
        setting.setLowQualityText();
    }
    @Test(priority = 15)
    public void TestVideoStreamingText(){
        setting.setVideoStreamingText();
    }
    @Test(priority = 16)
    public void TestLowQualityTab(){
        setting.setLowQualityTab();
    }
    @Test(priority = 17)
    public void TestVideoOptionText(){
        setting.setVideoOptionstext();
    }
    @Test(priority = 18)
    public void TestVideoLanguage(){
        setting.setVideoLanguage();
    }
    @Test(priority = 19)
    public void TestNotificationTest(){
        setting.setNotificationsText();
    }
    @Test(priority = 20)
    public void TestAllNotification(){
        setting.setNotificationsText();
    }
    @Test(priority = 21)
    public void TestAllowNotificationButton(){setting.checkAllowNotificationButton();}
    @Test(priority = 22)
    public void TestSoundText(){setting.checkTextOfSoundButton();}
    @Test(priority = 23)
    public void TestSoundButton(){setting.checkSoundButton();}
}
