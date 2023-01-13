package pageObject;

import holders.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class All_DigatalContentAndDevicesObj extends DriverHolder {

    public All_DigatalContentAndDevicesObj(WebDriver driver) {super(driver);}

    private String allButton = "//*[@id=\"nav-hamburger-menu\"]/span";
    protected  WebElement getAllButton(){ return getElByXpath(allButton);}

    private String amazonMusicButton = "//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a";

    protected  WebElement getAmazonMusicButton(){return getElByXpath(amazonMusicButton);}

    private String amazonMusicUltimatedButton = "//*[@id=\"hmenu-content\"]/ul[2]/li[3]/a";

    protected  WebElement getAmazonMusicUltimatedButton(){return getElByXpath(amazonMusicUltimatedButton);}

    private String freeStreamingMusicButton = "//*[@id=\"hmenu-content\"]/ul[2]/li[4]/a";

    protected  WebElement getFreeStreamingMusicButton(){return getElByXpath(freeStreamingMusicButton);}

    private String podCastsButton = "//*[@id=\"hmenu-content\"]/ul[2]/li[5]/a";

    protected  WebElement getPodCastsButton(){return getElByXpath(podCastsButton);}

    private String playMusicButton = "//*[@id=\"hmenu-content\"]/ul[2]/li[6]/a";

    protected  WebElement getPlayMusicButton(){return getElByXpath(playMusicButton);};

    private String openWebPlayerButton = "//*[@id=\"hmenu-content\"]/ul[2]/li[7]/a";

    protected  WebElement getOpenWebPlayerButton(){return getElByXpath(openWebPlayerButton);}

    private String downloadTheAppButton = "//*[@id=\"hmenu-content\"]/ul[2]/li[8]/a";

    protected  WebElement getDownloadTheAppButton(){return getElByXpath(downloadTheAppButton);}






    private String KindleEReadersAndBooks = "//a[@data-menu-id='3']";

    private String amazonAppstoreButton = "//a[@data-menu-id='4']";
}
