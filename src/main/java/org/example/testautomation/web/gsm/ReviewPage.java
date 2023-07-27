package org.example.testautomation.web.gsm;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.example.testautomation.web.gsm.bases.ReviewBase;
import org.example.testautomation.web.gsm.bases.ShowAllBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = ReviewBase.class)
public class ReviewPage extends ReviewBase {

    @FindBy(xpath = "//a[@class='show-more']")
    private ExtendedWebElement showAllPrices;

    public ReviewPage(WebDriver driver) {
        super(driver);
    }

    public ShowAllBase getAllPrices() {
        this.showAllPrices.click();
        return initPage(this.driver, ShowAllBase.class);
    }
}
