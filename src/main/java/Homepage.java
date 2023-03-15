import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {

    //WebElement element =driver.findElement(By.xpath(""));

    @FindBy(xpath = "//*[@id=\"60sjFfGKM8duPrAkLmicVA\"]/div[1]/h2")
    WebElement topDeal;

    @FindBy(xpath ="//a[@data-csa-c-content-id='nav_cs_amazonbasics']")
    WebElement amazonBasics;

    @FindBy(xpath = "//div[@id='Q6uffuHHNkcfvH-MEOV9Qg']/div[1]/h2")
    WebElement spring;

    @FindBy(xpath = "//*[@id=\"iR_g-C-LiKlIavH29cWC6Q\"]/div[1]/h2")
    WebElement shopbop;

    @FindBy(xpath = "//*[@id=\"DIS-3jnMATyE_PHcOJsW-A\"]/div[1]/h2")
    WebElement healthcare;


    String topDealtext(){
       return topDeal.getText();
    }

    void clickamazonBasics(){
        amazonBasics.click();
    }
    String springfashionsfinds(){
        return spring.getText();
    }

    String shopbopText(){
        return shopbop.getText();
    }

    String healthcareText(){
      return healthcare.getText();
    }

}
