package com.allstate.smallclaimsserver.control;


import com.allstate.smallclaimsserver.domain.Claim;
import com.allstate.smallclaimsserver.exceptions.ClaimNotFoundException;
import com.allstate.smallclaimsserver.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/claim")
public class ClaimController {

    @Autowired
    private ClaimService claimService;

    @GetMapping
    public List<Claim> getAllPayments(@RequestParam(value="surname", required = false) String surname) {
        if (surname == null) {
            return claimService.getAllClaims();
        }
        else {
            return claimService.getBySurname(surname);
        }
    }

    @GetMapping("/{id}")
    public Claim findById(@PathVariable Integer id) throws ClaimNotFoundException {
        return claimService.getById(id);
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
