package com.bezkoder.spring.jwt.mongodb.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.UUID;

@Document(collection = "documents")
public class JsonDocument {
    @Id
    private String id;

    @Field("document_id")
    @JsonProperty("document_id")
    private UUID documentId;

    @Field("client_id")
    @JsonProperty("client_id")
    private String clientId;

    @Field("client_secret")
    @JsonProperty("client_secret")
    private String clientSecret;

    @Field("created_on")
    @JsonProperty("created_on")
    private Date createdOn;

    @Field("expiry_on")
    @JsonProperty("expiry_on")
    private Date expiryOn;

    @Field("state_code")
    @JsonProperty("state_code")
    private String stateCode;

    @Field("state_name")
    @JsonProperty("state_name")
    private String stateName;

    @Field("department_code")
    @JsonProperty("department_code")
    private String departmentCode;

    @Field("department_name")
    @JsonProperty("department_name")
    private String departmentName;

    @Field("govt")
    @JsonProperty("govt")
    private String govt;

    @Field("nodal_officer_name")
    @JsonProperty("nodal_officer_name")
    private String nodalOfficerName;

    @Field("nodal_officer_mobile")
    @JsonProperty("nodal_officer_mobile")
    private String nodalOfficerMobile;

    @Field("nodal_officer_email")
    @JsonProperty("nodal_officer_email")
    private String nodalOfficerEmail;

    @Field("nodal_officer_designation")
    @JsonProperty("nodal_officer_designation")
    private String nodalOfficerDesignation;

    @Field("content")
    @JsonProperty("content")
    private String content;

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UUID getDocumentId() {
        return documentId;
    }

    public void setDocumentId(UUID documentId) {
        this.documentId = documentId;
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
