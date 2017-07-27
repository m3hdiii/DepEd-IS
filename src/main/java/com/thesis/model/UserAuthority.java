package com.thesis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by mehdi on 7/6/17.
 */

@Entity
@Table(name = "")
public class UserAuthority {

    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "AUTHORITY")
    private Authority authority;


}


