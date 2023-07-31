package org.example.testautomation.mobile;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.example.testautomation.web.gsm.bases.BrandsBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePage.class)
public class HomePage extends AbstractPage {

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.ListView")
    private List<ExtendedWebElement> brandList;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public BrandsBase getBrand(String brand) {
        for(ExtendedWebElement e : brandList) {
            String curBrand = e.getText();
            if(curBrand.equalsIgnoreCase(brand)) {
                e.click();
                return initPage(this.driver, BrandsBase.class);
            }
        }
        return null;
    }

}
