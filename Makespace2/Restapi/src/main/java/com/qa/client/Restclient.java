package com.qa.client;

import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.net.http.HttpClient;
import java.util.HashMap;

public class Restclient {
    //GET Method
    public void get(String url) throws IOException {

        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet(url);
        CloseableHttpResponse closeableHttpResponse =  httpclient.execute(httpget);
        int statuscode= closeableHttpResponse.getStatusLine().getStatusCode();
        System.out.println("Staus code"+statuscode);

        String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(),"UTF-8");

        JSONObject responseJSON = new JSONObject(responseString);
        System.out.println("Response"+ responseJSON);

        Header[] headersarray = closeableHttpResponse.getAllHeaders();
        HashMap<String, String> allHeaders = new HashMap<String, String>();

        for(Header header : headersarray){
            allHeaders.put(header.getName(), header.getValue());

        }

        System.out.println("Headers array"+ headersarray);





    }

}
