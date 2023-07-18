package org.example.testautomation;

import com.zebrunner.carina.utils.Configuration;
import org.example.testautomation.api.LoginLinkedIn;
import org.example.testautomation.api.PostUserMethod;
import org.testng.annotations.Test;

public class LinkedInAPITest {
    @Test
    public void testLinkedIn() {
        LoginLinkedIn loginLinkedIn = new LoginLinkedIn();
        loginLinkedIn.setHeader("Authorization", "Bearer <"+Configuration.getEnvArg("api_access_token")+">");
        loginLinkedIn.callAPI();

        PostUserMethod postUserMethod = new PostUserMethod();
        postUserMethod.callAPI();

    }

}
