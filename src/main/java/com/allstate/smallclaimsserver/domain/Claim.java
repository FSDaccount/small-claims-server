package com.allstate.smallclaimsserver.domain;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

@Entity

public class Claim {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String policyNumber;
    private String fullName;
    private String insuranceType;
    private String coverType;
    private Double amount;

    private String claimReason;
    private String claimInfo;
    private String claimStatus;
    private LocalDate claimDate;

    //for house
    private String address;

    //for Vehicle
    private String make;

    private String model;

    private int yearOfManufacture;

    //for pet
    private String typeOfAnimal;

    private String breedAnimal;

    private String claimNotes;

    public Claim(String policyNumber, String fullName, String insuranceType, String coverType, Double amount, String claimReason, String claimInfo, String claimStatus, String address, String make, String model, int yearOfManufacture, String typeAnimal, String breedAnimal, String claimNotes) {
        this.id = id;
        this.policyNumber = policyNumber;
        this.fullName = fullName;
        this.insuranceType = insuranceType;
        this.coverType = coverType;
        this.amount = amount;
        this.claimReason = claimReason;
        this.claimInfo = claimInfo;
        this.claimStatus = claimStatus;
        this.claimDate = LocalDate.now();
        this.address = address;
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.typeOfAnimal = typeAnimal;
        this.breedAnimal = breedAnimal;
        this.claimNotes = claimNotes;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClaimNotes() {
        return claimNotes;
    }

    public void setClaimNotes(String claimNotes) {
        this.claimNotes = claimNotes;
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
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
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


    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }


    public Claim() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getClaimReason() {
        return claimReason;
    }

    public void setClaimReason(String claimReason) {
        this.claimReason = claimReason;
    }

    public LocalDate getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(LocalDate claimDate) {
        this.claimDate = claimDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeAnimal) {
        this.typeOfAnimal = typeAnimal;
    }

    public String getBreedAnimal() {
        return breedAnimal;
    }

    public void setBreedAnimal(String breedAnimal) {
        this.breedAnimal = breedAnimal;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "id=" + id +
                ", policyNumber=" + policyNumber +
                ", fullName='" + fullName + '\'' +
                ", insuranceType='" + insuranceType + '\'' +
                ", coverType='" + coverType + '\'' +
                ", Amount=" + amount +
                ", claimReason='" + claimReason + '\'' +
                ", claimInfo='" + claimInfo + '\'' +
                ", claimStatus='" + claimStatus + '\'' +
                ", claimDate=" + claimDate +
                ", address='" + address + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", typeAnimal='" + typeOfAnimal + '\'' +
                ", BreedAnimal='" + breedAnimal + '\'' +
                ", claimNotes='" + claimNotes + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Claim claim = (Claim) o;
        return yearOfManufacture == claim.yearOfManufacture && Objects.equals(id, claim.id) && Objects.equals(policyNumber, claim.policyNumber) && Objects.equals(fullName, claim.fullName) && Objects.equals(insuranceType, claim.insuranceType) && Objects.equals(coverType, claim.coverType) && Objects.equals(amount, claim.amount) && Objects.equals(claimReason, claim.claimReason) && Objects.equals(claimInfo, claim.claimInfo) && Objects.equals(claimStatus, claim.claimStatus) && Objects.equals(claimDate, claim.claimDate) && Objects.equals(address, claim.address) && Objects.equals(make, claim.make) && Objects.equals(model, claim.model) && Objects.equals(typeOfAnimal, claim.typeOfAnimal) && Objects.equals(breedAnimal, claim.breedAnimal) && Objects.equals(claimNotes,claim.claimNotes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, policyNumber, fullName, insuranceType, coverType, amount, claimReason, claimInfo, claimStatus, claimDate, address, make, model, yearOfManufacture, typeOfAnimal, breedAnimal, claimNotes);
    }
}




