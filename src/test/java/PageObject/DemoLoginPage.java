package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DemoLoginPage {

    SelenideElement loginButton = $("input[value='Zaloguj się']");

    public DemoPage logIntoDemoPage() {
        loginButton.shouldBe(visible).click();
        return new DemoPage();
    }
}
