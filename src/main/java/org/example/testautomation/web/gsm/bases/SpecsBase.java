package org.example.testautomation.web.gsm.bases;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class SpecsBase extends AbstractPage {
    public SpecsBase(WebDriver driver) {
        super(driver);
    }

    public abstract RumorBase getRumorMill();
    public abstract void getPics();
}
