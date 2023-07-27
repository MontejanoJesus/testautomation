package org.example.testautomation.web.classic.bases;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;


public abstract class EraBase extends AbstractPage {
    public EraBase(WebDriver driver) {
        super(driver);
    }

    public abstract SelectionBase getCarLinks(Integer x);

    @Override
    public void open() {
        super.open();
    }


}
