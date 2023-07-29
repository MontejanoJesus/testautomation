package org.example.testautomation.web;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.zebrunner.carina.webdriver.core.capability.impl.desktop.FirefoxCapabilities;
import org.example.testautomation.web.gsm.Gsmarena;
import org.example.testautomation.web.gsm.bases.*;

public interface IChoose extends IAbstractTest {

    default BrandsBase chooseBrand(String brand) {
        getDriver("firefox", new FirefoxCapabilities().getCapability("Firefox Browser"));
        Gsmarena homepage = new Gsmarena(getDriver("firefox"));
        homepage.open();
        return homepage.getBrand(brand);
    }

    default PhoneTypeBase choosePhone(BrandsBase brandsBase, Integer x) {
        return brandsBase.getPhoneType(x);
    }

    default void chooseRestOfFlow(PhoneTypeBase phoneTypeBase) {
        ReviewBase reviewPage = phoneTypeBase.getReview();
        ShowAllBase showAllPage = reviewPage.getAllPrices();
        SpecsBase specsPage = showAllPage.getSpecs();
        RumorBase rumorePage = specsPage.getRumorMill();
    }
}
