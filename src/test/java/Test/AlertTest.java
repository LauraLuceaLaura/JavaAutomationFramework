package Test;

import Pages.AlertPage;
import Pages.IndexPage;
import Pages.RegisterPage;
import SharedData.ShareData;
import org.testng.annotations.Test;

public class AlertTest extends ShareData {

    @Test
    public void alertMethod(){

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSingIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.goToAlert();

        AlertPage alertPage = new AlertPage(driver);
        alertPage.alertOkProcess();
        alertPage.alertCancelProcess();
        alertPage.alertText("mesaj");

    }
}
