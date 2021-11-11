package impl;

import pages.TLAPage;
import utils.ConfigReader;
import utils.WebDriverUtils;

public class TLAImpl {

    private TLAPage tlaPage;

    public TLAPage getPage() {

        if (tlaPage == null)
            tlaPage = new TLAPage();

        return tlaPage;
    }

    public void navigateToTLA() {

        WebDriverUtils.getDriver().get(ConfigReader.readProperty("url"));
    }

    public String getTitle() {

        return WebDriverUtils.getDriver().getTitle();
    }

    public void clickButton(String button) {

        switch (button.toLowerCase()) {
            case "login":
                getPage().loginBtn.click();
                break;
        }
    }
}