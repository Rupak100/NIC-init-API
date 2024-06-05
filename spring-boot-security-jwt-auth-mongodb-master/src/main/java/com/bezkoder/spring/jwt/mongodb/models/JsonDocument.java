package com.bezkoder.spring.jwt.mongodb.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.util.UUID;

@Document(collection = "json_data")
public class JsonDocument {
    @Id
    private UUID id;
    private String clientId;
    private String clientSecret;
    private Date createdOn;
    private Date expiryOn;
    private String stateCode;
    private String stateName;
    private String departmentCode;
    private String departmentName;
    private String govt;
    private String nodalOfficerName;
    private String nodalOfficerMobile;
    private String nodalOfficerEmail;
    private String nodalOfficerDesignation;
    private String content;

    // Getters and setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getExpiryOn() {
        return expiryOn;
    }

    public void setExpiryOn(Date expiryOn) {
        this.expiryOn = expiryOn;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getGovt() {
        return govt;
    }

    public void setGovt(String govt) {
        this.govt = govt;
    }

    public String getNodalOfficerName() {
        return nodalOfficerName;
    }

    public void setNodalOfficerName(String nodalOfficerName) {
        this.nodalOfficerName = nodalOfficerName;
    }

    public String getNodalOfficerMobile() {
        return nodalOfficerMobile;
    }

    public void setNodalOfficerMobile(String nodalOfficerMobile) {
        this.nodalOfficerMobile = nodalOfficerMobile;
    }

    public String getNodalOfficerEmail() {
        return nodalOfficerEmail;
    }

    public void setNodalOfficerEmail(String nodalOfficerEmail) {
        this.nodalOfficerEmail = nodalOfficerEmail;
    }

    public String getNodalOfficerDesignation() {
        return nodalOfficerDesignation;
    }

    public void setNodalOfficerDesignation(String nodalOfficerDesignation) {
        this.nodalOfficerDesignation = nodalOfficerDesignation;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}



