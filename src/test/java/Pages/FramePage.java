package Pages;

import ObjectData.FrameObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FramePage extends BasePage
{
    public FramePage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(css = ".nav-tabs>li>a")
    private List<WebElement> frameOptions;

    @FindBy(css = "input[type='text']")
    private WebElement checkboxElement;

    public void singleFrame(FrameObject frameObject)
    {
        elementMethod.clickElement(frameOptions.get(0));
        frameMethod.switchIFrame("singleframe");
        elementMethod.fillElement(checkboxElement, frameObject.getSingleFrameValue());
        //iese din pagina
        frameMethod.switchDefault();
    }

    public void multipleFrame(FrameObject frameObject)
    {
        elementMethod.clickElement(frameOptions.get(1));
        frameMethod.switchIFrame(By.cssSelector("iframe[src='MultipleFrames.html']"));
        frameMethod.switchIFrame(By.cssSelector("iframe[src='SingleFrame.html']"));
        elementMethod.fillElement(checkboxElement, frameObject.getMultipleFrameValue());
    }
}
