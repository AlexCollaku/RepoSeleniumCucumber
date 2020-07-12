package StepDefinition;

import Drivers.Web;
import Pages.BasePage;
import Pages.Facebook.IncorrectLoginPage;
import Pages.Facebook.LandingPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_scouse.An;
import org.testng.Assert;

public class LoginSD {

    LandingPage landingPage = new LandingPage();
    IncorrectLoginPage incorrectLoginPage = new IncorrectLoginPage();

//    // glue code
//    @Given("^I am on facebook landing page$") //<- regular expression
//    public void launchFacebook() {
//
//        // BasePage.openWebPage("https://www.facebook.com/");
//        Web.initDriver("https://www.facebook.com/");
//    }

    @When("^I enter '(.*)' as username$") // I enter '0 or something random' as username
    public void enterLoginUserEmail(String email) {

        landingPage.enterLoginEmail(email);
    }

    @When("^I enter '(.*)' as password$")
    public void enterLoginUserPassword(String password) {

        landingPage.enterLoginPassword(password);
    }

    @When("^I click on (login|signup) button$") // I click on <either login or signup> button
    public void click(String buttonName) {

        switch (buttonName.toLowerCase()) {
            case "login":
                landingPage.clickLoginButton();
                break;
            case "signup":
                landingPage.clickSignUpButton();
                break;
            default:
                new Exception("Invalid button name: " + buttonName);
        }
    }

    @Then("^I get invalid credentials error message$")
    public void verifyErrorMessage() {

        String actualError = incorrectLoginPage.getErrorMsg();
        String expectedError = "";
        Assert.assertEquals(actualError, expectedError,"Invalid credentials error is not as expected");
    }
    @Then("^I verify login button is enabled$")
    public void verifyIsEnabledLoginButton() {

        landingPage.isEnabledLoginButton();
    }
    @Then("^I verify Sign Up button is enabled$")
    public void verifyIsEnabledSignUpButton() {

        landingPage.isEnabledSignUpButton();
    }
    @When("^I enter '(.*)' as first name$")
    public void enterFirstName(String firstName) {

        landingPage.enterFirstName(firstName);
    }
    @And("^I enter '(.*)' as last name$")
    public void enterLastName(String lastName) {

        landingPage.enterLastName(lastName);
    }
    @And("^I enter '(.*)' as phone number$")
    public void enterSignUpPhoneNumOrEmail(String signUpPhoneNumOrEmail) {

        landingPage.enterSignUpPhoneNumberOrEmail(signUpPhoneNumOrEmail);
    }
    @And("^I enter '(.*)' as new password$")
    public void enterSignUpNewPassword(String signUpNewPassword) {

        landingPage.enterSignUpNewPassword(signUpNewPassword);
    }
    @And("^I select 'male' as gender$")
    public void clickMaleGender() {

        landingPage.selectMaleGender();
    }
    @Then("^I get 'Please enter a valid mobile number or email address.' as error message$")
    public void verifyPhoneNumErrorMsg() {

        String actualErrorMsg = landingPage.getErrorMsg();
        String expectedErrorMsg = "Please enter a valid mobile number or email address.";
        Assert.assertEquals(actualErrorMsg, expectedErrorMsg, "Invalid credentials error is not as expected");
    }
    @When("^I select '(.*)' as month$")
    public void selectMonth(String visibleText) {

        landingPage.selectMonthSignUp(visibleText);

    }
    @When("^I select '(.*)' as day$")
    public void selectDay(String visibleText) {

        landingPage.selectDaySignUp(visibleText);
    }
    @When("^I select '(.*)' as year$")
    public void selectYear(String visibleText) {

        landingPage.selectYearSignUp(visibleText);
    }

}
