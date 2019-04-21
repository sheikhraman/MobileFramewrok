package TestHomePackage;

import HomePackage.Catagories;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCatagories extends MobileAPI {
    Catagories catagories;
    @BeforeMethod
    public void init(){
        catagories= PageFactory.initElements(ad,Catagories.class);
    }
    @Test
    public void TestCatagories(){
        catagories.searchCatagories();
    }
    @Test
    public void TestAntiques() throws InterruptedException {
        catagories.searchAntiques();
    }
    @Test
    public void TestArtitucuralAndGarden() throws InterruptedException {
        catagories.searchArtitucuralAndGarden();
    }
    @Test
    public void TestAsianAntique() throws InterruptedException {
        catagories.searchAsianAntique();
    }
    @Test
    public void TestDecorativeAntiques() throws InterruptedException {
        catagories.searchDecorativeAntiques();
    }
    @Test
    public void TestEthnographic() throws InterruptedException {
        catagories.searchEthnographic();
    }
    @Test
    public void TestFurniture() throws InterruptedException {
        catagories.searchFurniture();
    }
    @Test
    public void TestHomeAndHeart() throws InterruptedException {
        catagories.searchHomeAndHeart();
    }
    @Test
    public void TestIncunabula() throws InterruptedException {
        catagories.searchIncunabula();
    }
    @Test
    public void TestlinenAndTextile() throws InterruptedException {
        catagories.searchlinenAndTextile();
    }
    @Test
    public void TestManuscripts() throws InterruptedException {
        catagories.searchManuscripts();
    }
    @Test
    public void TestMapAtlassGlobe() throws InterruptedException {
        catagories.searchMapAtlassGlobe();
    }
    @Test
    public void TestMaritime() throws InterruptedException {
        catagories.searchMaritime();
    }
}
