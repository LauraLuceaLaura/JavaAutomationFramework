package Test;

import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import Pages.IndexPage;
import Pages.LogInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import SharedData.ShareData;

public class LoginTest extends ShareData {

    @Test
    public void loginMethod(){

        IndexPage indexPage = new IndexPage(driver);
        indexPage.singInClickOnElement();

        LogInPage logIn = new LogInPage(driver);
        logIn.logInProcess("laura@yahoo.com", "oparola123");

        //inchidem un browser
        //driver.quit();

    }
}
