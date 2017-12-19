package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class LoginPage {

    SelenideElement demoButton = $("a[href='http://www.nowedemo.mbank.pl/login.html']");

    /**
     * Clicks on Demo Page Link
     * @return DemoLoginPage
     */
    public DemoLoginPage shouldClickOnDemoLink() {
        demoButton.shouldBe(visible).click();
        switchTo().window(1);
        return new DemoLoginPage();
    }
}
