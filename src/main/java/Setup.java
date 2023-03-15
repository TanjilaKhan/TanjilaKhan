import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {

    //int a=10;
    //int a
    //a=10;

    WebDriver driver;
    void setupDriver(String url){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
    }

    void quitBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
