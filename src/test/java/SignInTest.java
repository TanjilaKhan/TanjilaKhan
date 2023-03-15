import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInTest extends Setup {

    SignInPage signin;

    @BeforeMethod
    void openBrowser(){
        setupDriver("https://amazon.com");
        signin = PageFactory.initElements(driver,SignInPage.class);
    }

    @Test
    void signinTest(){
        signin.signInText();
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://www.amazon.com/ap/signin?openid.pape.max_auth_age");
    }

}
