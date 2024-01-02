package com.springEdu.techcareer.assignment.car;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class MonthlyRentalCar extends Car {

    private double monthlyRentFee;

    public MonthlyRentalCar(String color, FuelType fuelType, long luggageCapacity, int age, double dailyRentalFee) {
        super(color, fuelType, luggageCapacity, age, dailyRentalFee);
        this.monthlyRentFee = dailyRentalFee * 30;
    }

    public abstract double calculateMonthlyRentalFee(int rentalMonth);
}
