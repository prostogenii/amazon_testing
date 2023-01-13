package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageHelper extends HomePageObj{
    public HomePageHelper(WebDriver driver) {super(driver);}

    public void AllButtonClick(){getAllButton().click();}

    public void RegistryButtonClick(){getRegistryButton().click();}

    public void DontChangeButtonClick(){getDontChangeButton().click();}

    public void AccountAndListButtonClick(){getAccountAndListButton().click();}
}