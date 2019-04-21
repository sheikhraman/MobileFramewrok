package iPhone;
import AlertsPage.Alerts;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestAlertPage extends MobileAPI {
    Alerts alerts;
    @BeforeMethod
    public void init(){
        alerts = PageFactory.initElements(ad, Alerts.class);
    }
    @Test
    public void testAlertPageDialogOkCancelAction(){
        alerts.checkAlertPageDialogOkCancelAction();
    }
    @Test
    public void testcheckAlertPageDialogOtherAction(){
        alerts.checkAlertPageDialogOtherAction();
    }
    @Test
    public void testcheckAlertPageDialogSimpleAction(){
        alerts.checkAlertPageDialogSimpleAction();
    }
    @Test
    public void testcheckAlertPageShowCustomized(){
        alerts.checkAlertPageShowCustomized();
    }
    @Test
    public void testcheckAlertPageShowOkCancel(){
        alerts.checkAlertPageShowOkCancel();
    }
    @Test
    public void testcheckAlertPageShowSimple(){
        alerts.checkAlertPageShowSimple();
    }
    @Test
    public void testcheckAlertPageUIActionSheet(){
        alerts.checkAlertPageUIActionSheet();
    }
    @Test
    public void testcheckAlertPageWhole(){
        alerts.checkAlertPageWhole();
    }
    @Test
    public void testcheckAlertPageUIAlertView(){
        alerts.checkAlertPageUIAlertView();
    }
    @Test
    public void testcheckAlertPageUIAlertViewShowSimple(){
        alerts.checkAlertPageUIAlertViewShowSimple();
    }
    @Test
    public void testcheckAlertPageUIAlertViewSimpleAction(){
        alerts.checkAlertPageUIAlertViewSimpleAction();
    }
}