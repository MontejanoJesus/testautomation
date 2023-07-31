package org.example.testautomation.mobile;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.example.testautomation.web.gsm.bases.ShowAllBase;
import org.example.testautomation.web.gsm.bases.SpecsBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MobileShowAllPage extends ShowAllBase {

    @FindBy(id = "specs-cp-specs")
    private ExtendedWebElement specsLink;

    public MobileShowAllPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public SpecsBase getSpecs() {
        this.specsLink.click();
        return initPage(this.driver, SpecsBase.class);
    }
}
