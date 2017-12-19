package Tests;

import PageObject.HomePage;
import PageObject.SetUp;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.close;

public class HomePageTest extends SetUp {

    private HomePage homePage;

    @BeforeClass
    private void setUp() {
        homePage = openHomePage();
    }

    @Test
    private void shouldBeOnHomePage() {
        homePage.isLogoDisplayed();
    }

    @AfterClass
    private void tearDown() {
        close();
    }
}
