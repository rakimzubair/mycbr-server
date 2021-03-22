package com.hha.server.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "ADMIN_MESSAGES")
public class AdminMessage {
    @Id
    @JsonProperty("ADMIN_ID")
    private String adminID;

    @Column
    @JsonProperty("DATE")
    private String date;

    @Column
    @JsonProperty("MESSAGE")
    private String message;

    @Column
    @JsonProperty("IS_SYNCED")
    private String isSynced;

    @Column
    @JsonProperty("IS_VIEWED")
    private String viewedStatus;

    public AdminMessage() {
    }

    public AdminMessage(String adminID, String date, String message, String isSynced, String viewedStatus) {
        this.adminID = adminID;
        this.date = date;
        this.message = message;
        this.isSynced = isSynced;
        this.viewedStatus = viewedStatus;
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getIsSynced() {
        return isSynced;
    }

    public void setIsSynced(String isSynced) {
        this.isSynced = isSynced;
    }

    public String getViewedStatus() {
        return viewedStatus;
    }

    public void setViewedStatus(String viewedStatus) {
        this.viewedStatus = viewedStatus;
    }
}
