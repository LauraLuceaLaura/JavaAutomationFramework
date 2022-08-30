package SharedData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.sql.Driver;

public class ShareData {

    public WebDriver driver;


    public void prepareDriver(){
        //setez driverul de chrome
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        //deschid un browser de chrome
        driver = new ChromeDriver();
        //accesez un anumit URL
        driver.get("https://demo.automationtesting.in/Index.html");

        //facem browser-ul maximaze
        driver.manage().window().maximize();
    }


    public void quitDriver(){
         driver.quit();
    }

}
