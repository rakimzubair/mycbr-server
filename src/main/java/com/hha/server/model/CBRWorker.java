package com.hha.server.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;

@Entity
@Table(name = "WORKER_DATA")
public class CBRWorker {

    @Id
    @Column
    @JsonProperty("FIRST_NAME")
    private String FIRST_NAME;

    @Id
    @Column
    @JsonProperty("LAST_NAME")
    private String LAST_NAME;

    @Id
    @Column
    @JsonProperty("EMAIL")
    private String EMAIL;

    @Id
    @Column
    @JsonProperty("PASSWORD")
    private String PASSWORD;

    @Id
    @Column
    @JsonProperty("ID")
    private int ID;

    public CBRWorker(String FIRST_NAME, String LAST_NAME, String EMAIL, String PASSWORD) {
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.EMAIL = EMAIL;
        this.PASSWORD = PASSWORD;
    }

    public CBRWorker(){
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

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
