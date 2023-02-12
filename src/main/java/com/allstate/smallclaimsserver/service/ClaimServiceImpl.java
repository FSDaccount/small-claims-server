package com.allstate.smallclaimsserver.service;


import com.allstate.smallclaimsserver.data.ClaimRepository;
import com.allstate.smallclaimsserver.domain.Claim;
import com.allstate.smallclaimsserver.exceptions.ClaimNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ClaimServiceImpl implements ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    @Override
    public Claim saveClaim(Claim claim) {
        System.out.println(claim);
        Claim savedClaim =  claimRepository.save(claim);
        System.out.println(savedClaim);
        return savedClaim;
    }

    @Override
    public List<Claim> getAllClaims() {
        List<Claim> claims = claimRepository.findAll();
        System.out.println("There were " + claims.size() + " found");
        return claims;
    }

    @Override
    public Claim getById(Integer id) throws ClaimNotFoundException {
        Optional<Claim> optionalClaim = claimRepository.findById(id);
        if (optionalClaim.isPresent()) {
            return optionalClaim.get();
        } else {
            throw new ClaimNotFoundException("There is no payment with id " + id);
        }

    }

    @Override
    public Claim updateClaim(Integer id, HashMap<String, Object> fields){

        Claim claim = claimRepository.findById(id).get(); //should really check it is there + throw an exception
        if (fields.containsKey("policyNumber")) {
            claim.setPolicyNumber(fields.get("policyNumber").toString());
        }

        if (fields.containsKey("fullName")) {
            claim.setFullName(fields.get("fullName").toString());
        }

        if (fields.containsKey("insuranceType")) {
            claim.setInsuranceType(fields.get("insuranceType").toString());
        }
        if (fields.containsKey("coverType")) {
            claim.setFullName(fields.get("coverType").toString());
        }

        if (fields.containsKey("amount")) {
            claim.setAmount(Double.parseDouble(fields.get("amount").toString()));
        }
        //update those fields that have changed
        if (fields.containsKey("claimReason")) {
            claim.setClaimReason(fields.get("claimReason").toString());
        }
        if (fields.containsKey("claimInfo")) {
            claim.setClaimInfo(fields.get("claimInfo").toString());
        }
        if (fields.containsKey("claimStatus")) {
            claim.setClaimStatus(fields.get("claimStatus").toString());
        }
        if (fields.containsKey("address")) {
            claim.setAddress(fields.get("address").toString());
        }
        if (fields.containsKey("make")) {
            claim.setMake(fields.get("make").toString());
        }
        if (fields.containsKey("model")) {
            claim.setModel(fields.get("model").toString());
        }
        if (fields.containsKey("yearOfManufacture")) {
            claim.setYearOfManufacture(Integer.parseInt(fields.get("yearOfManufacture").toString()));
        }
        if (fields.containsKey("typeOfAnimal")) {
            claim.setTypeOfAnimal(fields.get("typeOfAnimal").toString());
        }
        if (fields.containsKey("BreedAnimal")) {
            claim.setBreedAnimal(fields.get("BreedAnimal").toString());
        }
        if(fields.containsKey("claimNotes")){
            claim.setClaimNotes(fields.get("claimNotes").toString());
        }
        return claimRepository.save(claim);
    }
    

    @Override
    public List<Claim> searchClaim(String searchTerm) {
        return claimRepository.findByFullNameContainingIgnoreCaseOrPolicyNumberContainingIgnoreCase(searchTerm,searchTerm);
    }






    @Override
    public List<Claim> getByFullName(String fullName) {
        return claimRepository.findAllByFullName(fullName);
    }



}


