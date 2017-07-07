package com.thesis.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

/**
 * Created by mehdi on 3/17/17.
 */

@Entity
@Table(name = "personnel")
public class Personnel {

    @Id
    @GeneratedValue
    @Column(name ="personnelId")
    private Long id;

    @Column(name = "username")
    @NotNull(message = "There should be at least one username for a personnel")
    @Length(min = 0, max = 254, message = "Your username can not be more than 254 character")
    private String username;

    @Column(name ="firstName")
    private String firstName;

    @Column(name="lastName")
    private String lastName;

    @Column(name="birthday")
    private Date birthday;

    @Column(name = "password")
    private String password;


    @NotNull(message = "Your email address must not be null !")
    @Pattern(regexp ="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
    @Length(min = 5, max = 254, message ="your email can not be more than 254 characters ")
    @Column(name = "email")
    private String email;

    @Column(name = "yearsOfExperience")
    private short yearsOfExperience;

    @Column(name ="dateOfEmployment")
    private Date dateOfEmployment;


    @Column(name= "userLocale")
    private String locale;

    @Column(name= "countryOfOrigin")
    private String country;

//    @Column(name = "accountStatus")
//    private AccountStatus accountStatus;
//
//    @Column(name = "credentialStatus")
//    private CredentialInfo credentialStatus;

//    @Column(name="picUrls")
//    private List<String> profilePictures;

    public Personnel() {
    }

    public Personnel(String username, String firstName, String lastName, Date birthday, String password, String email, short yearsOfExperience, Date dateOfEmployment, String locale, String country) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.password = password;
        this.email = email;
        this.yearsOfExperience = yearsOfExperience;
        this.dateOfEmployment = dateOfEmployment;
        this.locale = locale;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public short getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(short yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(Date dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
