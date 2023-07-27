package org.example.testautomation.web.classic;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.example.testautomation.web.classic.bases.SelectionBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SelectionPage extends SelectionBase {

    @FindBy(xpath = "//li[@title='Visit store MB Vintage Cars']//a")
    private ExtendedWebElement visitStoreLink;

    public SelectionPage(WebDriver driver) {
        super(driver);
    }

    public void openStore() {
        this.visitStoreLink.click();
    }
}
