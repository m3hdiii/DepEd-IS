package com.deped.model;


public class Response {

    private ResponseStatus responseStatus;
    private String responseMessage;
    private String responseCause;

    public Response(ResponseStatus responseStatus, String responseMessage) {
        this(responseStatus, responseMessage, null);
    }

    public Response(ResponseStatus responseStatus, String responseMessage, String responseCause) {
        this.responseStatus = responseStatus;
        this.responseMessage = responseMessage;
        this.responseCause = responseCause;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public String getResponseCause() {
        return responseCause;
    }
}
