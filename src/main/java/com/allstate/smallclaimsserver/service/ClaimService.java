package com.allstate.smallclaimsserver.service;

import com.allstate.smallclaimsserver.domain.Claim;
import com.allstate.smallclaimsserver.exceptions.ClaimNotFoundException;

import java.util.List;

public interface ClaimService {

    public List<Claim> getAllClaims();
    public Claim getById(Integer id) throws ClaimNotFoundException;

    public List<Claim> getBySurname(String surname);
}
