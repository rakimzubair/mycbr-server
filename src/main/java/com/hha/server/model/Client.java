package com.hha.server.model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "CLIENT_DATA")
public class Client {
    //Saved answers to questions
    //all open to change depending on saving to database
    @Id
    @Column (name = "ID")
    private Long ID;

    @Column(name = "CONSENT")
    private Boolean CONSENT;
    @Column(name = "DATE")
    private String DATE;
    @Column (name = "FIRST_NAME")
    private String FIRST_NAME;
    @Column (name = "LAST_NAME")
    private String LAST_NAME;
    @Column (name = "AGE")
    private int AGE;
    @Column (name = "GENDER")
    private String GENDER;
    @Column (name = "LOCATION")
    private String LOCATION;
    @Column (name = "VILLAGE_NUMBER")
    private int VILLAGE_NUMBER;
    @Column (name = "CONTACT")
    private String CONTACT;
    @Column (name = "CAREGIVER_PRESENCE")
    private Boolean CAREGIVER_PRESENCE;
    @Column (name = "CAREGIVER_NUMBER")
    private String CAREGIVER_NUMBER;
    @Column (name = "DISABILITY")
    private String DISABILITY;
    @Column (name = "HEALTH_RATE")
    private String HEALTH_RATE;
    @Column (name = "HEALTH_REQUIREMENT")
    private String HEALTH_REQUIREMENT;
    @Column (name = "HEALTH_GOAL")
    private String HEALTH_GOAL;
    @Column (name = "EDUCATION_RATE")
    private String EDUCATION_RATE;
    @Column (name = "EDUCATION_REQUIRE")
    private String EDUCATION_REQUIRE;
    @Column (name = "EDUCATION_GOAL")
    private String EDUCATION_GOAL;
    @Column (name = "SOCIAL_RATE")
    private String SOCIAL_RATE;
    @Column (name = "SOCIAL_REQUIREMENT")
    private String SOCIAL_REQUIREMENT;
    @Column (name = "SOCIAL_GOAL")
    private String SOCIAL_GOAL;
    @Column (name = "IS_SYNCED")
    private int IS_SYNCED;


    public Client() {}

