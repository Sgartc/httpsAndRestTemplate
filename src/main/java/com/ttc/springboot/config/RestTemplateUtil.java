package com.ttc.springboot.config;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


/**
 * @Sagrtc
 * @date 2023/2/28 - 16:12
 */
public class RestTemplateUtil {
    public static String send(String url) throws URISyntaxException, IOException {
        RestTemplate restTemplate = new RestTemplate();
        String rcm_url = "http://" + url;
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-type","application/json;charset=utf-8");
        HttpEntity<String> httpEntity = new HttpEntity<>("",httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(rcm_url, HttpMethod.POST,httpEntity,String.class);
        return responseEntity.getBody();

    }

    public static void main(String[] args) throws IOException, URISyntaxException {
        System.out.println(send("www.ttc.com:8080/ttc/admin/hello"));
    }
}
