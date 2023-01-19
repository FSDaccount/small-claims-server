package com.allstate.smallclaimsserver.service;

import com.allstate.smallclaimsserver.data.ClaimRepository;
import com.allstate.smallclaimsserver.domain.Claim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;



@Service
public class BootstrapService {
    
    @Autowired
    private ClaimRepository claimRepository;
    @PostConstruct
    public void setupInitialData(){
        Claim newClaim = new Claim(1, "firstName","surname", "example@email.com","Car","fully come",5000.00,"car crash","open");
        claimRepository.save(newClaim);
    }
}
