package org.example.testautomation.web.gsm;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.example.testautomation.web.gsm.bases.RumorBase;
import org.example.testautomation.web.gsm.bases.SpecsBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = SpecsBase.class)
public class SpecsPage extends SpecsBase {

    @FindBy(xpath = "//a[@class='pad-multiple pad-rumormill']")
    private ExtendedWebElement rumorMillLink;

    public SpecsPage(WebDriver driver) {
        super(driver);
    }

    public RumorBase getRumorMill() {
        this.rumorMillLink.click();
        return initPage(this.driver, RumorBase.class);
    }

    @Override
    public void getPics() {
    }
}
