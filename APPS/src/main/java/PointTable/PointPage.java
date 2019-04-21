package PointTable;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.cert.X509Certificate;

public class PointPage extends MobileAPI {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ImageView")
    private WebElement setting;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton")
    WebElement NevigateArrow;
    @FindBy(id = "com.cricbuzz.android:id/txt_pointstable")
    WebElement PointTable;
    @FindBy(xpath = "//android.widget.TextView[@text='CSK']")
    WebElement CSK;
    @FindBy(xpath = "//android.widget.TextView[@text='MI']")
    WebElement Mi;
    @FindBy(xpath = "//android.widget.TextView[@text='DC']")
    WebElement DC;
    @FindBy(xpath = "//android.widget.TextView[@text='KXIP']")
    WebElement KXIP;
    @FindBy(xpath = "//android.widget.TextView[@text='SRH']")
    WebElement SRH;
    @FindBy(xpath = "//android.widget.TextView[@text='KKR']")
    WebElement KKR;
    @FindBy(xpath = "//android.widget.TextView[@text='RR']")
    WebElement RR;
    @FindBy(xpath = "//android.widget.TextView[@text='RCB']")
    WebElement RCB;
    public void checkSettings() throws InterruptedException {
        sleep(5);
        setting.click();
    }
    public void checkNevigateArrow() throws InterruptedException {
        checkSettings();
        sleep(7);
        NevigateArrow.click();
    }
    public void checkPointTableBtn() throws InterruptedException {
        checkNevigateArrow();
        sleep(8);
        PointTable.click();
    }
    public void checkCSK() throws InterruptedException {
        sleep(10);
        checkPointTableBtn();
        CSK.click();
    }
    public void checkMI() throws InterruptedException {
        checkPointTableBtn();
        Mi.click();
    }
    public void checkDC() throws InterruptedException {
        checkPointTableBtn();
        DC.click();
    }
    public void checkKXIP() throws InterruptedException {
        checkPointTableBtn();
        KXIP.click();
    }
    public void checkSRH() throws InterruptedException {
        checkPointTableBtn();
        SRH.click();
    }
    public void checkKKR() throws InterruptedException {
        checkPointTableBtn();
        KKR.click();
    }
    public void checkRR() throws InterruptedException {
        checkPointTableBtn();
        RR.click();
    }
    public void checkRCB() throws InterruptedException {
        checkPointTableBtn();
        RCB.click();
    }

}

