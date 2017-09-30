package com.thesis.model.request;

import com.thesis.model.items.equipment.Equipment;
import com.thesis.model.account.User;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mehdi on 7/6/17.
 */


@NamedQueries({
        @NamedQuery(name = "fetchAll", query = "SELECT br FROM BorrowRequest br")
})
@Entity
@Table(name = "borrow_request")
public class BorrowRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "borrow_id")
    private Long borrowId;

    @Column(name = "description")
    private String description;

    @Column(name = "request_date")
    private Date requestDate;

    @Column(name = "approval_date")
    private Date approvalDate;

    @Column(name = "release_date")
    private Date releaseDate;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "borrow_status")
    private BorrowStatus borrowStatus;

    @Column(name = "disapproval_message")
    private String disapprovalMessage;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "")
    private Set<Equipment> equipments = new HashSet<>();

    public BorrowRequest() {
    }

    public BorrowRequest(String description, Date requestDate, Date approvalDate, Date releaseDate, BorrowStatus borrowStatus, String disapprovalMessage, User user, Set<Equipment> equipments) {
        this.description = description;
        this.requestDate = requestDate;
        this.approvalDate = approvalDate;
        this.releaseDate = releaseDate;
        this.borrowStatus = borrowStatus;
        this.disapprovalMessage = disapprovalMessage;
        this.user = user;
        this.equipments = equipments;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(Set<Equipment> equipments) {
        this.equipments = equipments;
    }
}
