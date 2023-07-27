package org.example.testautomation.web.classic;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.example.testautomation.web.classic.bases.ClassicBase;
import org.example.testautomation.web.classic.bases.EraBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = ClassicBase.class)
public class EbayClassicCarPage extends ClassicBase {

    @FindBy(xpath = "//a[@class='b-visualnav__tile b-visualnav__tile__default']")
    private List<ExtendedWebElement> typeOfClassicLinks;

    public EbayClassicCarPage(WebDriver driver) {
        super(driver);
    }

    public EraBase getEra(Integer x) {
        this.typeOfClassicLinks.get(x).click();
        return initPage(this.driver, EraBase.class);
    }
}
