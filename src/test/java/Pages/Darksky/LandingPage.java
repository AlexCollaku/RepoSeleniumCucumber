package Pages.Darksky;

import Pages.BasePage;
import org.openqa.selenium.By;

public class LandingPage extends BasePage {

    By highTempLocator = By.className("high-temp-text");
    By lowTempLocator = By.className("low-temp-text");
    By feelsLikeTempLocator = By.className("feels-like-text");
    By tempUnitLocator = By.xpath("//div[@class='selectric']");
    By searchBoxLocator = By.xpath("//input[@type='text']");
    By liveTempLocator = By.className("summary swap");
    By searchButtonLocator = By.className("searchButton");
    By tempButtonSelection = By.xpath("(//select[@class='units'])[1]");
    By todayTimelineLocator = By.xpath("//span[contains(text(), 'Today')]");
    By todayMinTempLocator = By.xpath("//a[@class='day revealed']//span[@class='minTemp']");
    By clickFirstPlusButtonLocator = By.xpath("//a[@data-day='0']//span[@class='toggle']");
    By todayMinTempInsideTimelineLocator = By.xpath("(//span[@class='temp'])[1]");


    public void enterNameToSearch(String cityToSearch) {

        type(searchBoxLocator, cityToSearch);
    }

    public void clickSearchButton() {

        clickThis(searchButtonLocator);
    }

    public String getLiveTemp() {

        return getTextFromElement(liveTempLocator);
    }

    public String getHighTemp() {

        return getTextFromElement(highTempLocator);
    }

    public String getLowTemp() {

        return getTextFromElement(lowTempLocator);
    }

    public String getFeelsLikeTemp() {

        return getTextFromElement(feelsLikeTempLocator);
    }

    public void clickTempUnit() {

        clickThis(tempUnitLocator);
    }

    public String getTextFromTempUnit() {

       return getTextFromElement(tempUnitLocator);
    }

    public void scrollToTodayTimeline() {

        scrollUpToWebElement(todayTimelineLocator);
    }

    public String getTodayMinTemp() {

        return getTextFromElement(todayMinTempLocator);
   }

   public void clickFirstPlusButton() {

        clickThis(clickFirstPlusButtonLocator);
   }

   public String getTodayMinTempInsideTimeline() {

        return getTextFromElement(todayMinTempInsideTimelineLocator);


   }
}