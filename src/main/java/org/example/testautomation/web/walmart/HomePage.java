package org.example.testautomation.web.walmart;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.example.testautomation.web.walmart.bases.DealsBase;
import org.example.testautomation.web.walmart.bases.HomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(xpath = "//a[@href='https://www.walmart.com/shop/deals']")
    private ExtendedWebElement dealsPageLink;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://www.walmart.com/");
    }

    public DealsBase getDealsPage() {
        this.dealsPageLink.click();
        return initPage(this.driver, DealsBase.class);
    }

}
