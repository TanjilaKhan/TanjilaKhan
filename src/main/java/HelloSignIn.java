import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelloSignIn {

    @FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
    WebElement HelloSignin;

    boolean HellosignInPage(){
      return HelloSignin.isDisplayed();
    }
}
