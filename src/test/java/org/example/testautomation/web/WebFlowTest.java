package org.example.testautomation.web;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.zebrunner.carina.webdriver.core.capability.impl.desktop.FirefoxCapabilities;
import org.example.testautomation.web.classic.EbayCarsAndTrucks;
import org.example.testautomation.web.classic.bases.ClassicBase;
import org.example.testautomation.web.classic.bases.EraBase;
import org.example.testautomation.web.classic.bases.SelectionBase;
import org.example.testautomation.web.gsm.bases.*;
import org.example.testautomation.web.walmart.HomePage;
import org.example.testautomation.web.walmart.bases.DealsBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WebFlowTest implements IAbstractTest, IChoose {


    @Test
    public void testEbayPurchaseClassicItem() throws InterruptedException {
        getDriver("firefox", new FirefoxCapabilities().getCapability("Firefox Browser"));
        EbayCarsAndTrucks page = new EbayCarsAndTrucks(getDriver("firefox"));

        page.open();
        ClassicBase classicPage = page.getCategory(0);
        EraBase eraPage = classicPage.getEra(1);
        SelectionBase selectionPage = eraPage.getCarLinks(2);
        selectionPage.openStore();


    }

    @Test
    public void testWalmartFlow() {
        // Walmart gives an are you a robot prompt therefore can't test
        getDriver("firefox", new FirefoxCapabilities().getCapability("Firefox Browser"));
        HomePage homePage = new HomePage(getDriver("firefox"));
        homePage.open();
        DealsBase dealsPage = homePage.getDealsPage();
    }

    @Test(dataProvider = "Provider")
    public void testGsmSamsungFlow(String phone, Integer type) {
        // get Galaxy s23
        BrandsBase brandsPage = chooseBrand(phone);
        PhoneTypeBase typePage = choosePhone(brandsPage, type);
        chooseRestOfFlow(typePage);

    }

    @Test(dataProvider = "Provider")
    public void testGsmAppleFlow(String phone, Integer type) {
        // get Iphone 14 Pro Max
        BrandsBase brandsPage = chooseBrand(phone);
        PhoneTypeBase typePage = choosePhone(brandsPage, type);
        chooseRestOfFlow(typePage);
    }

    @DataProvider(name = "Provider")
    public Object[][]dataProviderGsm() {
        return new Object[][] {
                {"samsung", 17},
                {"apple", 3},
                {"google", 0},
               {"sony", 7}
        };
    }


}
