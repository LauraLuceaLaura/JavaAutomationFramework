package Test;

import ObjectData.RegisterObject;
import Pages.IndexPage;
import Pages.RegisterPage;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class RegisterTest extends Hooks {

    @Test
    public void registerMethod() {

        RegisterObject registerObject = new RegisterObject(testData);

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSingIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.registerProcess(registerObject);

    }
}