package TestKeyWord;
import KeyWordDrive.KeyWordDriven;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class KeysMySql extends MobileAPI {
    KeyWordDriven keys;
    @BeforeMethod
    public void init(){
        keys = PageFactory.initElements(ad,KeyWordDriven.class);
    }

    @Test
    public void testDBKeyWordDriven()throws Exception{
        keys.readMysql();
    }

}
