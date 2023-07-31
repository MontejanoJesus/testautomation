package org.example.testautomation.mobile;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.example.testautomation.web.gsm.bases.RumorBase;
import org.example.testautomation.web.gsm.bases.SpecsBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MobileSpecsPage extends SpecsBase {

    @FindBy(id = "specs-cp-pics")
    private ExtendedWebElement picsLink;

    public MobileSpecsPage(WebDriver driver) {
        super(driver);
    }

    public void getPics() {
        picsLink.click();
    }

    @Override
    public RumorBase getRumorMill() {
        return null;
    }
}
