package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

public class TLAPage {

    public TLAPage() {

        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='email']")
    public WebElement eMail;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;
}