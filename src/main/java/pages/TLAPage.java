package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

public class TLAPage {

    public TLAPage() {

        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }

    @FindBy(css = "input[name='email']")
    public WebElement eMail;

    @FindBy(css = "input[name='password']")
    public WebElement password;

    @FindBy(css = "button[type='submit']")
    public WebElement loginBtn;

    @FindBy(css = "a[href='/homeworks']")
    public WebElement homeworksBtn;

    @FindBy(css = "a[href='/meeting-links']")
    public WebElement meetingLinksBtn;

    @FindBy(css = "a[href='/access-management']")
    public WebElement accessManagementBtn;
}