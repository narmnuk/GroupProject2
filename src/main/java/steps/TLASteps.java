package steps;

import impl.TLAImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.WebDriverUtils;

public class TLASteps {

    TLAImpl impl = new TLAImpl();

    @Given("I navigate to TLA")
    public void iNavigateToTLA() {

        impl.navigateToTLA();
    }

    @When("I input email as {string}")
    public void iInputEmailAs(String eMail) {

        impl.getPage().eMail.sendKeys(eMail);
    }

    @When("I input password as {string}")
    public void iInputPasswordAs(String password) {

        impl.getPage().password.sendKeys(password);
    }

    @Then("I click on {string} button")
    public void iClickOnButton(String button) {

        impl.clickButton(button);
    }

    @Then("I should be able to see Homeworks button is displayed")
    public void iShouldBeAbleToSeeHomeworksButtonIsDisplayed() {

        Assert.assertTrue(impl.getPage().homeworksBtn.isDisplayed());
    }

    @Then("I should be able to see Meeting Links button is displayed")
    public void iShouldBeAbleToSeeMeetingLinksButtonIsDisplayed() {

        Assert.assertTrue(impl.getPage().meetingLinksBtn.isDisplayed());
    }

    @Then("I should be able to see Manage Access button is displayed")
    public void iShouldBeAbleToSeeManageAccessButtonIsDisplayed() {

        Assert.assertTrue(impl.getPage().accessManagementBtn.isDisplayed());
    }

    @Then("Title of the page should be {string}")
    public void titleOfThePageShouldBe(String expectedTitle) {

        Assert.assertEquals(expectedTitle, impl.getTitle());
        System.out.println(impl.getTitle());

        WebDriverUtils.closeDriver();
    }
}