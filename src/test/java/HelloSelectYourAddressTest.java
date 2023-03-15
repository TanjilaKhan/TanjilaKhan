import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HelloSelectYourAddressTest extends Setup {

    HelloSelectYourAddress address;

    @BeforeMethod
    void SetupTest(){
        setupDriver("https://amazon.com");
        address = PageFactory.initElements(driver,HelloSelectYourAddress.class);
    }

    @Test
    void TestHelloYourAddress(){
      address.selectaddress();
      String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://www.amazon.com/");
    }
}
