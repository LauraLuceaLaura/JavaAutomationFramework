package SharedData;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ShareData {

    public WebDriver driver;


    public void prepareDriver(){
        //setez driverul de chrome
        String cicd = System.getProperty("cicd");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        if(Boolean.parseBoolean(cicd))
        {
            options.addArguments("--headless");
        }
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--no-sandbox");
        //deschid un browser de chrome
        driver = new ChromeDriver(options);
        //accesez un anumit URL
        driver.get("https://demo.automationtesting.in/Index.html");

        //facem browser-ul maximaze
        driver.manage().window().maximize();
    }


    public void quitDriver(){
         driver.quit();
    }

}
