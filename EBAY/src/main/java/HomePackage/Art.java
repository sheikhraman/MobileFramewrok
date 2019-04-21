package HomePackage;
import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Art extends MobileAPI {
    @FindBy(xpath = "//android.widget.TextView[@content-desc='Categories button']")
    WebElement catagories;
    @FindBy(xpath = "//android.widget.TextView[@text='Art']")
    WebElement Art;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView")
    WebElement ArtPosters;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.TextView")
    WebElement ArtDrawings;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.TextView")
    WebElement ArtPhotograph;
    @FindBy(xpath = "//android.widget.TextView[@text='Art Prints']")
    WebElement ArtPrints;
    @FindBy(xpath = "//android.widget.TextView[@text='Art Sculptures']")
    WebElement ArtSculptures;
    @FindBy(xpath = "//android.widget.TextView[@text='Folk Art & Indigenous Art']")
    WebElement FolkArtIndigenous;
    @FindBy(xpath = "//android.widget.TextView[@text='Mixed Media Art & Collage Art']")
    WebElement MixedMediaArtCollegeArt;
    @FindBy(xpath = "//android.widget.TextView[@text='Paintings']")
    WebElement Paintings;
    @FindBy(xpath = "//android.widget.TextView[@text='Textile Art & Fiber Art']")
    WebElement TextileArtFibeArt;
    @FindBy(xpath = "//android.widget.TextView[@text='Other Art']")
    WebElement OtherArt;
    public void clickOnCatagories(){
        catagories.click();
    }
    public void clickOnArt() throws InterruptedException {
        clickOnCatagories();
        sleep(25);
        Art.click();
        sleep(10);
    }
    public void clickOnArtPosters() throws InterruptedException {
        sleep(25);
        clickOnArt();
        sleep(10);
        ArtPosters.click();
    }
    public void clikcOnArtDrawing() throws InterruptedException {
        sleep(25);
        clickOnArt();
        sleep(10);
        ArtDrawings.click();
    }
    public void clickOnArtPhotograph() throws InterruptedException {
        clickOnArt();
        sleep(10);
        ArtPhotograph.click();
    }
    public void clickOnArtPrints() throws InterruptedException {
        clickOnArt();
        sleep(10);
        ArtPrints.click();
    }
    public void clickOnArtSculptures() throws InterruptedException {
        clickOnArt();
        sleep(10);
        ArtSculptures.click();
    }
    public void clickOnFolkArtIndigenous() throws InterruptedException {
        clickOnArt();
        sleep(10);
        FolkArtIndigenous.click();
    }
    public void clickOnMixedMediaArtCollegeArt() throws InterruptedException {
        clickOnArt();
        sleep(10);
        MixedMediaArtCollegeArt.click();
    }
    public void clickOnPaintings() throws InterruptedException {
        clickOnArt();
        sleep(10);
        Paintings.click();
    }
    public void clickOnTextileArtFibeArt() throws InterruptedException {
        clickOnArt();
        sleep(10);
        TextileArtFibeArt.click();
    }
    public void clickOnOtherArt() throws InterruptedException {
        clickOnArt();
        sleep(10);
        OtherArt.click();
    }
}
