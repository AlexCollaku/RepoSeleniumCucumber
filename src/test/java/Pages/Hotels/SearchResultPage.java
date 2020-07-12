package Pages.Hotels;

import Pages.BasePage;
import org.openqa.selenium.By;

public class SearchResultPage extends BasePage {

    By destinationHeaderLocator = By.xpath("//h1[@class='destination-title']");
    By destinationPropertyLandmarkText = By.xpath("//label[text()='Destination, property, or landmark']/following-sibling::input[@id='q-destination']");
    By hotelsPriceLocator = By.xpath("//a[@class='menu-trigger' and contains(text(), 'low to high')]");
    By priceLowToHighLocator = By.xpath("//a[@role='menuitem']/following::div[@class='disclaimer-msg']");
    By priceHotelsLocator = By.xpath("//a[@class='menu-trigger' and text()='Price']");
    By childrenDropdownLocator = By.id("q-room-0-children");
    By childOneLocator = By.id("q-room-0-child-0-age");
    By childTwoLocator = By.id("q-room-0-child-1-age");
    By cheapestHotelLocator = By.xpath("//a[@class='property-name-link' and contains(text(), 'Northway Inn Queensbury - Lake George')]");
    By cheapestHotelPriceLocator = By.xpath("//ins[text()='$79']");



    public String getDestinationHeader() {

        return getTextFromElement(destinationHeaderLocator);
    }

    public String getDestinationPropertyLandmarkText() {
        return getAttributeValueFromElement(destinationPropertyLandmarkText, "value");
    }

    public void moveToHotelsPrice() {

        mouseHoverOnElement(priceHotelsLocator);
    }

    public void clickPriceLowToHigh() {

        clickThis(priceLowToHighLocator);
    }

    public void clickCornerOfWebPage() {

        mouseHoverNoElement();
    }

    public void selectHowManyChildren(String visibleText) {

        selectFromDropdownByVisibleText(childrenDropdownLocator, visibleText);
    }

    public void selectChildOneAge(String visibleText) {

        selectFromDropdownByVisibleText(childOneLocator, visibleText);
    }

    public void selectChildTwoAge(String visibleText) {

        selectFromDropdownByVisibleText(childTwoLocator, visibleText);
    }

    public String getNameOfHotel() {

        return getTextFromElement(cheapestHotelLocator);
    }

    public String getHotelPrice() {

        return getTextFromElement(cheapestHotelPriceLocator);
    }
}
