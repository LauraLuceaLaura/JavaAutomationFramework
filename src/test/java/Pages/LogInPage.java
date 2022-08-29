package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage
{
    public LogInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[ng-model='Email']")
    private WebElement emailElement;

    @FindBy(css = "input[ng-model='Password']")
    private WebElement passwordElement;

    @FindBy(id = "enterbtn")
    private WebElement enterElement;

    @FindBy(id = "errormsg")
    private WebElement errormessageElement;

    public void logInProcess(String email, String password)
    {
        //validam o anumita pagina
        pageMethod.validateTitlePage("SignIn");
        elementMethod.fillElement(emailElement, email);
        elementMethod.fillElement(passwordElement,password);
        elementMethod.clickElement(enterElement);
        //validam un mesaj
        elementMethod.validateElementText(errormessageElement, "Invalid User Name or PassWord");
    }

}