package dev.Frow.Frow.Models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

public class AccountDTO {

    private String account_id;
    private String username;
    private String password;
    private String AccountType;
    private String email;
    private String Phone;
    private String Street;
    private String State;
    private String postal_code;
    private String country;
    private String first_name;
    private String last_name;
    private String gender;
    @DocumentReference
    private Company companyData;
    private String birth_date;
}
