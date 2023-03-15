import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends Setup {
    //go to amazon.com
    //check 'Top Deal' box at the middle of the page or scroll down till its visible.

    //Expected Result : title text will exactly match 'top Deal'

    //checking /validating the expected result
    //comparing actual and expected result

    Homepage home;

    @BeforeMethod
    void setupTest() {
        setupDriver("https://amazon.com");
        home = PageFactory.initElements(driver, Homepage.class);
    }



    @Test
    void testDeals() {
        String actualText = home.topDealtext();
        //System.out.println(actualText);
        Assert.assertEquals(actualText, "Top Deal");
    }

        @Test
        void testbasics(){
        home.clickamazonBasics();
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://www.amazon.com/stores/node/20648519011?channel=discovbar?field-lbr_brands_browse-bin=AmazonBasics&ref_=nav_cs_amazonbasics");
       }

       @Test
    void springfashions(){

        String actualText= home.springfashionsfinds();
        Assert.assertEquals(actualText,"Spring fashion deal");
       }

       @Test
       void shopboptest(){
        String actualText = home.shopbopText();
        Assert.assertEquals(actualText,"The preloved eid at shopbop");
       }

       @Test
    void healthcareTest(){
        String actualText = home.healthcareText();
        Assert.assertEquals(actualText,"Get 24/7 healthcare");
       }



}
