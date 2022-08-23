package Test;

import Pages.IndexPage;
import Pages.RegisterPage;
import SharedData.ShareData;
import org.testng.annotations.Test;

public class RegisterTest extends ShareData {

    @Test
    public void registerMethod() {

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSingIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.registerProcess("Laura","Lucea","Str.1 Nr.2","cod@email.com", "071234567", "Java",
                "2001","May","18","parola","parola","Australia","English");

    }
}
