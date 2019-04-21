package AlertsPage;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class Alerts extends MobileAPI {

    @FindBy(xpath = "//XCUIElementTypeApplication[@name='UICatalog']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable")
    WebElement alertPageWhole;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Secure Text Input']")
    WebElement alertPageUIActionSheet;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name='Show OK-Cancel'])[1]")
    WebElement alertPageShowSimple;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='AlertsViewController.m - dialogSimpleAction']")
    WebElement alertPageDialogSimpleAction;

    @FindBy (xpath = "(//XCUIElementTypeStaticText[@name='Show OK-Cancel'])[1]")
    WebElement alertPageShowOkCancel;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='AlertsViewController.m - dialogSimpleAction']")
    WebElement alertPageDialogOkCancelAction;

    @FindBy (xpath = "//XCUIElementTypeStaticText[@name='Show Customized']")
    WebElement alertPageShowCustomized;

    @FindBy (xpath = "//XCUIElementTypeStaticText[@name='AlertsViewController.m - dialogOtherAction']")
    WebElement alertPageDialogOtherAction;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name='UIAlertView'])[1]")
    WebElement alertPageUIAlertView;

    @FindBy (xpath = "(//XCUIElementTypeStaticText[@name='Show Simple'])[2]")
    WebElement alertPageUIAlertViewShowSimple;

    @FindBy (xpath = "//XCUIElementTypeStaticText[@name='AlertsViewController.m - alertSimpleAction']")
    WebElement alertPageUIAlertViewSimpleAction;

    public void checkAlertPageWhole(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Alert Page Whole tab");
        alertPageWhole.click();
    }
    public void checkAlertPageUIActionSheet(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Alert Page UI Action sheet");
        alertPageUIActionSheet.click();
    }
    public void checkAlertPageShowSimple(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Alert Page Show Simple");
        alertPageShowSimple.click();
    }
    public void checkAlertPageDialogSimpleAction(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Alert Page Dialog Simple Actions");
        alertPageDialogSimpleAction.click();
    }
    public void checkAlertPageShowOkCancel(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Alert Page click on Cancel");
        alertPageShowOkCancel.click();
    }
    public void checkAlertPageDialogOkCancelAction(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Alert Page Cancel Actions");
        alertPageDialogOkCancelAction.click();
    }
    public void checkAlertPageShowCustomized(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Alert Page Show Coustomized");
        alertPageShowCustomized.click();
    }
    public void checkAlertPageDialogOtherAction(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Alert Page Other Actions");
        alertPageDialogOtherAction.click();
    }
    public void checkAlertPageUIAlertView(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Alert Page UI Alert View");
        alertPageUIAlertView.click();
    }
    public void checkAlertPageUIAlertViewShowSimple(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Alert Page ");
        alertPageUIAlertViewShowSimple.click();
    }
    public void checkAlertPageUIAlertViewSimpleAction() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Alert Page Simple actions");
        alertPageUIAlertViewSimpleAction.click();
    }
}