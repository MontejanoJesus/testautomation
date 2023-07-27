package org.example.testautomation.web.gsm;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.example.testautomation.web.gsm.bases.RumorBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = RumorBase.class)
public class RumorPage extends RumorBase {
    public RumorPage(WebDriver driver) {
        super(driver);
    }
}
