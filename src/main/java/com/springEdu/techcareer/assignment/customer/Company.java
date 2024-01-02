package com.springEdu.techcareer.assignment.customer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Company extends Customer{
    private String companyName;
    private String companyEmail;
    private String companyPhoneNumber;
    private String companyTaxNumber;

    public Company(String companyName, String companyEmail, String companyPhoneNumber, String companyTaxNumber) {
        super(CustomerType.COMPANY);
        this.companyName = companyName;
        this.companyEmail = companyEmail;
        this.companyPhoneNumber = companyPhoneNumber;
        this.companyTaxNumber = companyTaxNumber;
    }
}
