package com.thesis.model.account;

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
    @Column(name = "personnelId")
    private Long id;

    @Column(name = "username")
    @NotNull(message = "There should be at least one username for a personnel")
    @Length(min = 0, max = 254, message = "Your username can not be more than 254 character")
    private String username;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "password")
    private String password;


    @NotNull(message = "Your email address must not be null !")
    @Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
    @Length(min = 5, max = 254, message = "your email can not be more than 254 characters ")
    @Column(name = "email")
    private String email;

    @Column(name = "yearsOfExperience")
    private short yearsOfExperience;

    @Column(name = "dateOfEmployment")
    private Date dateOfEmployment;


    @Column(name = "userLocale")
    private String locale;

    @Column(name = "countryOfOrigin")
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


}
