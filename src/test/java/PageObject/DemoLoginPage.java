package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DemoLoginPage {

    private SelenideElement loginButton = $("input[value='Zaloguj się']");

    /**
     * Clicks on Login Button on Demo Login Page
     * @return DemoPage
     */
    public DemoPage logIntoDemoPage() {
        loginButton.shouldBe(visible).click();
        return new DemoPage();
    }
}
