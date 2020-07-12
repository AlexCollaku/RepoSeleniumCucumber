package StepDefinition;

import Drivers.Web;
import Pages.Darksky.LandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TempSummarySD {

    LandingPage landingPage = new LandingPage();

//    @Given("^I am on darksky landing page$")
//    public void launchDarksky() {
//
//        Web.initDriver("https://darksky.net/forecast/27.9352,-82.4957/us12/en");
//    }

    @When("^I enter '(.*)' in search box$")
    public void enterCityName(String cityName) {

        landingPage.enterNameToSearch(cityName);
    }

    @When("^I click on search button$")
    public void clickSearch() {

        landingPage.clickSearchButton();
    }

    @Then("^I verify if it is showing the same as a text behind the scenes$")
    public void verifyTheText() {

        String actualTempText = landingPage.getLiveTemp();
        String expectedTempText = "83˚ Humid and Partly Cloudy.\n";
        Assert.assertEquals(actualTempText, expectedTempText, "It is not the same text");
    }

    @Then("^I verify feelsLike, low and high temp values are displayed$")
    public void verifyFeelsLikeLowHighTemp() {

        landingPage.getFeelsLikeTemp();
        landingPage.getLowTemp();
        landingPage.getHighTemp();
    }
}
