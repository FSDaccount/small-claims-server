package com.allstate.smallclaimsserver.control;


import com.allstate.smallclaimsserver.domain.Claim;
import com.allstate.smallclaimsserver.exceptions.ClaimNotFoundException;
import com.allstate.smallclaimsserver.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/claim")
public class ClaimController {

    @Autowired
    private ClaimService claimService;

    @GetMapping
    public List<Claim> getAllClaims(@RequestParam(value="fullName", required = false) String fullName) {
        if (fullName == null) {
            return claimService.getAllClaims();
        }
        else {
            return claimService.getByFullName(fullName);
        }
    }

    @GetMapping("/{id}")
    public Claim findById(@PathVariable Integer id) throws ClaimNotFoundException {
        return claimService.getById(id);
    }


    @PostMapping
    public Claim saveNewClaim(@RequestBody Claim claim) {
        System.out.println(claim);
        System.out.println("running");
        return claimService.saveClaim(claim);
    }

    @PutMapping("/{id}")
    public Claim updateClaim(@PathVariable Integer id, @RequestBody HashMap<String, Object> fields) {
        return claimService.updateClaim(id, fields);
    }


    @GetMapping("/search")
    public List<Claim> searchClaims(@RequestParam(value="searchTerm", required = false) String searchTerm) {
        if (searchTerm == null) {
            return claimService.getAllClaims();
        }
        else {
            return claimService.searchClaim(searchTerm);
        }
    }

//    @GetMapping("/{paymentId}")
//    public Payment findById(@PathVariable("paymentId") Integer id) {
//        return paymentService.getById(id);
//    }

//    @GetMapping("/claims/insurancetype/{itype}/{status}")
//    public void doSomethingClever(@PathVariable String itype, @PathVariable("status") Integer status) {
//        System.out.println(itype);
//    }

}
