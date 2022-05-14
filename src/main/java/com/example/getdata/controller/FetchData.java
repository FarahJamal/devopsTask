package com.example.getdata.controller;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class FetchData {

    HttpClient client = HttpClientBuilder.create().build();
    HttpGet request = new HttpGet("http://localhost:8083/api/marks/all-details/devops");

        HttpResponse response;

    {
        try {
            response = client.execute(request);
            HttpEntity entity = response.getEntity();

            // Read the contents of an entity and return it as a String.
            String content = EntityUtils.toString(entity);
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
