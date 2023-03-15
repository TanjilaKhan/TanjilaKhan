import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {

    @FindBy(xpath = "//div[@id=\"nav-flyout-ya-signin\"]/a/span")
    WebElement signInButton;

    void signInText() {
        signInButton.click();
    }
}
