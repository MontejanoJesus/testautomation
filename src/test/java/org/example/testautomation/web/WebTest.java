package org.example.testautomation.web;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.zebrunner.carina.webdriver.core.capability.impl.desktop.FirefoxCapabilities;
import org.example.testautomation.web.classic.EbayCarsAndTrucks;
import org.example.testautomation.web.gsm.Gsmarena;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Map;

public class WebTest implements IAbstractTest {
    Logger LOGGER = LoggerFactory.getLogger(WebTest.class);

    @Test
    public void testCarsAndTrucks() {
        getDriver("firefox", new FirefoxCapabilities().getCapability("Firefox Browser"));
        EbayCarsAndTrucks page = new EbayCarsAndTrucks(getDriver("firefox"));
        page.open();
        Assert.assertTrue(page.isPageOpened(), "Page is not open.");
        List<String> categories = page.getCategories();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(categories.get(0), "Classics");

        for(String s: categories) {
            LOGGER.info(s);
        }


    }
    @Test
    public void testCompressorPrices() {
        getDriver("firefox", new FirefoxCapabilities().getCapability("Firefox Browser"));
        EbayCompressorPrices page = new EbayCompressorPrices(getDriver("firefox"));
        page.open();
        Assert.assertTrue(page.isPageOpened(), "Page is not open");
        List<String> prices = page.getPrices();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(prices.get(1), "$113.04");

        for(String s: prices) {
            LOGGER.info(s);
        }

    }

    @Test
    public void testPhonePricing() {
        getDriver("firefox", new FirefoxCapabilities().getCapability("Firefox Browser"));
        EbayPhonePriceList page = new EbayPhonePriceList(getDriver("firefox"));
        page.open();
        Assert.assertTrue(page.isPageOpened(), "Page is not open");

        Map<String, String> lessThan300 = page.getPhonePriceList();
        for(Map.Entry<String, String> entry: lessThan300.entrySet()) {
            LOGGER.info("Key = " + entry.getKey() + ", value = " + entry.getValue());
        }
    }

    @Test
    public void testGsmarena() {
        getDriver("firefox", new FirefoxCapabilities().getCapability("Firefox Browser"));
        Gsmarena page = new Gsmarena(getDriver("firefox"));
        page.open();
        Assert.assertTrue(page.isPageOpened(), "Page is not open");

        Map<String, String> hitMap = page.getTopSamsung();

        for(Map.Entry<String, String> entry: hitMap.entrySet()) {
            LOGGER.info("Key = " + entry.getKey() + ", value = " + entry.getValue());
        }

    }

}
