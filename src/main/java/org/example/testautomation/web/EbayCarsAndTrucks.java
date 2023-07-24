package org.example.testautomation.web;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class EbayCarsAndTrucks extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(xpath = "//div[@class='b-visualnav__title']")
    private List<ExtendedWebElement> categories;

    protected EbayCarsAndTrucks(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://www.ebay.com/b/Cars-Trucks/6001/bn_1865117");
    }

    public List<String> getCategories() {
        List<String> result = new ArrayList<>();
        for(ExtendedWebElement e: categories) {
            result.add(e.getText());
        }
        return result;
    }
}
