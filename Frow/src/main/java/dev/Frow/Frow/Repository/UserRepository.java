package dev.Frow.Frow.Repository;

import dev.Frow.Frow.Models.Account;
import dev.Frow.Frow.Models.Company;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<Account, String> {


}
