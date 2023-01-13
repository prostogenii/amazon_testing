package TestNg;

import holders.DriverHolder;
import holders.TestInit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.HomePageHelper;
import pageObject.HomePageObj;
import pageObject.RegsrtyPageHelper;

public class RegistryTests extends TestInit {
    RegsrtyPageHelper regsrtyPageHelper;
    HomePageHelper homePageHelper;
    @Test
    public void ImWelcomingABabyTest() {
        regsrtyPageHelper = new RegsrtyPageHelper(driver);
        homePageHelper = new HomePageHelper(driver);
        homePageHelper.DontChangeButtonClick();
        homePageHelper.RegistryButtonClick();
        regsrtyPageHelper.ImWelcomingABabyClick();
        String actualWelcomeToAmazonBabyRegisterString = String.valueOf(regsrtyPageHelper.WelcomeToAmazonBabyRegisterString().getText());
        String expectedWelcomeToAmazonBabyRegisterString = "Welcome to Amazon Baby Registry - your one-stop registry for all your baby and pregnancy needs.";
        Assert.assertEquals(actualWelcomeToAmazonBabyRegisterString, expectedWelcomeToAmazonBabyRegisterString);
    }
}



