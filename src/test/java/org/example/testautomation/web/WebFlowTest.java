package org.example.testautomation.web;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.zebrunner.carina.webdriver.core.capability.impl.desktop.FirefoxCapabilities;
import org.example.testautomation.web.classic.EbayCarsAndTrucks;
import org.example.testautomation.web.classic.bases.ClassicBase;
import org.example.testautomation.web.classic.bases.EraBase;
import org.example.testautomation.web.classic.bases.SelectionBase;
import org.example.testautomation.web.gsm.Gsmarena;
import org.example.testautomation.web.gsm.bases.*;
import org.example.testautomation.web.walmart.HomePage;
import org.example.testautomation.web.walmart.bases.DealsBase;
import org.testng.annotations.Test;

public class WebFlowTest implements IAbstractTest {


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

    @Test
    public void testGsmFlow() {
        getDriver("firefox", new FirefoxCapabilities().getCapability("Firefox Browser"));
        Gsmarena homepage = new Gsmarena(getDriver("firefox"));
        homepage.open();
        BrandsBase brandsPage = homepage.getBrand("samsung");
        // get Galaxy s23
        PhoneTypeBase typePage = brandsPage.getPhoneType(17);
        ReviewBase reviewPage = typePage.getReview();
        ShowAllBase showAllPage = reviewPage.getAllPrices();
        SpecsBase specsPage = showAllPage.getSpecs();
        RumorBase rumorePage = specsPage.getRumorMill();

    }
}
