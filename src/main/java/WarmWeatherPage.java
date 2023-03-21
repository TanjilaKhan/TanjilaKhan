import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WarmWeatherPage {

    @FindBy(xpath = "//*[@id=\"rqpFadPQHOmozgxU5Uesww\"]/div[1]/h2")
    WebElement weather;

    String warmText(){
        return weather.getText();

    }

}
