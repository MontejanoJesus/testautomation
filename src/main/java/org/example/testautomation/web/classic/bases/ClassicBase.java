package org.example.testautomation.web.classic.bases;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;


public abstract class ClassicBase extends AbstractPage {
    public ClassicBase(WebDriver driver) {
        super(driver);
    }

    public abstract EraBase getEra(Integer x);

    @Override
    public void open() {
        super.open();
    }
}
