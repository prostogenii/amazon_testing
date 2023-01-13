package pageObject;

import holders.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObj extends DriverHolder {
    public HomePageObj(WebDriver driver) {super(driver);}

    private String allButton = "//*[@id=\"nav-hamburger-menu\"]/span";

    private String todaysDealsButton = "//*[@id=\"nav-xshop\"]/a[1]";

    private String customerServiceButton = "//*[@id=\"nav-xshop\"]/a[2]";

    private String giftCardsButton = "//*[@id=\"nav-xshop\"]/a[3]";

    private  String registryButton = "//*[@id=\"nav-xshop\"]/a[4]";

    private  String sellButton = "//*[@id=\"nav-xshop\"]/a[5]";

    private  String shopGreatDealsNow = "//*[@id=\"swm-link\"]";

    private String dontChangeButton = "//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/input";

    private String accountAndListButton= "//*[@id=\"nav-link-accountList\"]";

    protected WebElement getAccountAndListButton(){return getElByXpath(accountAndListButton);}

    protected WebElement getDontChangeButton(){return getElByXpath(dontChangeButton);}

    protected WebElement getAllButton(){
        return getElByXpath(allButton);
    }
    protected WebElement getTodaysDealsButton(){return getElByXpath(todaysDealsButton);}
    protected WebElement getCustomerServiceButton(){return getElByXpath(customerServiceButton);}
    protected WebElement getGiftCardsButton(){
        return getElByXpath(giftCardsButton);
    }
    protected WebElement getRegistryButton(){
        return getElByXpath(registryButton);
    }
    protected  WebElement getSellButton(){
        return getElByXpath(sellButton);
    }
    protected WebElement getShopGreatDeals(){ return getElByXpath(shopGreatDealsNow);}


}
