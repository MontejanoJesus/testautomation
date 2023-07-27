package org.example.testautomation.web.walmart.bases;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class DealsBase extends AbstractPage {
    protected DealsBase(WebDriver driver) {
        super(driver);
    }
}
