package HelpMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertMethods {
    public WebDriver driver;

    public AlertMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void alertOkProcess(){
        Alert alertOk = driver.switchTo().alert();
        alertOk.accept();
    }

    public void alertCancelProcess(){
        Alert alertCancelOk = driver.switchTo().alert();
        alertCancelOk.dismiss();

    }

    public void alertTextBoxProcess(String name){
        Alert alertText = driver.switchTo().alert();
        alertText.sendKeys(name);
        alertText.accept();

    }

}
