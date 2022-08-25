package Homework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TitleTest  {

    public WebDriver driver;

    @Test
    public void titileTest()
    {
        //setez driverul de chrome
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        //deschid un browser de chrome
        driver = new ChromeDriver();
        //accesez un anumit URL
        driver.get("https://shop.demoqa.com/");
        //facem browser-ul maximaze
        driver.manage().window().maximize();

        WebElement titleElement = driver.findElement(By.cssSelector("img[style='display: block;-webkit-user-select: none;margin: auto;background-color: hsl(0, 0%, 90%);transition: background-color 300ms;']"));
        Boolean p = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", titleElement);
        //verify if status is true
        if (p) {
            System.out.println("Logo present");
        } else {
            System.out.println("Logo not present");
        }
    }

}
