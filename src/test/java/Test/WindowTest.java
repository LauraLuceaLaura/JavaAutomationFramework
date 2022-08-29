package Test;

import Pages.IndexPage;
import Pages.RegisterPage;
import Pages.WindowPage;
import SharedData.ShareData;
import org.testng.annotations.Test;

public class WindowTest extends ShareData {

    @Test
    public void windowMethod(){

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSingIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.goToWindowPage();

        WindowPage windowPage = new WindowPage(driver);
        windowPage.tabProcess();
        windowPage.windowProcess();
        windowPage.multipleTabProcess();

    }
}
