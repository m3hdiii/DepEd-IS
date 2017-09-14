package com.thesis.model.account;

import com.thesis.model.location.office.Section;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Mehdi on 6/8/2017.
 */

@NamedQueries({
        @NamedQuery(
                name = "findByUsernamePassword",
                query = "SELECT user From User user WHERE user.username=:username AND user.password=:password"
        ),
        @NamedQuery(
                name = "findByEmailPassword",
                query = "SELECT user From User user WHERE user.emailAddress=:emailAddress AND user.password=:password"
        ),
        @NamedQuery(
                name = "findUsersByInfo",
                query = "SELECT user From User user WHERE user.firstName LIKE :likeInfo"
        )


})

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id ")
    private Long userId;

    //    @NotNull(message = "There should be at least one username for a personnel")
//    @Length(min = 3, max = 254, message = "Your username can not be more than 254 character")
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "account_status")
    @Enumerated(value = EnumType.STRING)
    private AccountStatus accountStatus;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;

    //    @NotNull(message = "Your email address must not be null !")
//    @Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
//    @Length(min = 5, max = 254, message = "your email can not be more than 254 characters ")
    @Column(name = "email_address", unique = true)
    private String emailAddress;

    @Column(name = "phone_no1")
    private String phoneNo1;

    @Column(name = "phone_no2")
    private String phoneNo2;

    @Column(name = "gender")
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    @Temporal(TemporalType.DATE)
    @Column(name = "birth_date")
    private Date birthDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "employment_date")
    private Date employmentDate;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "position")
    private Position position;

    @Column(name = "address")
    private String address;

    @Column(name = "website")
    private String website;

    @Column(name = "picture")
    private byte[] picture;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_date", updatable = false)
    private Date createdDate;

    @Column(name = "referrer_name")
    private String referrerName;

    @Column(name = "referrer_address")
    private String referrerAddress;

    @Column(name = "referrer_phone_no1")
    private String referrerPhoneNo1;

    @Column(name = "referrer_phone_no2")
    private String referrerPhoneNo2;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "section_id")
    private Section section;

//    @Column(name = "manager_id")
//    private User manager;

    @Column(name = "years_of_experience")
    private Short yearsOfExperience;

    @Formula("lower(datediff(curdate(), birth_date)/365)")
    private Integer age;


    public User() {
    }

    public User(String username, String password, AccountStatus accountStatus, String firstName, String lastName, String middleName, String emailAddress, String phoneNo1, String phoneNo2, Gender gender, Date birthDate, Date employmentDate, Position position, String address, String website, byte[] picture, Date createdDate, String referrerName, String referrerAddress, String referrerPhoneNo1, String referrerPhoneNo2, Section section, Short yearsOfExperience, Integer age) {
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
        this.yearsOfExperience = yearsOfExperience;
        this.age = age;
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

    public Date getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(Date employmentDate) {
        this.employmentDate = employmentDate;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
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

    public Short getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Short yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}