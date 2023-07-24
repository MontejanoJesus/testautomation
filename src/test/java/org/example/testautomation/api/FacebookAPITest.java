package org.example.testautomation.api;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.zebrunner.carina.api.apitools.validation.JsonCompareKeywords;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class FacebookAPITest implements IAbstractTest {

    @Test
    public void getUserIdTest() {
        GetUserMethods api = new GetUserMethods();
        api.callAPIExpectSuccess();
        api.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        api.validateResponseAgainstSchema("api/facebook/_get/user/rs.schema");
    }

    @Test
    public void postTest() {
        PostMethod api = new PostMethod();
        api.setProperties("api/facebook/_post/post.properties");
        api.replaceUrlPlaceholder("message", api.getProperties().getProperty("message"));

        api.callAPI();
        api.validateResponse();
    }

    @Test
    public void getPostTest() {
        GetPostMethod api = new GetPostMethod();
        api.setProperties("api/facebook/_get/post/id.properties");
        String id = api.getProperties().getProperty("id");
        api.getProperties().setProperty("id", id);
        api.replaceUrlPlaceholder("page_id", api.getProperties().getProperty("id"));

        api.callAPI();
    }
}
