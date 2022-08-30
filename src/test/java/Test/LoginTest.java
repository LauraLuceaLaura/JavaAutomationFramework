package Test;

import ObjectData.LoginObject;
import Pages.IndexPage;
import Pages.LogInPage;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class LoginTest extends Hooks {

    @Test
    public void loginMethod(){

        LoginObject loginTest = new LoginObject(testData);

        IndexPage indexPage = new IndexPage(driver);
        indexPage.singInClickOnElement();

        LogInPage logIn = new LogInPage(driver);
        logIn.logInProcess(loginTest);

    }
}
