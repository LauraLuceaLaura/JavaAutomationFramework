package Test;

import HelpMethods.ElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import SharedData.ShareData;

import java.util.ArrayList;
import java.util.List;

public class RegisterTest extends ShareData {

    @Test
    public void registerMethod() {

        ElementMethods element = new ElementMethods(driver);



        //identific un element
        WebElement skipsigninElement = driver.findElement(By.id("btn2"));
        element.clickElement(skipsigninElement);

        WebElement fieldNameElement = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        String nameValue = "Laura";
        element.fillElement(fieldNameElement,nameValue);

        WebElement fieldLastNameElement = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        String lastnameValue = "Lucea";
        element.fillElement(fieldLastNameElement,lastnameValue);

        WebElement fieldAddressElement = driver.findElement(By.cssSelector("textarea[ng-model]"));
        String addressValue = "Str. 1 Nr.2";
        element.fillElement(fieldAddressElement,addressValue);

        WebElement fieldEmailElement = driver.findElement(By.cssSelector("input[ng-model='EmailAdress']"));
        String emailValue = "cod@yahoo.com";
        element.fillElement(fieldEmailElement,emailValue);

        WebElement fieldPhoneElement = driver.findElement(By.cssSelector("input[ng-model='Phone']"));
        String phoneValue = "07noi2";
        element.fillElement(fieldPhoneElement,phoneValue);

        WebElement fieldGenderElement = driver.findElement(By.cssSelector("input[value='FeMale']"));
        element.clickElement(fieldGenderElement);

        WebElement fieldHobbiedElement = driver.findElement(By.id("checkbox2"));
        element.clickElement(fieldHobbiedElement);

        //dropdown(select)
        WebElement fieldSkillsElement = driver.findElement(By.id("Skills"));
        element.selectDropDownText(fieldSkillsElement,"Java");

        //Date of birth

        WebElement fieldDateElement = driver.findElement(By.id("yearbox"));
        element.selectDropDownValue(fieldDateElement, "2001");

        WebElement fieldMonthElement = driver.findElement(By.cssSelector("select[ng-model='monthbox']"));
        element.selectDropDownText(fieldMonthElement,"May");

        WebElement fieldDayElement = driver.findElement(By.id("daybox"));
        element.selectDropDownValue(fieldDayElement,"18");

        WebElement languageElement = driver.findElement(By.id("msdd"));
        element.clickElement(languageElement);

        //interactionam cu o multime de elemente
        List<WebElement> languageOptions = driver.findElements(By.cssSelector(".ui-front>li>a"));
        for(int i=0;i<languageOptions.size();i++)
        {
            if(languageOptions.get(i).getText().equals("English"))
            {
                element.clickElement(languageOptions.get(i));
            }
        }

        WebElement fieldDelete = driver.findElement(By.cssSelector(".ui-icon"));
        element.clickElement(fieldDelete);

        element.clickElement(fieldGenderElement);


        WebElement fieldCountry = driver.findElement(By.cssSelector(".select2-selection"));
        element.clickElement(fieldCountry);

        WebElement fieldCountryElement = driver.findElement(By.cssSelector(".select2-search__field"));
        String countryValue = "Australia";
        element.fillElement(fieldCountryElement,countryValue);
        fieldCountryElement.sendKeys(Keys.ENTER);

        WebElement passElement = driver.findElement(By.id("firstpassword"));
        String passValue = "parola";
        element.fillElement(passElement,passValue);

        WebElement confirmpassElement = driver.findElement(By.id("secondpassword"));
        String confirmpassValue = "parola";
        element.fillElement(confirmpassElement,confirmpassValue);

    }
}
