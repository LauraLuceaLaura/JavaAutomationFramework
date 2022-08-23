package Test;

import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import HelpMethods.WindowMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.testng.annotations.Test;
import SharedData.ShareData;

import java.util.ArrayList;
import java.util.List;

public class WindowTest extends ShareData {

    @Test
    public void windowMethod(){
        ElementMethods element = new ElementMethods(driver);

        PageMethods page = new PageMethods(driver);

        WindowMethods window = new WindowMethods(driver);

        WebElement skipsigninElement = driver.findElement(By.id("btn2"));
        element.clickElement(skipsigninElement);

        WebElement switchtoElement = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        element.hoverElement(switchtoElement);

        WebElement windowElement = driver.findElement(By.xpath("//a[text()='Windows']"));
        element.clickElement(windowElement);

        //navigam catre o anumita pagina
        page.navigatetoURL("https://demo.automationtesting.in/Windows.html");

        List<WebElement> windowsOptions = driver.findElements(By.cssSelector(".nav-stacked>li>a"));
        element.clickElement(windowsOptions.get(0));

        //#id

        WebElement clickTab = driver.findElement(By.cssSelector("#Tabbed>a>button"));
        element.clickElement(clickTab);

        //cate taburi gaseste deschise
        window.switchToSpecificTab(1);
        //inchidem tabul curent
        page.closeCurrentPage();
        window.switchToSpecificTab(0);

        element.clickElement(windowsOptions.get(1));
        WebElement clickWindow = driver.findElement(By.cssSelector("#Seperate>button"));
        element.clickElement(clickWindow);

        window.switchToSpecificTab(1);
        //inchidem tabul curent
        page.closeCurrentPage();
        window.switchToSpecificTab(0);


        element.clickElement(windowsOptions.get(2));
        WebElement multipleWindow = driver.findElement(By.cssSelector("#Multiple>button"));
        element.clickElement(multipleWindow);

        window.switchToSpecificTab(2);
        //inchidem tabul curent
        page.closeCurrentPage();
        window.switchToSpecificTab(1);
        page.closeCurrentPage();
        window.switchToSpecificTab(0);
    }
}
