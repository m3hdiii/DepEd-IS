package com.thesis.model;

import java.util.Date;

/**
 * Created by mehdi on 7/6/17.
 */
public class BorrowRequest {

    private Long borrowId;
    private String description;
    private Date requestDate;
    private Date approvalDate;
    private Date releaseDate;
    private BorrowStatus borrowStatus;
    private String disapprovalMessage;
    private Long userId;
    private Long equipmentId;


    public BorrowRequest(String description, Date requestDate, Date approvalDate, Date releaseDate, BorrowStatus borrowStatus, String disapprovalMessage, Long userId, Long equipmentId) {
        this.description = description;
        this.requestDate = requestDate;
        this.approvalDate = approvalDate;
        this.releaseDate = releaseDate;
        this.borrowStatus = borrowStatus;
        this.disapprovalMessage = disapprovalMessage;
        this.userId = userId;
        this.equipmentId = equipmentId;
    }

    public BorrowRequest(Long borrowId, String description, Date requestDate, Date approvalDate, Date releaseDate, BorrowStatus borrowStatus, String disapprovalMessage, Long userId, Long equipmentId) {
        this.borrowId = borrowId;
        this.description = description;
        this.requestDate = requestDate;
        this.approvalDate = approvalDate;
        this.releaseDate = releaseDate;
        this.borrowStatus = borrowStatus;
        this.disapprovalMessage = disapprovalMessage;
        this.userId = userId;
        this.equipmentId = equipmentId;
    }

    public Long getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(Long borrowId) {
        this.borrowId = borrowId;
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

    public Date getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(Date approvalDate) {
        this.approvalDate = approvalDate;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public BorrowStatus getBorrowStatus() {
        return borrowStatus;
    }

    public void setBorrowStatus(BorrowStatus borrowStatus) {
        this.borrowStatus = borrowStatus;
    }

    public String getDisapprovalMessage() {
        return disapprovalMessage;
    }

    public void setDisapprovalMessage(String disapprovalMessage) {
        this.disapprovalMessage = disapprovalMessage;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Long equipmentId) {
        this.equipmentId = equipmentId;
    }
}
