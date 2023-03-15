import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HelloSignInTest extends Setup {

    HelloSignIn Hello;

    @BeforeMethod
    void SetupTest(){
        setupDriver("https://amazon.com");
        Hello = PageFactory.initElements(driver,HelloSignIn.class);
    }

    @Test
    void HelloSigninTest(){
        Hello.HellosignInPage();

        Assert.assertTrue(Hello.HellosignInPage());
    }
}
