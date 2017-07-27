package com.thesis.model;


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
}