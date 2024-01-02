package com.springEdu.techcareer.assignment.car;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Sedan extends MonthlyRentalCar {

    private boolean isTwoDoor;

    public Sedan(String color, FuelType fuelType, long luggageCapacity, int age, double dailyRentalFee, boolean isTwoDoor) {
        super(color, fuelType, luggageCapacity, age, dailyRentalFee);
        this.isTwoDoor = isTwoDoor;
    }

    @Override
    public double calculateDailyRentalFee(int rentalDay) {
        if (isTwoDoor) {
            return (rentalDay * getDailyRentalFee()) + (rentalDay * 100);
        }
        return rentalDay * getDailyRentalFee();
    }

    @Override
    public double calculateMonthlyRentalFee(int rentalMonth) {
        return (rentalMonth * getMonthlyRentFee()) + (rentalMonth * 200);
    }
}
