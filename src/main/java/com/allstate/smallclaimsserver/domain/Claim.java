package com.allstate.smallclaimsserver.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity

public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;

    private String surname;

    private String emailAddress;
    private String insuranceType;
    private String coverType;
    private Double  Amount;
    private String claimInfo;
    private String claimStatus;
    private Date ClaimDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public String getClaimInfo() {
        return claimInfo;
    }

    public void setClaimInfo(String claimInfo) {
        this.claimInfo = claimInfo;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    public Date getClaimDate() {
        return ClaimDate;
    }

    public void setClaimDate(Date claimDate) {
        ClaimDate = claimDate;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", insuranceType='" + insuranceType + '\'' +
                ", coverType='" + coverType + '\'' +
                ", Amount=" + Amount +
                ", claimInfo='" + claimInfo + '\'' +
                ", claimStatus='" + claimStatus + '\'' +
                ", ClaimDate=" + ClaimDate +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Claim)) return false;
        Claim claim = (Claim) o;
        return Objects.equals(getId(), claim.getId()) && Objects.equals(getFirstName(), claim.getFirstName()) && Objects.equals(getSurname(), claim.getSurname()) && Objects.equals(getEmailAddress(), claim.getEmailAddress()) && Objects.equals(getInsuranceType(), claim.getInsuranceType()) && Objects.equals(getCoverType(), claim.getCoverType()) && Objects.equals(getAmount(), claim.getAmount()) && Objects.equals(getClaimInfo(), claim.getClaimInfo()) && Objects.equals(getClaimStatus(), claim.getClaimStatus()) && Objects.equals(getClaimDate(), claim.getClaimDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getSurname(), getEmailAddress(), getInsuranceType(), getCoverType(), getAmount(), getClaimInfo(), getClaimStatus(), getClaimDate());
    }
}
