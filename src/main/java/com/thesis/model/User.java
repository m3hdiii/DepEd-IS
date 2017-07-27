package com.thesis.model;

import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Mehdi on 6/8/2017.
 */

@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ACCOUNT_ID ", nullable = false)
    private Long userId;

    @Column(name = "USERNAME", nullable = false, updatable = false)
    private String username;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "ACCOUNT_STATUS", nullable = false)
    private AccountStatus accountStatus;

    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @Column(name = "MIDDLE_NAME")
    private String middleName;

    @Column(name = "EMAIL_ADDRESS", nullable = false, unique = true)
    private String emailAddress;

    @Column(name = "PHONE_NO1", nullable = false)
    private String phoneNo1;

    @Column(name = "PHONE_NO2")
    private String phoneNo2;

    @Column(name = "GENDER", nullable = false)
    private Gender gender;

    @Temporal(TemporalType.DATE)
    @Column(name = "BIRTH_DATE", nullable = false)
    private Date birthDate;

    @Column(name = "POSITION")
    private String position;

    @Column(name = "ADDRESS", nullable = false)
    private String address;

    @Column(name = "WEBSITE")
    private String website;

    @Column(name = "PICTURE", nullable = false)
    private byte[] picture;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATE", updatable = false)
    private Date createdDate;

    @Column(name = "REFERRER_NAME", nullable = false)
    private String referrerName;

    @Column(name = "REFERRER_ADDRESS", nullable = false)
    private String referrerAddress;

    @Column(name = "REFERRER_PHONE_NO1", nullable = false)
    private String referrerPhoneNo1;

    @Column(name = "REFERRER_PHONE_NO2")
    private String referrerPhoneNo2;

    @Column(name = "SECTION")
    private Section section;

    @Column(name = "ROLE", nullable = false)
    private Role role;

    @Column(name = "MANAGER_ID")
    private User manager;

    @Formula("lower(datediff(curdate(), birthdate)/365)")
    private Integer age;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Request> requests = new HashSet<>();

    public User(){}

}
