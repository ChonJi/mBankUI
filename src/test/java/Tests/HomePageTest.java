package Tests;

import PageObject.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static TemporaryDataProvider.TemporaryDataProvider.demoPageHeaderText;
import static TemporaryDataProvider.TemporaryDataProvider.expectedHelpProposalsHeaders;
import static Tools.AlphabeticalStringListComparator.compareTwoStringLists;
import static com.codeborne.selenide.Selenide.close;
import static org.testng.AssertJUnit.assertEquals;


public class HomePageTest extends SetUp {

    private HomePage homePage;
    private LoginPage loginPage;
    private DemoLoginPage demoLoginPage;
    private DemoPage demoPage;

    @BeforeClass
    private void setUp() {
        homePage = openHomePage();
    }

    @Test
    private void shouldLoginToDemoVersion() {
        loginPage = homePage.clickOnLoginButton();
        demoLoginPage = loginPage.shouldClickOnDemoLink();
        demoPage = demoLoginPage.logIntoDemoPage();
        assertEquals(demoPage.getHeader(), demoPageHeaderText);
        compareTwoStringLists(demoPage.collectHelpProposalHeaders(), expectedHelpProposalsHeaders);
    }

    @AfterClass
    private void tearDown() {
        close();
    }
}

