package com.springEdu.techcareer.assignment.car;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Car {

    private String color;
    private FuelType fuelType;
    private long luggageCapacity;
    private int age;
    private double dailyRentalFee;

    public abstract double calculateDailyRentalFee(int rentalDay);

}
