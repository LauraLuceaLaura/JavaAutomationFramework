package Test;

import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
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

        PageMethods page = new PageMethods(driver);

        ElementMethods element = new ElementMethods(driver);

        //identific un element
        WebElement signinElement = driver.findElement(By.id("btn1"));
        element.clickElement(signinElement);

        //validam o anumita pagina
        page.validateTitlePage("SignIn");


        WebElement emailElement = driver.findElement(By.cssSelector("input[ng-model='Email']"));
        String emailValue = "codEmail@yahoo.com";
        element.fillElement(emailElement,emailValue);

        WebElement passwordElement = driver.findElement(By.cssSelector("input[ng-model='Password']"));
        String passwordValue = "Parola123";
        element.fillElement(passwordElement,passwordValue);

        WebElement enterElement = driver.findElement(By.id("enterbtn"));
        element.clickElement(enterElement);

        //validam un mesaj
        WebElement errormessageElement = driver.findElement(By.id("errormsg"));
        element.validateElementText(errormessageElement, "Invalid User Name or PassWord");

        //inchidem un browser
        //driver.quit();

    }
}
