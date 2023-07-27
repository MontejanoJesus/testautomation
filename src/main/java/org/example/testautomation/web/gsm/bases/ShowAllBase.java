package org.example.testautomation.web.gsm.bases;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ShowAllBase extends AbstractPage {
    public ShowAllBase(WebDriver driver) {
        super(driver);
    }

    public abstract SpecsBase getSpecs();
}
