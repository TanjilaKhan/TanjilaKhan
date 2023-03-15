import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OneMedicalTest extends Setup {

    OneMedical medical;

    @BeforeMethod
    void setupTest(){
        setupDriver("https://amazon.com");
        medical = PageFactory.initElements(driver,OneMedical.class);
    }
    @AfterMethod
    void close() throws InterruptedException {
        quitBrowser();
    }

    @Test
    void medicalTest(){
        medical.onePage();
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://www.amazon.com/onemedical/b/?ie=UTF8&node=57181331011&ref_=nav_cs_one_medical");
    }
}
