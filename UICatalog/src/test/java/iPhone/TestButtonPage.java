package iPhone;

import ButtonsPage.ButtonPage;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestButtonPage extends MobileAPI {

    ButtonPage buttonPage;

    @BeforeMethod
    public void init() {
        buttonPage = PageFactory.initElements(ad, ButtonPage.class);
    }

    @Test
    public void testcheckBackgroundImage() {
        buttonPage.checkBackgroundImage();
    }

    @Test
    public void testcheckButtonsWholePage() {
        buttonPage.checkButtonsWholePage();
    }

    @Test
    public void testUIButton() {
        buttonPage.checkUIButton();
    }

    @Test
    public void tesGray() {
        buttonPage.checkGray();
    }

    @Test
    public void testGrayButton() {
        buttonPage.checkGrayButton();
    }

    @Test
    public void testButtonWithImage() {
        buttonPage.checkButtonWithImage();
    }

    @Test
    public void testRightPointingArrow() {
        buttonPage.checkRightPointingArrow();
    }

    @Test
    public void testTextImageButton() {
        buttonPage.checkTextImageButton();
    }

    @Test
    public void testUIButtonTypeRoundedRect() {
        buttonPage.checkUIButtonTypeRoundedRect();
    }

    @Test
    public void testRoundedButton() {
        buttonPage.checkRoundedButton();
    }

    @Test
    public void testRoundedSymbol() {
        buttonPage.checkRoundedSymbol();
    }

    @Test
    public void testRoundedButtonType() {
        buttonPage.checkRoundedButtonType();
    }

}
