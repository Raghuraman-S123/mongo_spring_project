package dev.Frow.Frow.Controller;

import dev.Frow.Frow.Models.Account;
import dev.Frow.Frow.Models.AccountDTO;
import dev.Frow.Frow.Models.AuthenticationResponse;
import dev.Frow.Frow.Repository.UserRepository;
import dev.Frow.Frow.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/frow/signup")
public class SignupController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public ResponseEntity<?> creatingAccount(@RequestBody Account account){
        System.out.println(account);


       try{
           userRepository.save(account);
           //return ResponseEntity.ok( new AuthenticationResponse("Account created successfully "+account.getCompanyData()));
       }catch (Exception e){
           return ResponseEntity.ok( new AuthenticationResponse("Error creating account! "));
       }
        return ResponseEntity.ok( new AuthenticationResponse("Account created successfully "+account.getCompanyData()));

    }

}
