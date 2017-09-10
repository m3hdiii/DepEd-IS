package com.thesis.model.requests;


import com.thesis.model.items.semigoods.Item;
import com.thesis.model.account.User;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mehdi on 7/6/17.
 */

@Entity
@Table(name = "REQUEST")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REQUEST_ID")
    private Long requestId;

    @Column(name = "DESCRIPTION")
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REQUEST_DATE")
    private Date requestDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "APPROVED_DATE")
    private Date approvedDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RELEASE_DATE")
    private Date releaseDate;

    @Column(name = "REQUEST_STATUS")
    private RequestStatus requestStatus;

    @Column(name = "DISAPPROVED_DESCRIPTION")
    private String disapprovalMessage;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "ITEM_REQUEST", joinColumns = @JoinColumn(name = "REQUEST_ID"),
            inverseJoinColumns = @JoinColumn(name = "ITEM_ID"))
    Set<Item> items = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    public Request() {
    }

    public Request(String description, Date requestDate, Date approvedDate, Date releaseDate, RequestStatus requestStatus, String disapprovalMessage, Set<Item> items, User user) {
        this.description = description;
        this.requestDate = requestDate;
        this.approvedDate = approvedDate;
        this.releaseDate = releaseDate;
        this.requestStatus = requestStatus;
        this.disapprovalMessage = disapprovalMessage;
        this.items = items;
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

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}