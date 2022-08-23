package Test;

import HelpMethods.ElementMethods;
import HelpMethods.FrameMethods;
import HelpMethods.PageMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import SharedData.ShareData;

import java.util.List;

public class FrameTest extends ShareData {

    @Test
    public void frameMethod(){
        ElementMethods element = new ElementMethods(driver);

        PageMethods page = new PageMethods(driver);

        FrameMethods frame = new FrameMethods(driver);

        WebElement skipsigninElement = driver.findElement(By.id("btn2"));
        element.clickElement(skipsigninElement);

        WebElement switchtoElement = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        element.hoverElement(switchtoElement);

        WebElement frameElement = driver.findElement(By.xpath("//a[text()='Frames']"));
        element.clickElement(frameElement);

        //navigam catre o anumita pagina
        page.navigatetoURL("https://demo.automationtesting.in/Frames.html");


        List<WebElement> frameOptions = driver.findElements(By.cssSelector(".nav-tabs>li>a"));
        element.clickElement(frameOptions.get(0));
        frame.switchIFrame("singleframe");

        WebElement checkboxElement = driver.findElement(By.cssSelector("input[type='text']"));
        String checkboxValue = "Laura";
        element.fillElement(checkboxElement,checkboxValue);
        //iese din pagina
        frame.switchDefault();


        element.clickElement(frameOptions.get(1));
        frame.switchIFrame(By.cssSelector("iframe[src='MultipleFrames.html']"));
        frame.switchIFrame(By.cssSelector("iframe[src='SingleFrame.html']"));
        WebElement checkbox1Element = driver.findElement(By.cssSelector("input[type='text']"));
        String checkbox1Value = "Laura";
        element.fillElement(checkbox1Element,checkbox1Value);

    }
}
