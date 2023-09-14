package dev.Frow.Frow.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.json.JsonObject;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.List;

@Document(collection="Accounts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account implements Serializable {

    @Id
    @Field(name = "_id")
    private ObjectId id;
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

    private Company companyData;
    private String birth_date;

}
