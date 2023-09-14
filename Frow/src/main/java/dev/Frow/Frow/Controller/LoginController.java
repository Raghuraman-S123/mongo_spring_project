package dev.Frow.Frow.Controller;

import dev.Frow.Frow.Models.Account;
import dev.Frow.Frow.Models.AuthenticationResponse;
import dev.Frow.Frow.Repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RestController
@RequestMapping("/frow/login")
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public ResponseEntity<?> login(@RequestBody Account account){

        boolean exists=userRepository.existsById(acccount.getId());

        

        try{
            if (exists && account.)
            {
                if(account.getAccountType()=="designer")
                {

                }
                else
                {
                    if(account.getAccountType()=="designer")
                }
            }
            //return ResponseEntity.ok( new AuthenticationResponse("Account created successfully "+account.getCompanyData()));
        }catch (Exception e){
            return ResponseEntity.ok( new AuthenticationResponse("Incorrect name or password));
        }
        return ResponseEntity.ok( new AuthenticationResponse("Account created successfully "+account.getCompanyData()));

    }

}