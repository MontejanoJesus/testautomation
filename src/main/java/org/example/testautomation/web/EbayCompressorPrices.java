package org.example.testautomation.web;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class EbayCompressorPrices extends AbstractPage {

    @FindBy(xpath = "//span[@class='s-item__price']")
    private List<ExtendedWebElement> prices;

    protected EbayCompressorPrices(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://www.ebay.com/b/BMW-Car-and-Truck-AC-Compressors/33543/bn_580245");
    }

    public List<String> getPrices() {
        List<String> result = new ArrayList<>();
        for(ExtendedWebElement e: prices) {
            result.add(e.getText());
        }
        return result;
    }
}
