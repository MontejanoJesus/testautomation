package org.example.testautomation.web.gsm;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.example.testautomation.web.gsm.bases.BrandsBase;
import org.example.testautomation.web.gsm.bases.PhoneTypeBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = BrandsBase.class)
public class BrandsPage extends BrandsBase {

    @FindBy(xpath = "//div[@class='makers']//a")
    private List<ExtendedWebElement> phoneTypesLink;

    public BrandsPage(WebDriver driver) {
        super(driver);
    }

    public PhoneTypeBase getPhoneType(Integer x) {
        this.phoneTypesLink.get(x).click();
        return initPage(this.driver, PhoneTypeBase.class);
    }
}
