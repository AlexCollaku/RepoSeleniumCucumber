package Pages.Facebook;

import Pages.BasePage;
import org.openqa.selenium.By;

public class LandingPage extends BasePage {

    // locators for web-element on Landing Page
    By loginEmailLocator = By.id("email");
    By loginPasswordLocator = By.id("pass");
    By loginButtonLocator = By.id("loginbutton");
    By signUpButtonLocator = By.name("websubmit");
    By firstNameLocator = By.name("firstname");
    By lastNameLocator = By.name("lastname");
    By signUpPhoneNumOrEmailLocator = By.name("reg_email__");
    By signUpNewPasswordLocator = By.id("password_step_input");
    By maleGenderLocator = By.xpath("//input[@value='2']");
    By signUpPhoneNumErrorMsg = By.xpath("//div[contains(text(),'Please enter a valid mobile number or email address.')]");
    By monthLocator = By.id("month");
    By dayLocator = By.id("day");
    By yearLocator = By.id("year");
    By termsLinkLocator = By.id("terms-link");
    By dataPolicyLocator = By.id("privacy-link");
    By cookiePolicyLocator = By.id("cookie-use-link");




    // methods to interact with Landing Page elements
    public void enterLoginEmail(String userEmail) {

        type(loginEmailLocator, userEmail);
    }

    public void enterLoginPassword(String userPassword) {

        type(loginPasswordLocator, userPassword);
    }

    public void clickLoginButton() {

        clickThis(loginButtonLocator);
    }

    public void clickSignUpButton() {

        clickThis(signUpButtonLocator);
    }

    public boolean isEnabledLoginButton() {

       return isWebElementEnabled(loginButtonLocator);
    }

    public boolean isEnabledSignUpButton() {

        return isWebElementEnabled(signUpButtonLocator);
    }

    public void enterFirstName( String firstName) {

        type(firstNameLocator, firstName);

    }

    public void enterLastName(String lastName) {

        type(lastNameLocator, lastName);

    }

    public void enterSignUpPhoneNumberOrEmail(String phoneNumOrEmail) {

        type(signUpPhoneNumOrEmailLocator, phoneNumOrEmail);

    }

    public void enterSignUpNewPassword(String newPassword) {

        type(signUpNewPasswordLocator, newPassword);

    }

    public void selectMaleGender() {

        clickThis(maleGenderLocator);
    }

    public String getErrorMsg() {

        return getTextFromElement(signUpPhoneNumErrorMsg);
    }

    public void selectMonthSignUp(String visibleText) {

        selectFromDropdownByVisibleText(monthLocator, visibleText);
    }

    public void selectDaySignUp(String visibleText) {

        selectFromDropdownByVisibleText(dayLocator, visibleText);
    }

    public void selectYearSignUp(String visibleText) {

        selectFromDropdownByVisibleText(yearLocator, visibleText);
    }

    public void clickTermsLinkLandPage() {

        clickThis(termsLinkLocator);
    }

    public void clickDataPolicyLandPage() {

        clickThis(dataPolicyLocator);
    }

    public void clickCookiePolicyLandPage() {

        clickThis(cookiePolicyLocator);
    }





}
