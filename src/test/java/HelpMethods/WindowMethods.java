package HelpMethods;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class WindowMethods {

    public WebDriver driver;

    public WindowMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToSpecificTab(Integer id){
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(id));
        System.out.println(driver.getTitle());
    }
}
