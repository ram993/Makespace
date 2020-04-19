package com.qa.tests;

import com.qa.base.TestBase;
import com.qa.client.Restclient;
import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class GETAPITest extends TestBase {
    TestBase testBase;
    String serviceurl;
    String apiURL;
    String url;
    @BeforeMethod
    public void setup() throws IOException {
        testBase = new TestBase();
        String serviceurl = prop.getProperty("URL");
        String apiURL = prop.getProperty("serviceURL");

        String url = serviceurl + apiURL;
        Restclient restclient = new Restclient();
        restclient.get(url);
    }

    @Test
    public void getTest() throws ClientProtocolException, IOException {
        Restclient restclient = new Restclient();
        restclient.get(url);
    }


}
