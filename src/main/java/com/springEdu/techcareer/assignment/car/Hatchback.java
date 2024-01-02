package com.springEdu.techcareer.assignment.car;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hatchback extends MonthlyRentalCar {

    private boolean sportyModel;

    public Hatchback(String color, FuelType fuelType, long luggageCapacity, int age, double dailyRentalFee, boolean sportyModel) {
        super(color, fuelType, luggageCapacity, age, dailyRentalFee);
        this.sportyModel = sportyModel;
    }

    @Override
    public double calculateDailyRentalFee(int rentalDay) {
        if (sportyModel) {
            return (rentalDay * getDailyRentalFee()) + (rentalDay * 100);
        }
        return rentalDay * getDailyRentalFee();
    }

    @Override
    public double calculateMonthlyRentalFee(int rentalMonth) {
        return (rentalMonth * getMonthlyRentFee()) + (rentalMonth * 200);
    }
}
