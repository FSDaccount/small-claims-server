package com.allstate.smallclaimsserver.service;


import com.allstate.smallclaimsserver.data.ClaimRepository;
import com.allstate.smallclaimsserver.domain.Claim;
import com.allstate.smallclaimsserver.exceptions.ClaimNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClaimServiceImpl implements ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    @Override
    public List<Claim> getAllClaims() {
        List<Claim> claims =claimRepository.findAll();
        System.out.println("There were " + claims.size() + " found");
        return claims;
    }

    @Override
    public Claim getById(Integer id) throws ClaimNotFoundException {
        Optional<Claim> optionalClaim = claimRepository.findById(id);
        if (optionalClaim.isPresent()) {
            return optionalClaim.get();
        }
        else {
            throw new ClaimNotFoundException("There is no payment with id " + id);
        }

    }



    @Override
    public List<Claim> getBySurname(String surname) {
        return claimRepository.findAllBySurname(surname);
    }
}
