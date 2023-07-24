package org.example.testautomation.web;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gsmarena extends AbstractPage {

    @FindBy(xpath = "//tbody//tr//nobr")
    private List<ExtendedWebElement> phoneNames;

    @FindBy(xpath = "//tbody//tr//td[@headers='th3c']")
    private List<ExtendedWebElement> hits;

    protected Gsmarena(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://www.gsmarena.com/");
    }

    public Map<String, String> getTopSamsung() {
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < 10; i++) {
            if(phoneNames.get(i).getText().toLowerCase().contains("samsung")) {
                map.put(phoneNames.get(i).getText(), hits.get(i).getText());
            }
        }
        return map;
    }
}
