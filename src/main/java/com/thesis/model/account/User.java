package com.thesis.model.account;

import com.thesis.model.location.City;
import com.thesis.model.location.Country;
import com.thesis.model.requests.BorrowRequest;
import com.thesis.model.security.Role;
import com.thesis.model.location.office.Section;
import com.thesis.model.requests.Request;
import org.hibernate.annotations.Formula;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Mehdi on 6/8/2017.
 */

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id ", nullable = false)
    private Long userId;

    @NotNull(message = "There should be at least one username for a personnel")
    @Length(min = 3, max = 254, message = "Your username can not be more than 254 character")
    @Column(name = "username", nullable = false, updatable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "account_status", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private AccountStatus accountStatus;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;

    @NotNull(message = "Your email address must not be null !")
    @Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
    @Length(min = 5, max = 254, message = "your email can not be more than 254 characters ")
    @Column(name = "email_address", nullable = false, unique = true)
    private String emailAddress;

    @Column(name = "phone_no1", nullable = false)
    private String phoneNo1;

    @Column(name = "phone_no2")
    private String phoneNo2;

    @Column(name = "gender", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    @Temporal(TemporalType.DATE)
    @Column(name = "birth_date", nullable = false)
    private Date birthDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "employment_date")
    private Date employmentDate;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "position")
    private Position position;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "website")
    private String website;

    @Column(name = "picture", nullable = false)
    private byte[] picture;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_date", updatable = false)
    private Date createdDate;

    @Column(name = "reference_name", nullable = false)
    private String referrerName;

    @Column(name = "reference_address", nullable = false)
    private String referrerAddress;

    @Column(name = "referrer_phone_no1", nullable = false)
    private String referrerPhoneNo1;

    @Column(name = "referrer_phone_no2")
    private String referrerPhoneNo2;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "section_id")
    private Section section;

    @Column(name = "role", nullable = false)
    private Role role;

    @Column(name = "manager_id")
    private User manager;

    @Column(name = "years_of_experience")
    private Short yearsOfExperience;

    @Formula("lower(datediff(curdate(), birthdate)/365)")
    private Integer age;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Request> requests = new HashSet<>();

    private Set<BorrowRequest> borrowRequests = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id")
    private City city;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id")
    private Country county;

    public User() {
    }

    public User(String username, String password, AccountStatus accountStatus, String firstName, String lastName, String middleName, String emailAddress, String phoneNo1, String phoneNo2, Gender gender, Date birthDate, Date employmentDate, Position position, String address, String website, byte[] picture, Date createdDate, String referrerName, String referrerAddress, String referrerPhoneNo1, String referrerPhoneNo2, Section section, Role role, User manager, Short yearsOfExperience, Integer age, Set<Request> requests, Set<BorrowRequest> borrowRequests, City city, Country county) {
        this.username = username;
        this.password = password;
        this.accountStatus = accountStatus;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.emailAddress = emailAddress;
        this.phoneNo1 = phoneNo1;
        this.phoneNo2 = phoneNo2;
        this.gender = gender;
        this.birthDate = birthDate;
        this.employmentDate = employmentDate;
        this.position = position;
        this.address = address;
        this.website = website;
        this.picture = picture;
        this.createdDate = createdDate;
        this.referrerName = referrerName;
        this.referrerAddress = referrerAddress;
        this.referrerPhoneNo1 = referrerPhoneNo1;
        this.referrerPhoneNo2 = referrerPhoneNo2;
        this.section = section;
        this.role = role;
        this.manager = manager;
        this.yearsOfExperience = yearsOfExperience;
        this.age = age;
        this.requests = requests;
        this.borrowRequests = borrowRequests;
        this.city = city;
        this.county = county;
    }
}