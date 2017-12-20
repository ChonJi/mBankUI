package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static TemporaryDataProvider.TemporaryDataProvider.baseUrl;
import static TemporaryDataProvider.TemporaryDataProvider.expectedUrlFromFirstMenu;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.testng.AssertJUnit.assertEquals;

public class HomePage {

    private SelenideElement loginButton = $x("//*[@id='log-in']/a[1]");

    private SelenideElement logo = $("img[alt='mBank']");

    private ElementsCollection firstMenuElements = $$("a[class='menu-item-href']");

    /**
     * Clicks on Login Button
     * @return Login Page
     */
    public LoginPage clickOnLoginButton() {
        loginButton.click();
        return new LoginPage();
    }

    /**
     * Checks if Logo Element is displayed
     * @return true if displayed
     */
    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }

    /**
     * Checks proper size of first line menu elements
     */
    public void firstLineMenuSizeCheck() {
        firstMenuElements.shouldHaveSize(4);
    }

    /**
     * @return First menu elements descriptions List<String>
     */
    public List<String> collectFirstMenuElementsDescriptions() {
        return firstMenuElements.texts();
    }

    /**
     * Checks are all first line menu elements clickable
     */
    public void areFirstMenuElementsClickable() {
        for (int i = 0; i < firstMenuElements.size(); i++ ) {
            elementToBeClickable(firstMenuElements.get(i));
        }
    }

    /**
     * Checks if page reacts on clicking on menu elements and redirects to correct url's
     */
    public void checkIfPageChangesByClickingOnFirstMenuElements() {
        for (int i = 3; i >= 0; i-- ) {
            firstMenuElements.get(i).click();
            assertEquals(url(), baseUrl + expectedUrlFromFirstMenu.get(i));
        }
    }
}
