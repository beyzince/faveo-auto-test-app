package org.testapp.Api.DataProvider;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testapp.Api.PropertyManager.PropertyManager;

public class RoleRequestBody {
    private String API_KEY = PropertyManager.getInstance().getApiKey();

    public String getCreateRoleRequestBody(String mspId){

//        JSONArray typesArr = new JSONArray();
//        typesArr.put("c1-msp-agent");

        JSONObject paramsObject = new JSONObject();
        paramsObject.put("id",mspId);
//        paramsObject.put("mspId",mspId);
//        paramsObject.put("email","beyza.ince.zahirfaveaao@yopmail.com");
//        paramsObject.put("camLogin", "");
        paramsObject.put("name","Account User");

        paramsObject.put("baseRoleId","3-Technician");

//        paramsObject.put("timeZone","GMT+03:00");
//        paramsObject.put("roleId",5);
//        paramsObject.put("lang","en");
//        paramsObject.put("types",typesArr);


        JSONObject additionalDataObject=new JSONObject();
        paramsObject.put("senderModuleId","ComodoOnePortal");
        paramsObject.put("mspId",mspId);


        JSONObject requestBody = new JSONObject();
        requestBody.put("requestType","event");
        requestBody.put("eventName","roleCreated");
        requestBody.put("mspId",mspId);
        requestBody.put("params",paramsObject);
        requestBody.put("requestId","6afcc4e0-7e95-11ec-b6c2-5bb1dd946257");
        requestBody.put("eventDispatcherNameSpace","ComodoOnePortal");
        requestBody.put("serNameSpace","ComodoOnePortal");
        requestBody.put("additionalData",additionalDataObject);

        requestBody.put("targetApiKey",API_KEY);


        return requestBody.toString();

    }
}
