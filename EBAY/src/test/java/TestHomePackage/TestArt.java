package TestHomePackage;
import HomePackage.Art;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestArt extends MobileAPI {
    Art art;
    @BeforeMethod
    public void init(){
        art= PageFactory.initElements(ad,Art.class);
    }
    @Test(priority = 1)
    public void TestCatgory(){
        art.clickOnCatagories();
    }
    @Test(priority = 2)
    public void TestArt() throws InterruptedException {
        art.clickOnArt();
    }
    @Test
    public void TestArtPoster() throws InterruptedException {
        art.clickOnArtPosters();
    }
    @Test(priority = 4)
    public void TestArtDrawing() throws InterruptedException {
        art.clikcOnArtDrawing();
    }
    @Test(priority = 5)
    public void TestArtPhotoGraph() throws InterruptedException {
        art.clickOnArtPhotograph();
    }
    @Test(priority = 6)
    public void TestArtPrints() throws InterruptedException {
        art.clickOnArtPrints();
    }
    @Test(priority = 7)
    public void TestArtSculptures() throws InterruptedException {
        art.clickOnArtSculptures();
    }
    @Test(priority = 8)
    public void TestFolkArtIndigenous() throws InterruptedException {
        art.clickOnFolkArtIndigenous();
    }
    @Test(priority = 9)
    public void TestMixedMediaArtCollegeArt() throws InterruptedException {
        art.clickOnMixedMediaArtCollegeArt();
    }
    @Test(priority = 10)
    public void TestPaintings() throws InterruptedException {
        art.clickOnPaintings();
    }
    @Test(priority = 11)
    public void TestTextileArtFibeArt() throws InterruptedException {
        art.clickOnTextileArtFibeArt();
    }
    @Test(priority = 12)
    public void TestOtherArt() throws InterruptedException {
        art.clickOnOtherArt();
    }

}
