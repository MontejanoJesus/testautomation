package org.example.testautomation.web.gsm;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.example.testautomation.web.gsm.bases.PhoneTypeBase;
import org.example.testautomation.web.gsm.bases.ReviewBase;
import org.example.testautomation.web.gsm.bases.ShowAllBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = PhoneTypeBase.class)
public class PhoneTypePage extends PhoneTypeBase {

    @FindBy(xpath = "//li[@class='article-info-meta-link article-info-meta-link-review light large help help-review']/a")
    private ExtendedWebElement reviewLink;

    public PhoneTypePage(WebDriver driver) {
        super(driver);
    }

    public ReviewBase getReview() {
        reviewLink.click();
        return initPage(this.driver, ReviewBase.class);
    }

    @Override
    public ShowAllBase getAllPrices() {
        return null;
    }

}
