package com.thesis.model.account;

import com.thesis.model.security.Role;
import com.thesis.model.location.officeplace.Section;
import com.thesis.model.requests.Request;
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
    @ManyToOne
    @JoinColumn(name = "SECTION_ID")
    private Section section;

    @Column(name = "ROLE", nullable = false)
    private Role role;

    @Column(name = "MANAGER_ID")
    private User manager;

    @Formula("lower(datediff(curdate(), birthdate)/365)")
    private Integer age;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Request> requests = new HashSet<>();

    public User() {
    }

    public User(String username, String password, AccountStatus accountStatus, String firstName, String lastName, String middleName, String emailAddress, String phoneNo1, String phoneNo2, Gender gender, Date birthDate, String position, String address, String website, byte[] picture, Date createdDate, String referrerName, String referrerAddress, String referrerPhoneNo1, String referrerPhoneNo2, Section section, Role role, User manager, Integer age, Set<Request> requests) {
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
        this.age = age;
        this.requests = requests;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNo1() {
        return phoneNo1;
    }

    public void setPhoneNo1(String phoneNo1) {
        this.phoneNo1 = phoneNo1;
    }

    public String getPhoneNo2() {
        return phoneNo2;
    }

    public void setPhoneNo2(String phoneNo2) {
        this.phoneNo2 = phoneNo2;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getReferrerName() {
        return referrerName;
    }

    public void setReferrerName(String referrerName) {
        this.referrerName = referrerName;
    }

    public String getReferrerAddress() {
        return referrerAddress;
    }

    public void setReferrerAddress(String referrerAddress) {
        this.referrerAddress = referrerAddress;
    }

    public String getReferrerPhoneNo1() {
        return referrerPhoneNo1;
    }

    public void setReferrerPhoneNo1(String referrerPhoneNo1) {
        this.referrerPhoneNo1 = referrerPhoneNo1;
    }

    public String getReferrerPhoneNo2() {
        return referrerPhoneNo2;
    }

    public void setReferrerPhoneNo2(String referrerPhoneNo2) {
        this.referrerPhoneNo2 = referrerPhoneNo2;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Set<Request> getRequests() {
        return requests;
    }

    public void setRequests(Set<Request> requests) {
        this.requests = requests;
    }
}
