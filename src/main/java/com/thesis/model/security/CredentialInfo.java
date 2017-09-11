package com.thesis.model.security;

import java.util.Date;

/**
 * Created by mehdi on 3/17/17.
 */
public class CredentialInfo {
    public enum Status{
        EXPIRED, VALID
    }

    private Status status;
    private Date PasswordModifiedDate;
    private String previousPasswordsInUse;
    private int[][] geoGraphicalLoginPosition;
    private String loginSourceIP;
    private String operatingSystem;

}
