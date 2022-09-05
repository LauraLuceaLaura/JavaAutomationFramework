package Test;

import ObjectData.AlertObject;
import Pages.AlertPage;
import Pages.IndexPage;
import Pages.RegisterPage;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class AlertTest extends Hooks {

    @Test
    public void alertMethod(){

        AlertObject alertObject = new AlertObject(testData);

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSingIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.goToAlert();

        AlertPage alertPage = new AlertPage(driver);
        alertPage.alertOkProcess();
        alertPage.alertCancelProcess();
        alertPage.alertText(alertObject);

    }
}
