package Test;

import HelpMethods.ElementMethods;
import HelpMethods.FrameMethods;
import HelpMethods.PageMethods;
import Pages.FramePage;
import Pages.IndexPage;
import Pages.RegisterPage;
import Pages.WindowPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import SharedData.ShareData;

import java.util.List;

public class FrameTest extends ShareData {

    @Test
    public void frameMethod(){

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSingIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.goToFrame();

        FramePage framePage = new FramePage(driver);
        framePage.singleFrame("val");
        framePage.multipleFrame("valoare");

    }
}
