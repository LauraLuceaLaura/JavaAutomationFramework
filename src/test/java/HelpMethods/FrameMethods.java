package HelpMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameMethods {

    public WebDriver driver;

    public FrameMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void switchIFrame(String value){
        driver.switchTo().frame(value);
    }
    public void switchIFrame(By locator){
        driver.switchTo().frame(driver.findElement(locator));
    }
    public void switchDefault(){
        driver.switchTo().defaultContent();
    }

}
