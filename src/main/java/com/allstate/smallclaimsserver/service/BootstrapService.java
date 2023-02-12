package com.allstate.smallclaimsserver.service;

import com.allstate.smallclaimsserver.data.ClaimRepository;
import com.allstate.smallclaimsserver.data.UserRepository;
import com.allstate.smallclaimsserver.domain.Claim;
import com.allstate.smallclaimsserver.domain.User;
import com.allstate.smallclaimsserver.domain.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import javax.annotation.PostConstruct;

@Service
public class BootstrapService {
    
    @Autowired
    private ClaimRepository claimRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;
    @PostConstruct
    public void setupInitialData(){

        if(userRepository.count()==0){
            User user1 = new User("Paul","Paul","pass1", UserRole.MANAGER);
            User user2 = new User("sally","Sally","pass1", UserRole.USER);
            userService.save(user1);
            userService.save(user2);
        }
           Claim newClaim = new Claim("111", "Jade Goodman", "Car", "Fully come", 500d, "Crash", "Rear impact.", "New", "23 Springwell Gardens ", "Seat", "Ibiza", 2003, "na", "na", "New Claim not yet reviewed");
           Claim newClaim2 = new Claim("112", "Frank Skinner", "Pet", "Fully come", 200d, "Pet sick", "Pet ate object which resulted in stomach pump from vet.", "Accepted and Paid", "23 Springwell Gardens ", "na", "na", 0, "Dog", "Poodle","Claim amount approved in full as policy covers event");
           Claim newClaim3 = new Claim("113", "Elvis Presley", "Home", "Fully come", 500d, "Burglary", "Rear door broke into Ps5 stolen as well as clothes", "Accepted", "23 Springwell Gardens ", "na", "na", 0, "na", "Dog","Claim amount to be paid");
           Claim newClaim4 = new Claim("114", "Tommy Hoolohan", "Car", "Fully come", 250d, "Crash", "Front impact", "Open", "23 Church Avenue ", "Seat", "Ibiza", 2003, "na", "na", "Claim under review");
           Claim newClaim5 = new Claim("115", "Sylvester Satylone", "Car", "Fully come", 500d, "Crash", "Motorway crash damage to bumper and second vehicle.", "New", "23 fleetwood Street ", "Honda", "Civic", 2003, "na", "na", "Claim rejected due to incorrect details of crash.");
           Claim newClaim6 = new Claim("116", "Bart Simpson", "Car", "Fully come", 50d, "Crash", "Roof damage from dropped object.", "New", "23 fleetwood Street ", "Bmw", "M series", 2020, "na", "na", "Claim rejected due to incorrect details of crash.");
           Claim newClaim7 = new Claim("117", "Tony Montana", "Car", "Fully come", 500d, "Crash", "Bike Crash.", "New", "23 fleetwood Street ", "Honda", "Civic", 2018, "na", "na", "Claim rejected due to incorrect details of crash.");
           Claim newClaim8 = new Claim("118", "Arnold schwarzenegger", "Car", "Fully come", 500d, "Crash", "No indicators.", "Rejected", "23 fleetwood Street ", "Ford", "Focus", 2022, "na", "na", "Claim rejected due to incorrect details of crash.");
           Claim newClaim9 = new Claim("119", "Tyron Lannister", "Pet", "Fully come", 500d, "horse injured", "Horse injured in battle for kings landing.", "Rejected", "23 Kings landing ", "na", "na", 0, "Horse", "Friesian", "Claim rejected due to excess not being paid");
           Claim newClaim10 = new Claim("120", "Jergan Klopp", "Car", "Fully come", 500d, "Crash", "Crashed into parked bus.", "Rejected", "23 Bangor Road ", "Honda", "Civic", 2003, "na", "na", "Driver over limit when crash Happened.");

        if (claimRepository.count()  == 0) {
        claimRepository.save(newClaim);
        claimRepository.save(newClaim2);
        claimRepository.save(newClaim3);
        claimRepository.save(newClaim4);
        claimRepository.save(newClaim5);
        claimRepository.save(newClaim6);
        claimRepository.save(newClaim7);
        claimRepository.save(newClaim8);
        claimRepository.save(newClaim9);
        claimRepository.save(newClaim10);
        }

   }
}
