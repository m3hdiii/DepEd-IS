package com.deped.controller;

import com.deped.model.Response;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractMainController<T, ID> implements MainController<T, ID> {

    public ResponseEntity<T> makeCreateRestRequest(T entity, String restUrl, HttpMethod method, Class<T> entityClass) {
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity httpEntity = makeHttpEntity(entity);
        ResponseEntity<T> response = restTemplate.exchange(restUrl, method, httpEntity, entityClass);
        return response;
    }

    public ResponseEntity<Response> makeUpdateRestRequest(T entity, String restUrl, HttpMethod method) {
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity httpEntity = makeHttpEntity(entity);
        ResponseEntity<Response> response = restTemplate.exchange(restUrl, method, httpEntity, Response.class);
        return response;
    }

    public ResponseEntity<List<T>> makeFetchAllRestRequest(String restUrl, HttpMethod method, ParameterizedTypeReference<List<T>> typeRef) {
        return makeFetchByRangeRestRequest(restUrl, method, typeRef);
    }

    public ResponseEntity<List<T>> makeFetchByRangeRestRequest(String restUrl, HttpMethod method, ParameterizedTypeReference<List<T>> typeRef) {
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity httpEntity = makeHttpEntity(null);
        ResponseEntity<List<T>> response = restTemplate.exchange(restUrl, method, httpEntity, typeRef);
        return response;
    }

    public ResponseEntity<Boolean> makeRemoveRestRequest(T[] entities, String restUrl, HttpMethod method) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<T[]> httpEntity = new HttpEntity<>(entities, headers);
        ResponseEntity<Boolean> response = restTemplate.exchange(restUrl, method, httpEntity, Boolean.class);
        return response;
    }

    private HttpEntity makeHttpEntity(T entity) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<T> httpEntity = new HttpEntity<>(entity, headers);
        return httpEntity;
    }

    protected ModelAndView makeHintPage(String jspLocation, String className, String methodName) {
        Map<String, String> map = new HashMap<>();
        map.put("jspLocation", jspLocation);
        map.put("controllerClazz", className);
        map.put("methodName", methodName);
        return new ModelAndView(jspLocation, map);
    }


}
