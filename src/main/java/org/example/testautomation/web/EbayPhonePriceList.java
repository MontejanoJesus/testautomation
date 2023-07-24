package org.example.testautomation.web;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EbayPhonePriceList extends AbstractPage {

    @FindBy(xpath = "//div[@class='srp-river-results clearfix']//span[@role='heading']")
    private List<ExtendedWebElement> phoneNames;

    @FindBy(xpath = "//div[@class='srp-river-results clearfix']//span[@class='s-item__price']")
    private List<ExtendedWebElement> phonePriceList;

    protected EbayPhonePriceList(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2499334.m570.l1311&_nkw=mobile+phones&_sacat=0");
    }

    public Map<String, String> getPhonePriceList () {
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < phoneNames.size(); i++) {
            if(phonePriceList.get(i).getText().length() <= 7) {
                if (Double.parseDouble(phonePriceList.get(i).getText().replace("$", "")) < 300d) {
                    map.put(phoneNames.get(i).getText(), phonePriceList.get(i).getText());
                }
            }
        }
        return map;
    }
}
