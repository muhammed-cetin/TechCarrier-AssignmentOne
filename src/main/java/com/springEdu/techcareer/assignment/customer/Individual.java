package com.springEdu.techcareer.assignment.customer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Individual  extends Customer{

    private String name;
    private String surName;
    private String email;
    private String phoneNumber;
    private String identityNumber;

    public Individual(String name, String surName, String email, String phoneNumber, String identityNumber) {
        super(CustomerType.INDIVIDUAL);
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.identityNumber = identityNumber;
    }

}
