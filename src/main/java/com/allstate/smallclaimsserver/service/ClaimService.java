package com.allstate.smallclaimsserver.service;

import com.allstate.smallclaimsserver.domain.Claim;
import com.allstate.smallclaimsserver.exceptions.ClaimNotFoundException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ClaimService {

    public Claim saveClaim(Claim claim);


//    public Claim updateClaim(Integer id, Map<String, Object> fields);

    public List<Claim> getAllClaims();
    public Claim getById(Integer id) throws ClaimNotFoundException;

    public List<Claim> getByFullName(String fullName);

    Claim updateClaim(Integer id, HashMap<String, Object> fields);

    public List<Claim> searchClaim(String searchTerm);
}
