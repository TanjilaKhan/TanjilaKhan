import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTest extends Setup{

    CartPage cart;

    @BeforeMethod
    void openBrowser(){
        setupDriver("https://www.amazon.com/gp/cart/view.html");
        cart = PageFactory.initElements(driver,CartPage.class);
    }

    @AfterMethod
    void close() throws InterruptedException {
        quitBrowser();
    }

    @Test
    void CartSignInTest(){
       // cart.cartText();
        Assert.assertEquals(cart.cartText(),"Sign in to your account");

    }

}
