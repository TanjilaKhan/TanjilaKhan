import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WarmWeatherTest extends Setup {

    WarmWeatherPage warm;

    @BeforeMethod
    void SetupTest(){
        setupDriver("https://amazon.com");
        warm = PageFactory.initElements(driver,WarmWeatherPage.class);
    }


    @Test
    void Testwarm(){

        Assert.assertEquals(warm.warmText(),"The warm-weather edit");
    }

}
