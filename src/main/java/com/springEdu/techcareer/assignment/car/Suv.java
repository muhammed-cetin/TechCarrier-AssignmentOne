package com.springEdu.techcareer.assignment.car;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
public class Suv extends Car {

    private String suvType;

    public Suv(String color, FuelType fuelType, long luggageCapacity, int age, double dailyRentalFee, String suvType) {
        super(color, fuelType, luggageCapacity, age, dailyRentalFee);
        this.suvType = suvType;
    }

    @Override
    public double calculateDailyRentalFee(int rentalDay) {
        double extraPayFee = this.extraPay();
        return (rentalDay * getDailyRentalFee()) + extraPayFee;
    }

    private double extraPay() {
        return 100 / (getDailyRentalFee() * 0.15);
    }
}
