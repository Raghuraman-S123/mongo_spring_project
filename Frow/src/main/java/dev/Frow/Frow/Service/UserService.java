package dev.Frow.Frow.Service;

import dev.Frow.Frow.Repository.UserRepository;
import dev.Frow.Frow.Models.Account;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MongoTemplate mongoTemplate;

   public Optional<Account> singleUser(String id){
        return userRepository.findById(id);
    }


}
