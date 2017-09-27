package com.thesis.controller;

import com.thesis.model.Response;
import com.thesis.model.ResponseStatus;

public abstract class AbstractMainController<T, ID> implements MainController<T, ID> {

    public Response makeResponse(Boolean isSuccessful, String successMessage, String failureMessage) {
        if (isSuccessful) {
            return new Response(ResponseStatus.SUCCESSFUL, successMessage);
        } else {
            return new Response(ResponseStatus.FAILED, failureMessage);
        }
    }
}
