package com.thesis.controller;

import com.thesis.model.Response;
import com.thesis.model.ResponseStatus;
import com.thesis.model.items.Category;

public abstract class AbstractMainController<T, ID> implements MainController<T, ID> {

    public final Response makeResponse(Boolean isSuccessful, Operation operation, Class<T> entity) {
        String successMessage = "", failureMessage = "";
        switch (operation) {
            case CREATE:
                successMessage = String.format(CREATE_SUCCESSFUL_MESSAGE, entity.getSimpleName());
                failureMessage = String.format(CREATE_FAILURE_MESSAGE, entity.getSimpleName());
                break;
            case DELETE:
                successMessage = String.format(DELETE_SUCCESSFUL_MESSAGE, entity.getSimpleName());
                failureMessage = String.format(DELETE_FAILURE_MESSAGE, entity.getSimpleName());
                break;
            case UPDATE:
                successMessage = String.format(UPDATE_SUCCESSFUL_MESSAGE, entity.getSimpleName());
                failureMessage = String.format(UPDATE_FAILURE_MESSAGE, entity.getSimpleName());
                break;
        }

        if (isSuccessful) {
            return new Response(ResponseStatus.SUCCESSFUL, successMessage);
        } else {
            return new Response(ResponseStatus.FAILED, failureMessage);
        }
    }

    public static final String createUrl(Operation operation, Class<?> clazz) {
        return "";
    }
}