    public Client(Long ID, Boolean CONSENT, String DATE, String FIRST_NAME, String LAST_NAME, int AGE, String GENDER, String LOCATION, int VILLAGE_NUMBER, String CONTACT, Boolean CAREGIVER_PRESENCE, String CAREGIVER_NUMBER, String DISABILITY, String HEALTH_RATE, String HEALTH_REQUIREMENT, String HEALTH_GOAL, String EDUCATION_RATE, String EDUCATION_REQUIRE, String EDUCATION_GOAL, String SOCIAL_RATE, String SOCIAL_REQUIREMENT, String SOCIAL_GOAL, int IS_SYNCED) {
        this.ID = ID;
        this.CONSENT = CONSENT;
        this.DATE = DATE;
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.AGE = AGE;
        this.GENDER = GENDER;
        this.LOCATION = LOCATION;
        this.VILLAGE_NUMBER = VILLAGE_NUMBER;
        this.CONTACT = CONTACT;
        this.CAREGIVER_PRESENCE = CAREGIVER_PRESENCE;
        this.CAREGIVER_NUMBER = CAREGIVER_NUMBER;
        this.DISABILITY = DISABILITY;
        this.HEALTH_RATE = HEALTH_RATE;
        this.HEALTH_REQUIREMENT = HEALTH_REQUIREMENT;
        this.HEALTH_GOAL = HEALTH_GOAL;
        this.EDUCATION_RATE = EDUCATION_RATE;
        this.EDUCATION_REQUIRE = EDUCATION_REQUIRE;
        this.EDUCATION_GOAL = EDUCATION_GOAL;
        this.SOCIAL_RATE = SOCIAL_RATE;
        this.SOCIAL_REQUIREMENT = SOCIAL_REQUIREMENT;
        this.SOCIAL_GOAL = SOCIAL_GOAL;
        this.IS_SYNCED = IS_SYNCED;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Boolean getCONSENT() {
        return CONSENT;
    }

    public void setCONSENT(Boolean CONSENT) {
        this.CONSENT = CONSENT;
    }

    public String getDATE() {
        return DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    public int getAGE() {
        return AGE;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public String getLOCATION() {
        return LOCATION;
    }

    public void setLOCATION(String LOCATION) {
        this.LOCATION = LOCATION;
    }

    public int getVILLAGE_NUMBER() {
        return VILLAGE_NUMBER;
    }

    public void setVILLAGE_NUMBER(int VILLAGE_NUMBER) {
        this.VILLAGE_NUMBER = VILLAGE_NUMBER;
    }

    public String getCONTACT() {
        return CONTACT;
    }

    public void setCONTACT(String CONTACT) {
        this.CONTACT = CONTACT;
    }

    public Boolean getCAREGIVER_PRESENCE() {
        return CAREGIVER_PRESENCE;
    }

    public void setCAREGIVER_PRESENCE(Boolean CAREGIVER_PRESENCE) {
        this.CAREGIVER_PRESENCE = CAREGIVER_PRESENCE;
    }

    public String getCAREGIVER_NUMBER() {
        return CAREGIVER_NUMBER;
    }

    public void setCAREGIVER_NUMBER(String CAREGIVER_NUMBER) {
        this.CAREGIVER_NUMBER = CAREGIVER_NUMBER;
    }

    public String getDISABILITY() {
        return DISABILITY;
    }

    public void setDISABILITY(String DISABILITY) {
        this.DISABILITY = DISABILITY;
    }

    public String getHEALTH_RATE() {
        return HEALTH_RATE;
    }

    public void setHEALTH_RATE(String HEALTH_RATE) {
        this.HEALTH_RATE = HEALTH_RATE;
    }

    public String getHEALTH_REQUIREMENT() {
        return HEALTH_REQUIREMENT;
    }

    public void setHEALTH_REQUIREMENT(String HEALTH_REQUIREMENT) {
        this.HEALTH_REQUIREMENT = HEALTH_REQUIREMENT;
    }

    public String getHEALTH_GOAL() {
        return HEALTH_GOAL;
    }

    public void setHEALTH_GOAL(String HEALTH_GOAL) {
        this.HEALTH_GOAL = HEALTH_GOAL;
    }

    public String getEDUCATION_RATE() {
        return EDUCATION_RATE;
    }

    public void setEDUCATION_RATE(String EDUCATION_RATE) {
        this.EDUCATION_RATE = EDUCATION_RATE;
    }

    public String getEDUCATION_REQUIRE() {
        return EDUCATION_REQUIRE;
    }

    public void setEDUCATION_REQUIRE(String EDUCATION_REQUIRE) {
        this.EDUCATION_REQUIRE = EDUCATION_REQUIRE;
    }

    public String getEDUCATION_GOAL() {
        return EDUCATION_GOAL;
    }

    public void setEDUCATION_GOAL(String EDUCATION_GOAL) {
        this.EDUCATION_GOAL = EDUCATION_GOAL;
    }

    public String getSOCIAL_RATE() {
        return SOCIAL_RATE;
    }

    public void setSOCIAL_RATE(String SOCIAL_RATE) {
        this.SOCIAL_RATE = SOCIAL_RATE;
    }

    public String getSOCIAL_REQUIREMENT() {
        return SOCIAL_REQUIREMENT;
    }

    public void setSOCIAL_REQUIREMENT(String SOCIAL_REQUIREMENT) {
        this.SOCIAL_REQUIREMENT = SOCIAL_REQUIREMENT;
    }

    public String getSOCIAL_GOAL() {
        return SOCIAL_GOAL;
    }

    public void setSOCIAL_GOAL(String SOCIAL_GOAL) {
        this.SOCIAL_GOAL = SOCIAL_GOAL;
    }

    public int getIS_SYNCED() {
        return IS_SYNCED;
    }

    public void setIS_SYNCED(int IS_SYNCED) {
        this.IS_SYNCED = IS_SYNCED;
    }
}
