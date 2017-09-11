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
@Table(name = "request")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_id")
    private Long requestId;

    @Column(name = "description")
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "request_date")
    private Date requestDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "approved_date")
    private Date approvedDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "release_date")
    private Date releaseDate;

    @Column(name = "request_status")
    private RequestStatus requestStatus;

    @Column(name = "disapproval_message")
    private String disapprovalMessage;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "item_request", joinColumns = @JoinColumn(name = "request_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id"))
    Set<Item> items = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}