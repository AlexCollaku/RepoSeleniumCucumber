package StepDefinition;

import Drivers.Web;
import Pages.Facebook.LandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Set;

public class FBLinks {

    LandingPage landingPage = new LandingPage();

    @Given("^I am on facebook landing page now$")
    public void launchFacebook() {

        Web.initDriver("https://www.facebook.com/");
    }

    @When("^I click on Terms link$")
    public void clickTermsLink() {

        landingPage.clickTermsLinkLandPage();
    }

    @Then("^I verify user is on 'Terms of Service' page title$")
    public void verifyTermsOfServicePageTitle() {

        String currentWindowHandle = landingPage.getCurrentWindowHandle();
        Set<String> allWindowHandles = landingPage.getAllWindowHandles();

        for(String handle : allWindowHandles) {
            if(!handle.equalsIgnoreCase(currentWindowHandle)) {
                landingPage.switchWindow(handle);
            }
            landingPage.getWebPageTitle();
        }
    }

    @Then("^I verify facebook landing page is open$")
    public void verifyFacebookIsOpen() {

        String currWindowHandle = landingPage.getCurrentWindowHandle();
        Set<String> allWindHandles = landingPage.getAllWindowHandles();

        for (String handle : allWindHandles) {
            if(!handle.equalsIgnoreCase(currWindowHandle)) {
                landingPage.switchWindow(handle);
            }
        }
        landingPage.getWebPageTitle();
    }

    @Then("^I close all facebook windows$")
    public void closeAllFacebookWindow() {

        Web.quitDriver();
    }

    @When("^I click on Data Policy link$")
    public void clickOnDataPolicy() {

        landingPage.clickDataPolicyLandPage();
    }

    @When("^I click on Cookie Policy$")
    public void clickOnCookiePolicy() {

        landingPage.clickCookiePolicyLandPage();
    }

    @Then("^I verify user is on 'Data Policy' page title$")
    public void verifyDataPolicyPageTitle() {

        String currentWindowHandle = landingPage.getCurrentWindowHandle();
        Set<String> allWindowHandles = landingPage.getAllWindowHandles();

        for(String handle : allWindowHandles) {
            if(!handle.equalsIgnoreCase(currentWindowHandle)) {
                landingPage.switchWindow(handle);
            }
        }
        landingPage.getWebPageTitle();
    }

    @Then("^I verify user is on 'Cookie Policy' page title$")
    public void verifyCookiePolicyPageTitle() {

        String currentWindowHandle = landingPage.getCurrentWindowHandle();
        Set<String> allWindowHandles = landingPage.getAllWindowHandles();

        for(String handle : allWindowHandles) {
            if(!handle.equalsIgnoreCase(currentWindowHandle)) {
                landingPage.switchWindow(handle);
            }
        }
        landingPage.getWebPageTitle();
    }

}

