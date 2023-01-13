package pageObject;

import holders.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegstryPageObj extends DriverHolder {
    public RegstryPageObj(WebDriver driver) {super(driver);}

    private String imWelcomingABaby = "//*[@id=\"a-page\"]/div[3]/div/div/div/div[3]/div[4]/div/a[2]/img";

    private String welcomeToAmazonBabyRegisterString = "//*[@id=\"contentGrid_448997\"]/div/div/div/div/div/h1";
    protected  WebElement getWelcomeToAmazonBabyRegisterString(){return getElByXpath(welcomeToAmazonBabyRegisterString);}

    protected  WebElement getImWelcomingABaby(){return getElByXpath(imWelcomingABaby);}
}
