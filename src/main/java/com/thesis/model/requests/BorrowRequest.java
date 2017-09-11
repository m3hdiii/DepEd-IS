package com.thesis.model.requests;

import com.thesis.model.items.equipments.Equipment;
import com.thesis.model.account.User;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mehdi on 7/6/17.
 */

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


}
