package org.example.testautomation.mobile;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.example.testautomation.web.gsm.bases.BrandsBase;
import org.example.testautomation.web.gsm.bases.PhoneTypeBase;
import org.example.testautomation.web.gsm.bases.ShowAllBase;
import org.example.testautomation.web.gsm.bases.SpecsBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MobileTest implements IAbstractTest {

    @Test(dataProvider = "DP")
    public void testMobile(String brand, Integer model) {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        BrandsBase brandsPage = homePage.getBrand(brand);
        PhoneTypeBase typePage = brandsPage.getPhoneType(model);
        ShowAllBase showAllPage = typePage.getAllPrices();
        SpecsBase specsPage = showAllPage.getSpecs();
        specsPage.getPics();
    }

    @DataProvider(name = "DP")
    public Object[][]dataProvider() {
        return new Object[][] {
                {"sony", 7}
        };
    }

}
