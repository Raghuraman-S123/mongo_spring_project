package dev.Frow.Frow.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
public class Company implements Serializable {

    @Id
    private String Id;
    private String companyName;

    private Company(String companyName){
        this.companyName= companyName;
    }


    public Company() {
    }
}
