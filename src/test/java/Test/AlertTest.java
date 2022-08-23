package Test;

import HelpMethods.AlertMethods;
import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import SharedData.ShareData;

import java.util.List;

public class AlertTest extends ShareData {

    @Test
    public void alertMethod(){

        ElementMethods element = new ElementMethods(driver);

        PageMethods page = new PageMethods(driver);

        AlertMethods alert = new AlertMethods(driver);

        WebElement skipsigninElement = driver.findElement(By.id("btn2"));
        element.clickElement(skipsigninElement);

        WebElement switchtoElement = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        element.hoverElement(switchtoElement);


        WebElement alertsElement = driver.findElement(By.xpath("//a[text()='Alerts']"));
        element.clickElement(alertsElement);

        //navigam catre o anumita pagina
        page.navigatetoURL("https://demo.automationtesting.in/Alerts.html");


        List<WebElement> alertOptions = driver.findElements(By.cssSelector(".nav-stacked>li>a"));
        element.clickElement( alertOptions.get(0));

        WebElement alertOkButton = driver.findElement(By.cssSelector("#OKTab>button"));
        element.clickElement(alertOkButton);
        alert.alertOkProcess();

        element.clickElement(alertOptions.get(1));

        WebElement alertOkCancelButton = driver.findElement(By.cssSelector(".btn-primary"));
        element.clickElement(alertOkCancelButton);
        alert.alertCancelProcess();

        element.clickElement(alertOptions.get(2));

        WebElement alertTextBox = driver.findElement(By.cssSelector(".btn-info"));
        element.clickElement(alertTextBox);
        alert.alertTextBoxProcess("Mesaj Random");
    }
}
