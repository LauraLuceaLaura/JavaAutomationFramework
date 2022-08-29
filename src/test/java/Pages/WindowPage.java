package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WindowPage extends BasePage
{
    public WindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".nav-stacked>li>a")
    private List<WebElement> windowsOptions;

    @FindBy(css = "#Tabbed>a>button")
    private WebElement clickTab;

    @FindBy(css = "#Seperate>button")
    private WebElement clickWindow;

    @FindBy(css = "#Multiple>button")
    private WebElement multipleWindow;

    public void windowProcess()
    {
        elementMethod.clickElement(windowsOptions.get(1));
        elementMethod.clickElement(clickWindow);
        windowMethod.switchToSpecificTab(1);
        //inchidem tabul curent
        pageMethod.closeCurrentPage();
        windowMethod.switchToSpecificTab(0);
    }

    public void tabProcess()
    {
        elementMethod.clickElement(windowsOptions.get(0));
        elementMethod.clickElement(clickTab);
        //cate taburi gaseste deschise
        windowMethod.switchToSpecificTab(1);
        //inchidem tabul curent
        pageMethod.closeCurrentPage();
        windowMethod.switchToSpecificTab(0);
    }


    public void multipleTabProcess()
    {
        elementMethod.clickElement(windowsOptions.get(2));
        elementMethod.clickElement(multipleWindow);
        windowMethod.switchToSpecificTab(2);
        //inchidem tabul curent
        pageMethod.closeCurrentPage();
        windowMethod.switchToSpecificTab(1);
        pageMethod.closeCurrentPage();
        windowMethod.switchToSpecificTab(0);
    }

}
