package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage extends SetUp {

    private SelenideElement loginButton = $x("//*[@id='log-in']/a[1]");
    private SelenideElement logo = $("img[alt='mBank']");

    public LoginPage clickOnLoginButton() {
        loginButton.click();
        return new LoginPage();
    }

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }
}
