package Pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;


public class RegisterPage extends BasePage{



        public RegisterPage(WebDriver driver) {
            super(driver);
        }

        @FindBy(xpath = "//input[@placeholder='First Name']")
        private WebElement fieldNameElement;

        @FindBy (xpath = "//input[@placeholder='Last Name']")
        private WebElement fieldLastNameElement;

        @FindBy(css = "textarea[ng-model]")
        private WebElement fieldAddressElement;

        @FindBy(css = "input[ng-model='EmailAdress']")
        private WebElement fieldEmailElement;

        @FindBy(css = "input[ng-model='Phone']")
        private WebElement fieldPhoneElement;

        @FindBy(css = "input[value='FeMale']")
        private WebElement  fieldGenderElement;

        @FindBy(id = "checkbox2")
        private WebElement fieldHobbiedElement;

        @FindBy(id = "Skills")
        private WebElement fieldSkillsElement;

        @FindBy(id = "yearbox")
        private WebElement fieldDateElement;

        @FindBy(css = "select[ng-model='monthbox']")
        private WebElement fieldMonthElement;

        @FindBy(id = "daybox")
        private WebElement fieldDayElement;

        @FindBy(id = "msdd")
        private WebElement languageElement;

        @FindBy(css = ".ui-front>li>a")
        private List<WebElement> languageOptions;

        @FindBy(css = ".ui-icon")
        private WebElement fieldDelete;

        @FindBy(css = ".select2-selection")
        private WebElement fieldCountry;

        @FindBy(css = ".select2-search__field")
        private WebElement fieldCountryElement;

        @FindBy(id = "firstpassword")
        private WebElement passElement;

        @FindBy(id = "secondpassword")
        private WebElement confirmpassElement;

        @FindBy(xpath = "//a[text()='SwitchTo']")
        private WebElement switchtoElement;

        @FindBy(xpath = "//a[text()='Windows']")
        private WebElement windowElement;

        @FindBy(xpath = "//a[text()='Frames']")
        private WebElement frameElement;

        public void registerProcess(String firstName, String lastName, String adress, String email, String phone, String skill,
                                    String year, String month, String day, String password, String confirmPassword, String country, String language)
        {
            elementMethod.fillElement(fieldNameElement,firstName);
            elementMethod.fillElement(fieldLastNameElement,lastName);
            elementMethod.fillElement(fieldAddressElement,adress);
            elementMethod.fillElement(fieldEmailElement,email);
            elementMethod.fillElement(fieldPhoneElement,phone);
            elementMethod.clickElement(fieldGenderElement);
            elementMethod.clickElement(fieldHobbiedElement);
            elementMethod.selectDropDownText(fieldSkillsElement,skill);
            elementMethod.selectDropDownValue(fieldDateElement, year);
            elementMethod.selectDropDownText(fieldMonthElement,month);
            elementMethod.selectDropDownValue(fieldDayElement,day);
            selectLanguage(language);
            //elementMethod.clickElement(fieldDelete);
            elementMethod.clickElement(fieldCountry);
            enterCountryElement(country);
            elementMethod.fillElement(passElement,password);
            elementMethod.fillElement(confirmpassElement,confirmPassword);
        }

        public void selectLanguage(String language)
        {
            elementMethod.clickElement(languageElement);

            //interactionam cu o multime de elemente
            for(int i=0;i<languageOptions.size();i++)
            {
                if(languageOptions.get(i).getText().equals(language))
                {
                    elementMethod.clickElement(languageOptions.get(i));
                }
            }

            elementMethod.clickElement(fieldGenderElement);
        }

        public void enterCountryElement(String country)
        {
            elementMethod.fillElement(fieldCountryElement,country);
            fieldCountryElement.sendKeys(Keys.ENTER);
        }

        public void goToWindowPage()
        {
            elementMethod.hoverElement(switchtoElement);
            elementMethod.clickElement(windowElement);
            pageMethod.navigatetoURL("https://demo.automationtesting.in/Windows.html");

        }

        public void goToFrame()
        {
            elementMethod.hoverElement(switchtoElement);
            elementMethod.clickElement(windowElement);
            pageMethod.navigatetoURL("https://demo.automationtesting.in/Frames.html");
        }

    }


