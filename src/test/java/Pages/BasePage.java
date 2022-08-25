package Pages;

import HelpMethods.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;
    public AlertMethods alertMethods;
    public ElementMethods elementMethod;
    public FrameMethods frameMethod;
    public PageMethods pageMethod  ;
    public WindowMethods windowMethod;

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        alertMethods = new AlertMethods(driver);
        elementMethod = new ElementMethods(driver);
        frameMethod = new FrameMethods(driver);
        pageMethod = new PageMethods(driver);
        windowMethod = new WindowMethods(driver);
    }
}
