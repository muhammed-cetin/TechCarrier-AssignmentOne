package com.springEdu.techcareer.assignment.customer;

import com.springEdu.techcareer.assignment.car.Car;
import com.springEdu.techcareer.assignment.car.Hatchback;

public enum CustomerType {
    INDIVIDUAL,
    COMPANY;


    /*
     * gelen customer eğer bireysel ise Hatchback araç kiralama durumunu kontrol ettik.
    */
    public static boolean customerTypeControl(Customer customer, Car car){
        if (customer.getCustomerType()==COMPANY){
            return true;
        }else{
            return onlyHatchbackRental(car);
        }
    }

    public static boolean onlyHatchbackRental(Car car){
        return car instanceof Hatchback; //  'car' nesnesi 'Hatchback' sınıfından türemişse return = true olacak.
    }
}

