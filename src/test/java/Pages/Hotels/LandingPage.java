package Pages.Hotels;

import Pages.BasePage;
import org.openqa.selenium.By;

public class LandingPage extends BasePage {

    By searchBoxLocator = By.id("qf-0q-destination");
    By searchButtonLocator = By.xpath("//button[@type='submit']");
    By autoSuggestionsLocator = By.xpath("//div[@class='autosuggest-category-result']");
    By autoSuggestHotelLocator = By.xpath("//tbody[@class='autosuggest-hotel']//div[contains(@class, 'result')]");


    public void enterDestination(String destination) {

        type(searchBoxLocator, destination);
    }

    public void clickSearchButton() {

        clickThis(searchButtonLocator);
    }

    public void selectDestFromAutoSuggestions(String userWantsToSelectThis) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        selectFromAutoSuggestion(autoSuggestionsLocator, userWantsToSelectThis);
    }

    public void selectHotelFromAutoSuggest(String userWantsToSelectThis) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        selectFromAutoSuggestion(autoSuggestHotelLocator, userWantsToSelectThis);
    }

}
