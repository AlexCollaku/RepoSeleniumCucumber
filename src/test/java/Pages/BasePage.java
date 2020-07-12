package Pages;

import Drivers.Web;
import gherkin.deps.com.google.gson.internal.$Gson$Preconditions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class BasePage {

//    // generic method to launch the webpage
//    public static void openWebPage(String url) {
//
//        Web.initDriver(url);
//    }
    // generic method to write on web element
    public void type(By locator, String data) {

        Web.getDriver().findElement(locator).sendKeys(data);
    }
    public void typeJS(By locator, String data) {
        WebElement element = Web.getDriver().findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor)Web.getDriver();
        js.executeScript("arguments[0].values='%s';", element, data);
    }

    // generic method to click on web element
    public void clickThis(By locator) {

        Web.getDriver().findElement(locator).click();
    }
    public void clickThis(WebElement element) {

        element.click();
    }

    public void clickThisJS(By locator) {
        WebElement element = Web.getDriver().findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor)Web.getDriver();
        js.executeScript("arguments[0].click();", element);
    }

    public void clearField(By locator) {

        Web.getDriver().findElement(locator).clear();
    }

    public void clearField(WebElement element) {

        element.clear();
    }

    public String getWebPageTitle() {

        return Web.getDriver().getTitle();
    }

    public String getCurrentWebUrl() {

        return Web.getDriver().getCurrentUrl();
    }

    // generic method to get text from web element
    public String getTextFromElement(By locator) {

        return Web.getDriver().findElement(locator).getText();
    }
    public String getTextFromElement(WebElement element) {

        return element.getText();
    }

    // generic method to get attribute value from web element
    public String getAttributeValueFromElement(By locator, String attributeName) {

       return Web.getDriver().findElement(locator).getAttribute(attributeName);
    }
    public String getAttributeValueFromElement(WebElement element, String attributeName) {

        return element.getAttribute(attributeName);
    }

    // generic method to select any value from dropdown - selectByVisibleText
    public void selectFromDropdownByVisibleText(By locator, String visibleText) {
        WebElement dropdownElement = Web.getDriver().findElement(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(visibleText);
    }

    public void selectFromDropdownByIndex(By locator, int index) {
        WebElement dropdownElement = Web.getDriver().findElement(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByIndex(index);
    }

    // generic method to get if WebElement is enabled
    public boolean isWebElementEnabled(By locator) {

        return Web.getDriver().findElement(locator).isEnabled();
    }

    // generic method to perform mouse hover on any web element
    public void mouseHoverOnElement(WebElement element) {
        Actions act = new Actions(Web.getDriver());
        act.moveToElement(element).build().perform();
    }

    public void mouseHoverOnElement(By locator) {
        WebElement element = Web.getDriver().findElement(locator);
        Actions act = new Actions(Web.getDriver());
        act.moveToElement(element).build().perform();
    }

    public void mouseHoverNoElement() {
        Actions act = new Actions(Web.getDriver());
        act.build().perform();
    }

    public void selectFromAutoSuggestion(By locator, String userSelection) {
        List<WebElement> autoSuggestionElements= Web.getDriver().findElements(locator);
        for (int i=0 ; i < autoSuggestionElements.size() ; i++) {
            if (autoSuggestionElements.get(i).getText().equalsIgnoreCase(userSelection)) {
                clickThis(autoSuggestionElements.get(i));
                break;
            }
        }
    }

    public void scrollByPixel(int y) {
        JavascriptExecutor js = (JavascriptExecutor)Web.getDriver();
        js.executeScript("scrollBy(0," + y + ")"); // scrollBy(0,+y+) -> scrollBy(0,y)
    }

    public void scrollUpToWebElement(By locator) {
        WebElement webElement = Web.getDriver().findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor)Web.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", webElement);
    }

    public void scrllToBottom() {
        JavascriptExecutor js = (JavascriptExecutor)Web.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    public void switchWindow(String windowHandle) {

        Web.getDriver().switchTo().window(windowHandle);
    }

    public String getCurrentWindowHandle() {

        return Web.getDriver().getWindowHandle();
    }

    public Set<String> getAllWindowHandles() {

        return Web.getDriver().getWindowHandles();
    }

}
