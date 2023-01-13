package TestNg;

import holders.DriverHolder;
import holders.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.All_DigatalContentAndDevicesHelper;
import pageObject.All_DigatalContentAndDevicesObj;

import java.util.concurrent.TimeUnit;

public class AllTabTests extends TestInit {
    All_DigatalContentAndDevicesObj all_digatalContentAndDevicesObj;

    @Test
    public void AmazonMusicUltimatedButtonClickTest(){
        All_DigatalContentAndDevicesHelper all_digatalContentAndDevicesHelper = new All_DigatalContentAndDevicesHelper(driver);
        all_digatalContentAndDevicesHelper.AllButtonClick();
        all_digatalContentAndDevicesHelper.AmazonMusicButtonClick();
        all_digatalContentAndDevicesHelper.AmazonMusicUltimatedButtonClick();
        String expectedResult = "Unlimited access to 100 million songs";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[3]/div/div/div[1]/div/div[2]/h3")).getText();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void FreeStreamingMusicButtonClickTest(){
        All_DigatalContentAndDevicesHelper all_digatalContentAndDevicesHelper = new All_DigatalContentAndDevicesHelper(driver);
        all_digatalContentAndDevicesHelper.AllButtonClick();
        all_digatalContentAndDevicesHelper.AmazonMusicButtonClick();
        all_digatalContentAndDevicesHelper.FreeStreamingMusicButtonClick();
        String expectedResult = "Free streaming music";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[3]/div/div/div[1]/div/div[2]/h3")).getText();
        Assert.assertEquals(actualResult, expectedResult);
    }

}
