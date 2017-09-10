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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getPasswordModifiedDate() {
        return PasswordModifiedDate;
    }

    public void setPasswordModifiedDate(Date passwordModifiedDate) {
        PasswordModifiedDate = passwordModifiedDate;
    }

    public String getPreviousPasswordsInUse() {
        return previousPasswordsInUse;
    }

    public void setPreviousPasswordsInUse(String previousPasswordsInUse) {
        this.previousPasswordsInUse = previousPasswordsInUse;
    }

    public int[][] getGeoGraphicalLoginPosition() {
        return geoGraphicalLoginPosition;
    }

    public void setGeoGraphicalLoginPosition(int[][] geoGraphicalLoginPosition) {
        this.geoGraphicalLoginPosition = geoGraphicalLoginPosition;
    }

    public String getLoginSourceIP() {
        return loginSourceIP;
    }

    public void setLoginSourceIP(String loginSourceIP) {
        this.loginSourceIP = loginSourceIP;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
