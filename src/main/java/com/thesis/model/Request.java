package com.thesis.model;


import java.util.Date;

/**
 * Created by mehdi on 7/6/17.
 */
public class Request {

    private Long requestId;
    private String description;
    private Date requestDate;
    private Date approvedDate;
    private Date releaseDate;
    private RequestStatus requestStatus;
    private String disapprovalMessage;
    private Item requestDetails;
    private User user;

    public Request(String description, Date requestDate, Date approvedDate, Date releaseDate, RequestStatus requestStatus, String disapprovalMessage, Item requestDetails, User user) {
        this.description = description;
        this.requestDate = requestDate;
        this.approvedDate = approvedDate;
        this.releaseDate = releaseDate;
        this.requestStatus = requestStatus;
        this.disapprovalMessage = disapprovalMessage;
        this.requestDetails = requestDetails;
        this.user = user;
    }

    public Request(Long requestId, String description, Date requestDate, Date approvedDate, Date releaseDate, RequestStatus requestStatus, String disapprovalMessage, Item requestDetails, User user) {
        this.requestId = requestId;
        this.description = description;
        this.requestDate = requestDate;
        this.approvedDate = approvedDate;
        this.releaseDate = releaseDate;
        this.requestStatus = requestStatus;
        this.disapprovalMessage = disapprovalMessage;
        this.requestDetails = requestDetails;
        this.user = user;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(Date approvedDate) {
        this.approvedDate = approvedDate;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getDisapprovalMessage() {
        return disapprovalMessage;
    }

    public void setDisapprovalMessage(String disapprovalMessage) {
        this.disapprovalMessage = disapprovalMessage;
    }

    public Item getRequestDetails() {
        return requestDetails;
    }

    public void setRequestDetails(Item requestDetails) {
        this.requestDetails = requestDetails;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
