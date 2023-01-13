package pageObject;

import holders.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAnAccountPageObj extends DriverHolder {

    public CreateAnAccountPageObj(WebDriver driver) {super(driver);}

    private String createYourAmazonAccountHereButton= "//*[@id=\"createAccountSubmit\"]";

    protected WebElement getCreateYourAmazonAccountHereButton(){return  getElByXpath(createYourAmazonAccountHereButton);}

    private String yourNameField = "//*[@id=\"ap_customer_name\"]";

    protected WebElement getYourNameField(){return getElByXpath(yourNameField);}

    private String yourTelNumberField = "//*[@id=\"ap_email\"]";

    protected WebElement getYourTelNumberField(){return getElByXpath(yourTelNumberField);}

    private String yourPasswordField = "//*[@id=\"ap_password\"]";

    protected  WebElement getYourPasswordField(){return getElByXpath(yourPasswordField);}

    protected  String reenterYourPasswordField = "//*[@id=\"ap_password_check\"]";

    protected WebElement getReenterYourPasswordField(){return getElByXpath(reenterYourPasswordField);}

    protected String continueButton = "//*[@id=\"continue\"]";

    protected WebElement getContinueButton(){return getElByXpath(continueButton);}

    protected String enterOptPlace = "//*[@id=\"cvf-input-code\"]";

    protected WebElement getEnterOtpPlace(){return getElByXpath(enterOptPlace);}

    protected String createYourAmazonAccountButton = "//*[@id=\"cvf-submit-otp-button\"]/span/input";

    protected  WebElement getButton(){return getElByXpath(createYourAmazonAccountButton);}


}
