package com.thesis.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mehdi on 7/6/17.
 */

@Entity
@Table(name = "BORROW_REQUEST")
public class BorrowRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BORROW_ID")
    private Long borrowId;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "REQUEST_DATE")
    private Date requestDate;

    @Column(name = "APPROVAL_DATE")
    private Date approvalDate;

    @Column(name = "RELEASE_DATE")
    private Date releaseDate;

    @Column(name = "BORROW_STATUS")
    private BorrowStatus borrowStatus;

    @Column(name = "DISAPPROVAL_MESSAGE")
    private String disapprovalMessage;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "")
    private Set<Equipment> equipments = new HashSet<>();


}
