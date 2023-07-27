package org.example.testautomation.web.classic.bases;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class SelectionBase extends AbstractPage {

    public abstract void openStore();
    public SelectionBase(WebDriver driver) {
        super(driver);
    }

    public void open() {
        super.open();
    }
}
