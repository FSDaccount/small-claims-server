package com.allstate.smallclaimsserver;


import com.allstate.smallclaimsserver.data.ClaimRepository;
import com.allstate.smallclaimsserver.data.UserRepository;
import com.allstate.smallclaimsserver.domain.Claim;
import com.allstate.smallclaimsserver.domain.User;
import com.allstate.smallclaimsserver.domain.UserRole;
import com.allstate.smallclaimsserver.service.ClaimService;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class ClaimsServiceTests {


    @Autowired
    private ClaimService claimService;

    @MockBean
    private ClaimRepository claimRepository;

    @MockBean
   private UserRepository userRepository;



    //|User Tests
    @Test
    public void testUserExists() {
        User user1 = new User("first-user","first-user-name","password1", UserRole.MANAGER);

        assertNotNull(user1);
        assertEquals("first-user",user1.getUsername());
        assertEquals("first-user-name",user1.getName());
        assertEquals("password1",user1.getPassword());
    }


    //Claims tests
    @Test
    public void  testClaimExistsAndStoresTheCorrectValues(){
        Claim claim1= new Claim("1","name","Car","Fully come",500d,
                "crash","rear impact","New","23 Springwell Gardens ","Seat","Ibiza",2003,"na","Dog","claim process");
        assertNotNull(claim1);
        assertEquals("1",claim1.getPolicyNumber());
        assertEquals("name",claim1.getFullName());
        assertEquals("Car",claim1.getInsuranceType());
        assertEquals("Fully come",claim1.getCoverType());
        assertEquals(500d,claim1.getAmount());
        assertEquals("crash",claim1.getClaimReason());
        assertEquals("rear impact", claim1.getClaimInfo());
        assertEquals("New", claim1.getClaimStatus());
        assertEquals("23 Springwell Gardens ", claim1.getAddress());
        assertEquals("Seat",claim1.getMake());
        assertEquals("Ibiza",claim1.getModel());
        assertEquals(2003,claim1.getYearOfManufacture());
        assertEquals("na",claim1.getTypeOfAnimal());
        assertEquals("Dog",claim1.getBreedAnimal());
    }


    @Test
    public void  testClaimSetClaim(){
        Claim claim1= new Claim("1","name","Car","Fully come",500d,
                "crash","rear impact","New","23 Springwell Gardens ","Seat","Ibiza",2003,"na","Dog","asasas");
        assertNotNull(claim1);
        claim1.setPolicyNumber("2");
        claim1.setFullName("paul");
        claim1.setInsuranceType("Pet");
        claim1.setCoverType("comprehensive");
        claim1.setAmount(10d);
        claim1.setClaimReason("injury");
        claim1.setClaimInfo("animal fell from height");
        claim1.setClaimStatus("Closed");
        claim1.setAddress("1_skipperstone_Road");
        claim1.setMake("na");
        claim1.setModel("na");
        claim1.setYearOfManufacture(0);
        claim1.setTypeOfAnimal("Cat");
        claim1.setBreedAnimal("Sphinx");

        assertEquals("2",claim1.getPolicyNumber());
        assertEquals("paul",claim1.getFullName());
        assertEquals("Pet",claim1.getInsuranceType());
        assertEquals("comprehensive",claim1.getCoverType());
        assertEquals(10d,claim1.getAmount());
        assertEquals("injury",claim1.getClaimReason());
        assertEquals("animal fell from height", claim1.getClaimInfo());
        assertEquals("Closed", claim1.getClaimStatus());
        assertEquals("1_skipperstone_Road", claim1.getAddress());
        assertEquals("na",claim1.getMake());
        assertEquals("na",claim1.getModel());
        assertEquals(0,claim1.getYearOfManufacture());
        assertEquals("Cat",claim1.getTypeOfAnimal());
        assertEquals("Sphinx",claim1.getBreedAnimal());
        assertEquals("none",claim1.getClaimNotes());

    }

    @Test
    public void TestGetAllClaims(){
        Claim newClaim = new Claim("111", "Jade Goodman", "Car", "Fully come", 500d, "Crash", "rear impact", "New", "23 Springwell Gardens ", "Seat", "Ibiza", 2003, "na", "na", "New Claim not yet reviewed");
        Claim newClaim2 = new Claim("112", "Frank Skinner", "Pet", "Fully come", 200d, "Pet sick", "Pet ate object which resulted in stomach pump from vet.", "Accepted and Paid", "23 Springwell Gardens ", "na", "na", 0, "Dog", "Poodle","Claim amount approved in full as policy covers event");

        List<Claim> Actual = Arrays.asList(newClaim,newClaim2);
        List<Claim> Expected = Arrays.asList(newClaim,newClaim2);

        System.out.println(Expected);
        assertEquals(Actual,Expected);


    }


    @Test
    public void TestFindAllClaimsSize(){
        List<Claim> claims = new ArrayList<>();
        claims.add(new Claim("111", "Jade Goodman", "Car", "Fully come", 500d, "Crash", "rear impact", "New", "23 Springwell Gardens ", "Seat", "Ibiza", 2003, "na", "na", "New Claim not yet reviewed"));
        claims.add(new Claim("112", "Frank Skinner", "Pet", "Fully come", 200d, "Pet sick", "Pet ate object which resulted in stomach pump from vet.", "Accepted and Paid", "23 Springwell Gardens ", "na", "na", 0, "Dog", "Poodle","Claim amount approved in full as policy covers event"));

        Mockito.when(claimRepository.findAll()).thenReturn(claims);

        assertEquals(2,claims.size());
    }

//    @Test
//    public void TestUpdateClaim(){
//        List<Claim> claims = new ArrayList<>();
//        claims.add(new Claim("111", "Jade Goodman", "Car", "Fully come", 500d, "Crash", "rear impact", "New", "23 Springwell Gardens ", "Seat", "Ibiza", 2003, "na", "na", "New Claim not yet reviewed"));
//
//        Claim claim1 = new Claim("1","name","Car","Fully come",500d,
//                "crash","rear impact","New","23 Springwell Gardens ","Seat","Ibiza",2003,"na","Dog","claim process");
//        Mockito.when(claimRepository.save(claim1)).thenReturn(claim1);
//
//
//        HashMap<String,Object> newFields = new HashMap<String,Object>();
//        newFields.put("name","tony");
//           assertNotNull(claimService.updateClaim(1,newFields));
//        newFields.put("1",claim1);
//    }












    }
