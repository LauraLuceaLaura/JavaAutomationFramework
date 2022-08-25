package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest {

    public WebDriver driver;

    @Test
    public void logInTest()
    {
        //setez driverul de chrome
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        //deschid un browser de chrome
        driver = new ChromeDriver();
        //accesez un anumit URL
        driver.get("https://shop.demoqa.com/shop-demoqa?redirect_to=https%3A%2F%2Fshop.demoqa.com%3A443%2Fmy-account%2F&aiowps_login_msg_id=session_expired");
        //facem browser-ul maximaze
        driver.manage().window().maximize();

        WebElement userElement = driver.findElement(By.id("user_login"));
        String userName = "swfdsaxedad1" ; //+ System.currentTimeMillis();
        userElement.sendKeys(userName);

        WebElement passwordElement = driver.findElement(By.id("user_pass"));
        String password = "parolagenerica";
        passwordElement.sendKeys(password);

        WebElement checkRemeber = driver.findElement(By.id("rememberme"));
        checkRemeber.click();

        WebElement logInButton = driver.findElement(By.id("wp-submit"));
        logInButton.click();

        WebElement logInText = driver.findElement(By.xpath("//div[@class='woocommerce-MyAccount-content']/p[1]"));
        String textVerify = logInText.getText();
        Assert.assertTrue(textVerify.contains("swfdsaxedad"));

//        WebElement errormessageElement = driver.findElement(By.id("login_error"));
//        String actualError = errormessageElement.getText();
//        Assert.assertEquals(actualError,": The username or password you entered is incorrect. ");

    }

}
