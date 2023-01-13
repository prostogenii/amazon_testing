package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegsrtyPageHelper extends RegstryPageObj{
    public RegsrtyPageHelper(WebDriver driver) {super(driver);}

    public void ImWelcomingABabyClick(){getImWelcomingABaby().click();}

    public WebElement WelcomeToAmazonBabyRegisterString(){return getWelcomeToAmazonBabyRegisterString();}

}
