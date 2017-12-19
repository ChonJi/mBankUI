package PageObject;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DemoPage {

    private SelenideElement header = $("h1");
    private ElementsCollection helpProposalHeaders = $$("article[ng-hide='intro']>ul h3");

    /**
     * @return DemoPage header text.
     */
    public String getHeader() {
        return header.getText();
    }

    /**
     * @return Help proposal headers as List<String>
     */
    public List<String> collectHelpProposalHeaders() {
        return helpProposalHeaders.texts();
    }

}
