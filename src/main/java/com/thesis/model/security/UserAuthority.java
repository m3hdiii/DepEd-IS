package com.thesis.model.security;

import com.thesis.model.security.Authority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by mehdi on 7/6/17.
 */

@Entity
@Table(name = "user_authority")
public class UserAuthority {

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "authority")
    private Authority authority;


}


