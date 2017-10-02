package com.deped;

import com.deped.controller.user.UserController;
import com.deped.model.Response;
import com.deped.model.account.User;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private static final String BASE_URL = "http://localhost:8074/rest/";
    private static final String CREATE_URL = BASE_URL + "user/create";
    private static final String UPDATE_URL = BASE_URL + "user/update";
    private static final String FETCH_URL = BASE_URL + "user/fetch-all";
    private static final String FETCH_RANGE_URL = BASE_URL + "user/fetch-all/%d/%d";

    private static final List<User> USERS = new ArrayList<>();

    static {
        User user = new User();
        user.setUserId(4L);
        user.setUsername("Jooje");
        user.setPassword("123");
        user.setFirstName("Mehdi Star");
        user.setLastName("Mark Richards");
        user.setEmailAddress("ix67@yahoo.com");

        User user2 = new User();
        user2.setUserId(2L);
        user2.setUsername("Jooje2");
        user2.setPassword("12344");
        user2.setFirstName("Mehdi Star3w");
        user2.setLastName("Mark Richardsw");
        user2.setEmailAddress("ix637@yahoo.com");

        USERS.add(user);
        USERS.add(user2);

    }

    public static void main(String[] args) {
        //makeCreateRestRequest(CREATE_URL, USERS);
        //makeUpdateRestRequest(UPDATE_URL, USERS);
        makeFetchAllRestRequest(FETCH_URL);
        makeFetchAllByRangeRestRequest(String.format(FETCH_RANGE_URL, 1, 10));
    }

    private static void makeCreateRestRequest(String createUrl, List<User> users) {
        for (User user : users) {
            ResponseEntity<User> result = new UserController().makeCreateRestRequest(user, createUrl, HttpMethod.POST, User.class);
            System.out.println(result.getStatusCode().toString());
            System.out.println(String.format("user-id: %d and username: %s", result.getBody().getUserId(), result.getBody().getUsername()));
        }
    }

    private static void makeUpdateRestRequest(String createUrl, List<User> users) {
        for (User user : users) {
            ResponseEntity<Response> result = new UserController().makeUpdateRestRequest(user, createUrl, HttpMethod.POST);
            System.out.println(result.getStatusCode().toString());
            System.out.println(result.getBody().getResponseStatus().toString());
        }
    }

    private static void makeFetchAllRestRequest(String createUrl) {

        ResponseEntity<List<User>> result = new UserController().makeFetchAllRestRequest(createUrl, HttpMethod.POST, new ParameterizedTypeReference<List<User>>() {
        });
        System.out.println(result.getStatusCode());
        for (User user : result.getBody()) {
            System.out.println(result.getStatusCode().toString());
            System.out.println(String.format("user-id: %d and username: %s", user.getUserId(), user.getUsername()));
        }
    }

    private static void makeFetchAllByRangeRestRequest(String createUrl) {
        ResponseEntity<List<User>> result = new UserController().makeFetchByRangeRestRequest(createUrl, HttpMethod.POST, new ParameterizedTypeReference<List<User>>() {
        });
        System.out.println(result.getStatusCode());
        for (User user : result.getBody()) {
            System.out.println(result.getStatusCode().toString());
            System.out.println(String.format("user-id: %d and username: %s", user.getUserId(), user.getUsername()));
        }
    }
}
