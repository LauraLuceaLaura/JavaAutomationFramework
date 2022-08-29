package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage extends BasePage {

    public IndexPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "btn2")
    private WebElement skipsigninElement;

    @FindBy(id = "btn1")
    private WebElement singInElement;

    public void clickSkipSingIn()
    {
        elementMethod.clickElement(skipsigninElement);
    }

    public void singInClickOnElement () {elementMethod.clickElement(singInElement);}

}