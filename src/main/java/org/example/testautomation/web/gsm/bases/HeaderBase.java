package org.example.testautomation.web.gsm.bases;

import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class HeaderBase extends AbstractUIObject {
    public HeaderBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
