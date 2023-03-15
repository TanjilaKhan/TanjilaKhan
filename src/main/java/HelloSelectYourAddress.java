import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelloSelectYourAddress {

    @FindBy(xpath = "//span[@id='glow-ingress-line1']")
    WebElement selectyouraddress;

    void selectaddress(){
        selectyouraddress.click();
    }
}
