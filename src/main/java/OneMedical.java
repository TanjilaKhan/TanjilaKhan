import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OneMedical {

    @FindBy(xpath = "//a[@data-csa-c-content-id=\"nav_cs_one_medical\"]")
    WebElement one;

    void onePage(){
        one.click();
    }
}
