package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class All_DigatalContentAndDevicesHelper extends All_DigatalContentAndDevicesObj{

    public All_DigatalContentAndDevicesHelper(WebDriver driver) {super(driver);}

    public void AllButtonClick(){getAllButton().click();}

    public void AmazonMusicButtonClick(){getAmazonMusicButton().click();}

    public void AmazonMusicUltimatedButtonClick(){getAmazonMusicUltimatedButton().click();}

    public void FreeStreamingMusicButtonClick(){getFreeStreamingMusicButton().click();}



}
