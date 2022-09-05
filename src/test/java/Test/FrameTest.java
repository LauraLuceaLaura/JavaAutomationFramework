package Test;

import HelpMethods.ElementMethods;
import HelpMethods.FrameMethods;
import HelpMethods.PageMethods;
import ObjectData.FrameObject;
import Pages.FramePage;
import Pages.IndexPage;
import Pages.RegisterPage;
import Pages.WindowPage;
import SharedData.Hooks;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import SharedData.ShareData;

import java.util.List;

public class FrameTest extends Hooks {

    @Test
    public void frameMethod(){

        FrameObject frameObject = new FrameObject(testData);
        frameObject.prepareData(testData);

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSingIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.goToFrame();

        FramePage framePage = new FramePage(driver);
        framePage.singleFrame(frameObject);
        framePage.multipleFrame(frameObject);

    }
}
