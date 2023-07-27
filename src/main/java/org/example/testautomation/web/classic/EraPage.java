package org.example.testautomation.web.classic;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.example.testautomation.web.classic.bases.EraBase;
import org.example.testautomation.web.classic.bases.SelectionBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = EraBase.class)
public class EraPage extends EraBase {

    @FindBy(xpath = "//a[@class='s-item__link']")
    private List<ExtendedWebElement> carLinks;

    public EraPage(WebDriver driver) {
        super(driver);

    }

    public SelectionBase getCarLinks(Integer x) {
        this.carLinks.get(1).click();
        return initPage(this.driver, SelectionBase.class);
    }


}
