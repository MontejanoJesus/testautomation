package org.example.testautomation.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.Configuration;

@Endpoint(url = "${base}/me?access_token=${access_token}", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path="api/facebook/_get/user/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetUserMethods extends AbstractApiMethodV2 {

    public GetUserMethods() {
        replaceUrlPlaceholder("base", Configuration.getEnvArg("api_url"));
        replaceUrlPlaceholder("access_token", Configuration.getEnvArg("api_access_token") );
    }
}
