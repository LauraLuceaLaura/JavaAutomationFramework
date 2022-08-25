package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterTest {

    public WebDriver driver;

    @Test
    public void registerTest()
    {
        //setez driverul de chrome
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        //deschid un browser de chrome
        driver = new ChromeDriver();
        //accesez un anumit URL
        driver.get("https://shop.demoqa.com/my-account/");
        //facem browser-ul maximaze
        driver.manage().window().maximize();

        WebElement userNameElement = driver.findElement(By.id("reg_username"));
        String userName = "swfdsaxedad12";
        userNameElement.sendKeys(userName);

        WebElement emailElement = driver.findElement(By.id("reg_email"));
        String email = "lauraLaura12@email.com";
        emailElement.sendKeys(email);

        WebElement passwordElement = driver.findElement(By.id("reg_password"));
        String password = "parolagenerica";
        passwordElement.sendKeys(password);

        WebElement showPassword = driver.findElement(By.xpath("//form[contains(@class,'register')]//span[@class='show-password-input']"));
        showPassword.click();

        WebElement clickRegister = driver.findElement(By.cssSelector("button[value='Register']"));
        clickRegister.click();



    }

}
