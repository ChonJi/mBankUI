package PageObject;

import static TemporaryDataProvider.TemporaryDataProvider.expectedUrl;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by cm on 2017-12-11.
 */
public class SetUp {

    public HomePage openHomePage() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        baseUrl = "http://www.mbank.pl";
        open(baseUrl);
        assertEquals(url(), expectedUrl);
        return new HomePage();
    }
}
