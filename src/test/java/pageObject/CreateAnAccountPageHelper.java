package pageObject;

import org.openqa.selenium.WebDriver;

public class CreateAnAccountPageHelper extends CreateAnAccountPageObj{
    public CreateAnAccountPageHelper(WebDriver driver) {super(driver);}

    public void CreateYourAmazonAccountHereButtonClick(){getCreateYourAmazonAccountHereButton().click();}

    public void YourAmazonAccountRegisterSession(String name, String email, String password){
        getYourNameField().sendKeys(name);
        getYourTelNumberField().sendKeys(email);
        getYourPasswordField().sendKeys(password);
        getReenterYourPasswordField().sendKeys(password);
        getContinueButton().click();
    }

    public void ContinueButtonClick(){getContinueButton().click();}

    public void enteringOptPlaceOperation(String opt){
        getEnterOtpPlace().sendKeys(opt);
    }

    public void createYourAmazonAccountButtonClick(){getCreateYourAmazonAccountHereButton().click();}
}
