package HomePackage;
import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Catagories extends MobileAPI {
    @FindBy(xpath = "//android.widget.TextView[@content-desc='Categories button']")
    WebElement catagories;
    @FindBy(xpath = "//android.widget.TextView[@text='Antiques']")
    WebElement Antiques;
    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Collapsed Architectural & Garden Button\"]/android.widget.TextView")
    WebElement ArchitecturalAndGarden;
    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Collapsed Asian Antiques Button\"]/android.widget.TextView")
    WebElement AsianAntitues;
    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Collapsed Decorative Arts Button\"]/android.widget.TextView")
    WebElement DecorativeAntics;
    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Collapsed Ethnographic Button\"]/android.widget.TextView")
    WebElement EthnographicAntiques;
    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Collapsed Furniture Button\"]/android.widget.TextView")
    WebElement Furniture;
    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Collapsed Home & Hearth Button\"]/android.widget.TextView")
    WebElement HomeAndHeart;
    @FindBy(xpath = "//android.widget.TextView[@text='Incunabula']")
    WebElement Incunabula;
    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Collapsed Linens & Textiles (Pre-1930) Button\"]/android.widget.TextView")
    WebElement Linestextile;
    @FindBy(xpath = "//android.widget.TextView[@text='Manuscripts']")
    WebElement Manuscripts;
    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Collapsed Maps, Atlases & Globes Button\"]/android.widget.TextView")
    WebElement MapAtlassGlobe;
    @FindBy(xpath = "//android.widget.TextView[@text='Maritime']")
    WebElement Maritime;
    public void searchCatagories(){
     catagories.click();
    }
    public void searchAntiques() throws InterruptedException {
        sleep(30);
        searchCatagories();
        sleep(20);
        Antiques.click();
    }
    public void searchArtitucuralAndGarden() throws InterruptedException {
        searchAntiques();
        ArchitecturalAndGarden.click();
    }
    public void searchAsianAntique() throws InterruptedException {
        searchAntiques();
        AsianAntitues.click();
    }
    public void searchDecorativeAntiques() throws InterruptedException {
        searchAntiques();
        DecorativeAntics.click();
    }
    public void searchEthnographic() throws InterruptedException {
        searchAntiques();
        EthnographicAntiques.click();
    }
    public void searchFurniture() throws InterruptedException {
        searchAntiques();
        Furniture.click();
    }
    public void searchHomeAndHeart() throws InterruptedException {
        searchAntiques();
        HomeAndHeart.click();
    }
    public void searchIncunabula() throws InterruptedException {
        searchAntiques();
        Incunabula.click();
    }
    public void searchlinenAndTextile() throws InterruptedException {
        searchAntiques();
        Linestextile.click();
    }
    public void searchManuscripts() throws InterruptedException {
        searchAntiques();
        Manuscripts.click();
    }
    public void searchMapAtlassGlobe() throws InterruptedException {
        searchAntiques();
        MapAtlassGlobe.click();
    }
    public void searchMaritime() throws InterruptedException {

        searchAntiques();
        Maritime.click();
    }


}
