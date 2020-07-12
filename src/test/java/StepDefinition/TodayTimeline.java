package StepDefinition;

import Drivers.Web;
import Pages.Darksky.LandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TodayTimeline {

    LandingPage landingPage = new LandingPage();

    @Given("^I am on darksky landing page$")
    public void launchDarksky() {

        Web.initDriver("https://darksky.net/");
    }

    @When("^I scroll to Today timeline$")
    public void scrollTodayTimeline() {

        landingPage.scrollToTodayTimeline();
    }
    @Then("^I verify the temp values on timeline is same as detail section$")
    public void verifyTempValueInTimeline () {

        String todayMinTemp = landingPage.getTodayMinTemp();
        landingPage.clickFirstPlusButton();
        String todayMinTempInsideTimeline = landingPage.getTodayMinTempInsideTimeline();

        Assert.assertEquals(todayMinTemp, todayMinTempInsideTimeline, "The temp value is not the same");

    }
}
