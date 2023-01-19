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
    private Integer policyNumber;
    private String fullName;
    private String insuranceType;
    private String coverType;
    private Double Amount;

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
    private String typeAnimal;

    private String BreedAnimal;

    public Claim(Integer id, Integer policyNumber, String fullName, String insuranceType, String coverType, Double amount, String claimReason, String claimInfo, String claimStatus, LocalDate claimDate, String address, String make, String model, int yearOfManufacture, String typeAnimal, String breedAnimal) {
        this.id = id;
        this.policyNumber = policyNumber;
        this.fullName = fullName;
        this.insuranceType = insuranceType;
        this.coverType = coverType;
        Amount = amount;
        this.claimReason = claimReason;
        this.claimInfo = claimInfo;
        this.claimStatus = claimStatus;
        this.claimDate = claimDate;
        this.address = address;
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.typeAnimal = typeAnimal;
        BreedAnimal = breedAnimal;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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


    public Integer getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(Integer policyNumber) {
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

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public String getBreedAnimal() {
        return BreedAnimal;
    }

    public void setBreedAnimal(String breedAnimal) {
        BreedAnimal = breedAnimal;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "id=" + id +
                ", policyNumber=" + policyNumber +
                ", fullName='" + fullName + '\'' +
                ", insuranceType='" + insuranceType + '\'' +
                ", coverType='" + coverType + '\'' +
                ", Amount=" + Amount +
                ", claimReason='" + claimReason + '\'' +
                ", claimInfo='" + claimInfo + '\'' +
                ", claimStatus='" + claimStatus + '\'' +
                ", claimDate=" + claimDate +
                ", address='" + address + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", typeAnimal='" + typeAnimal + '\'' +
                ", BreedAnimal='" + BreedAnimal + '\'' +
                '}';
    }
}




