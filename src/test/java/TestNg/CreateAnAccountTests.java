package TestNg;

import holders.TestInit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.CreateAnAccountPageHelper;
import pageObject.HomePageHelper;

public class CreateAnAccountTests extends TestInit {

    @Test
    public void CreateAnAccountTest(){
        HomePageHelper homePageHelper = new HomePageHelper(driver);
        homePageHelper.AccountAndListButtonClick();
        CreateAnAccountPageHelper createAnAccountPageHelper = new CreateAnAccountPageHelper(driver);
        createAnAccountPageHelper.CreateYourAmazonAccountHereButtonClick();
        createAnAccountPageHelper.YourAmazonAccountRegisterSession("Andrey","andreyzhuravel2004@gmail.com", "852456");
        createAnAccountPageHelper.ContinueButtonClick();
        createAnAccountPageHelper.enteringOptPlaceOperation("123");
        createAnAccountPageHelper.createYourAmazonAccountButtonClick();
        String expectedResult = "//*[@id=\"verification-code-form\"]/div[6]/div[2]/div/div/div";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"verification-code-form\"]/div[6]/div[2]/div/div/div")).getText();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
