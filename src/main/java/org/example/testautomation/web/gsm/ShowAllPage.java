package org.example.testautomation.web.gsm;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.example.testautomation.web.gsm.bases.ShowAllBase;
import org.example.testautomation.web.gsm.bases.SpecsBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = ShowAllBase.class)
public class ShowAllPage extends ShowAllBase {

    @FindBy(xpath = "//*[@id=\"body\"]/div/div[1]/div/div[3]/ul/li[5]/a")
    private ExtendedWebElement specsLink;

    public ShowAllPage(WebDriver driver) {
        super(driver);
    }

    public SpecsBase getSpecs() {
        specsLink.click();
        return initPage(this.driver, SpecsBase.class);
    }
}
