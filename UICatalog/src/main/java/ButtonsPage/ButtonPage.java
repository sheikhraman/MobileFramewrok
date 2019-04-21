package ButtonsPage;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class ButtonPage extends MobileAPI {

    @FindBy(xpath = "//XCUIElementTypeApplication[@name='UICatalog']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable")
    WebElement buttonsWholePage;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Contact Add']")
    WebElement uIButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Background Image']")
    WebElement backgroundImage;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Gray']")
    WebElement gray;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='ButtonsViewController.m: (UIButton *)grayButton']")
     WebElement grayButton;

    @FindBy (xpath = "//XCUIElementTypeButton[@name='Right pointing arrow']")
    WebElement buttonWithImage;

    @FindBy (xpath = "//XCUIElementTypeButton[@name='Right pointing arrow']")
     WebElement rightPointingArrow;

    @FindBy (xpath = "//XCUIElementTypeButton[@name='Right pointing arrow']")
    WebElement textImageButton;

    @FindBy (xpath = "(//XCUIElementTypeStaticText[@name='UIButtonTypeRoundedRect'])[1]")
    WebElement uIButtonTypeRoundedRect;

    @FindBy (xpath = "//XCUIElementTypeStaticText[@name='Rounded Button']")
    WebElement roundedButton;

    @FindBy (xpath = "//XCUIElementTypeButton[@name='Rounded']")
    WebElement roundedSymbol;

    @FindBy(xpath = "/XCUIElementTypeStaticText[@name='ButtonsViewController.m: (UIButton *)roundedButtonType']")
    WebElement roundedButtonType;

    public void checkButtonsWholePage(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Buttons Whole Page");
        buttonsWholePage.click();
    }

    public void checkUIButton(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "UIButtons Page");
        uIButton.click();
    }

    public void checkBackgroundImage(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Back ground Image");
        backgroundImage.click();
    }

    public void checkGray(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Gray Tab");
        gray.click();
    }

    public void checkGrayButton(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Grey Button");
        grayButton.click();
    }

    public void checkButtonWithImage(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Button With Image");
        buttonWithImage.click();
    }

    public void checkRightPointingArrow(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Right Pointing Image");
        rightPointingArrow.click();
    }

    public void checkTextImageButton(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Text Image Button");
        textImageButton.click();
    }

    public void checkUIButtonTypeRoundedRect(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "UI Button Type Round");
        uIButtonTypeRoundedRect.click();
    }

    public void checkRoundedButton(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Rounded Button");
        roundedButton.click();
    }

    public void checkRoundedSymbol(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Rounded Symbol");
        roundedSymbol.click();
    }

    public void checkRoundedButtonType(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Rounded Button Type");
        roundedButtonType.click();
    }
}
