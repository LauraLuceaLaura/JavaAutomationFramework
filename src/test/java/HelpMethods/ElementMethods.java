package HelpMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ElementMethods {

    public WebDriver driver;

    public ElementMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement(WebElement element){
        element.click();
    }
    public void fillElement(WebElement element, String value ){
        element.sendKeys(value);

    }
    public void hoverElement(WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public void validateElementText(WebElement element, String value){
        String actualError = element.getText();
        Assert.assertEquals(actualError,value);
    }

    public void selectDropDownText(WebElement element,String value){
        Select skillsSelect = new Select(element);
        skillsSelect.selectByVisibleText(value);
    }

    public void selectDropDownValue(WebElement element,String value){
        Select skillsSelect = new Select(element);
        skillsSelect.selectByValue(value);
    }

}
