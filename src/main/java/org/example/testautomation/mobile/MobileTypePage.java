package org.example.testautomation.mobile;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.example.testautomation.web.gsm.bases.PhoneTypeBase;
import org.example.testautomation.web.gsm.bases.ReviewBase;
import org.example.testautomation.web.gsm.bases.ShowAllBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MobileTypePage extends PhoneTypeBase {

    @FindBy(xpath = "//android.view.View[@content-desc=\"ALL PRICES\"]/android.view.View[1]")
    private ExtendedWebElement allPricesLink;

    public MobileTypePage(WebDriver driver) {
        super(driver);
    }

    public ShowAllBase getAllPrices(){
        this.allPricesLink.click();
        return initPage(this.driver, ShowAllBase.class);
    }

    @Override
    public ReviewBase getReview() {
        return null;
    }
}
