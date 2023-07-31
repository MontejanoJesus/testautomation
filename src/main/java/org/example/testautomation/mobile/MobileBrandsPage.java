package org.example.testautomation.mobile;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.example.testautomation.web.gsm.bases.BrandsBase;
import org.example.testautomation.web.gsm.bases.PhoneTypeBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MobileBrandsPage extends BrandsBase {

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ListView")
    private List<ExtendedWebElement> phoneModelsLink;

    public MobileBrandsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public PhoneTypeBase getPhoneType(Integer x) {
        this.phoneModelsLink.get(x).click();
        return initPage(this.driver, PhoneTypeBase.class);
    }
}
