package org.example.testautomation.web.gsm.bases;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ReviewBase extends AbstractPage {
    public ReviewBase(WebDriver driver) {
        super(driver);
    }

    public abstract ShowAllBase getAllPrices();
}
