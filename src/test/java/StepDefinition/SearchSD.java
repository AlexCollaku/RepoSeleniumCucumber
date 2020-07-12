package StepDefinition;

import Drivers.Web;
import Pages.Hotels.LandingPage;
import Pages.Hotels.SearchResultPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class SearchSD {

    LandingPage landingPage = new LandingPage();
    SearchResultPage searchResultPage = new SearchResultPage();
    String userChoice;

    @Given("^I am on hotels landing page$")
    public void launchHotels() {

        Web.initDriver("https://www.hotels.com/");
    }

    @When("^I enter '(.*)' in search$")
    public void enterUserDestination(String destination) {

        landingPage.enterDestination(destination);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("^I select '(.*)' from autosuggestions$")
    public void selectFromLandingAutoSuggestions(String userPreference) {
        userChoice = userPreference;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        landingPage.selectDestFromAutoSuggestions(userPreference);
    }

    @When("^I click on Search button$")
    public void clickSearch() {
        landingPage.clickSearchButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("^I verify search result header is same as text selected from auto suggestion$")
    public void verifySearchHeader() {
        Assert.assertEquals(userChoice, searchResultPage.getDestinationHeader(), "Search Result header didn't match");
    }

    @Then("^I verify text under 'Destination, property, or landmark' is same as text selected from auto suggestion$")
    public void verifyDestinationPropertyLandmarkText() {
        Assert.assertEquals(userChoice, searchResultPage.getDestinationPropertyLandmarkText(), "Text under Destination, Property and Landmark didn't match   ");
    }

    @When("^I hold the mouse to the price button$")
    public void holdTheMouse() {

        searchResultPage.moveToHotelsPrice();
    }

    @When("^I sort the result 'Price low to high'$")
    public void lowToHighPrice() {

        searchResultPage.clickPriceLowToHigh();
    }

    @When("^I select '(.*)' from hotels autosuggestions$")
    public void selectFromHotelAutosuggestion(String userPreference) {

        landingPage.selectHotelFromAutoSuggest(userPreference);
    }

    @When("^I select (.*) in children dropdown$")
    public void selectNumOfChildren(String visibleText) {

        searchResultPage.selectHowManyChildren(visibleText);
    }

    @When("^I enter Child 1 age as (.*)$")
    public void enterChildOneAge(String visibleText) {

        searchResultPage.selectChildOneAge(visibleText);
    }

    @When("^I enter Child 2 age as (.*)$")
    public void enterChildTwoAge(String visibleText) {

        searchResultPage.selectChildTwoAge(visibleText);
    }

    @Then("^I print the lowest hotel price and hotel name in console$")
    public void hotelNameAndHotelPrice() {

        searchResultPage.getNameOfHotel();
        searchResultPage.getHotelPrice();
    }

    @Then("^I verify the lowest price is less than 100 dollars$")
    public void verifyPriceLessThan100() {

        String hotelPrice = searchResultPage.getHotelPrice().substring(0, 2);
        int hotelP = Integer.valueOf(hotelPrice);
        if(hotelP < 100) {
            searchResultPage.getHotelPrice();
        }
    }


}
