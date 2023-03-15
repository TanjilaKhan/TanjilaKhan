import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {

    @FindBy(xpath = "//span[@class='a-button a-button-primary']/span/a")
    WebElement cartpage;

    String cartText(){
        String text = cartpage.getText();
        return text;
    }
}
