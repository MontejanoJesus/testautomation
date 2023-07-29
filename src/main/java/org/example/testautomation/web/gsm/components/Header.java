package org.example.testautomation.web.gsm.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.example.testautomation.web.gsm.bases.HeaderBase;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Header extends HeaderBase {

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/button")
    private ExtendedWebElement hamburgerButton;

    @FindBy(xpath = "//*[@id=\"social-connect\"]/a[1]")
    private ExtendedWebElement tipUsButton;

    @FindBy(xpath = "//*[@id=\"social-connect\"]/a[2]")
    private ExtendedWebElement youtubeButton;

    @FindBy(xpath = "//*[@id=\"social-connect\"]/a[3]")
    private ExtendedWebElement instagramButton;

    @FindBy(xpath = "//*[@id=\"social-connect\"]/a[4]")
    private ExtendedWebElement rssNewsButton;

    @FindBy(xpath = "//*[@id=\"social-connect\"]/a[5]")
    private ExtendedWebElement evArenaButton;

    @FindBy(xpath = "//*[@id=\"social-connect\"]/a[6]")
    private ExtendedWebElement merchButton;

    @FindBy(xpath = "//*[@id=\"login-active\"]")
    private ExtendedWebElement logInButton;

    @FindBy(xpath = "//*[@id=\"social-connect\"]/a[8]")
    private ExtendedWebElement signUpButton;

    public Header(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
