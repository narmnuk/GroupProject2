package steps;

import impl.TLAImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.WebDriverUtils;

public class TLASteps {

    TLAImpl impl = new TLAImpl();

    String actual;

    @Given("I navigate to TLA")
    public void iNavigateToTLA() {

        impl.navigateToTLA();
    }

    @Then("I input email as {string}")
    public void iInputEmailAs(String eMail) {

        impl.getPage().eMail.sendKeys(eMail);
    }

    @Then("I input password as {string}")
    public void iInputPasswordAs(String password) {

        impl.getPage().password.sendKeys(password);
    }

    @And("I click on {string} button")
    public void iClickOnButton(String button) {

        impl.clickButton(button);
    }

    @Then("Verify title of the page should be {string}")
    public void verifyTitleOfThePageShouldBe(String expectedTitle) {

        Assert.assertEquals(expectedTitle, WebDriverUtils.getDriver().getTitle());
        System.out.println(WebDriverUtils.getDriver().getTitle());
    }
}