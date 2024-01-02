package com.springEdu.techcareer.assignment;


import com.springEdu.techcareer.assignment.car.FuelType;
import com.springEdu.techcareer.assignment.car.Hatchback;
import com.springEdu.techcareer.assignment.car.Sedan;
import com.springEdu.techcareer.assignment.car.Suv;
import com.springEdu.techcareer.assignment.customer.Company;
import com.springEdu.techcareer.assignment.customer.CustomerType;
import com.springEdu.techcareer.assignment.customer.Individual;

public class MainTest {
    public static void main(String[] args) {

        // Customer -> Individual & Company add
        Individual individualCustomer = new Individual("Java", "Spring", "java@spring.com"
                , "05555555555", "11111111111");
        Company companyCustomer = new Company("TechCarieer", "tech@carieer.com"
                , "02222222222", "99999999999");


        // Car -> SUV - HATCHBACK - SEDAN add
        Suv suvCar = new Suv("Mavi", FuelType.GASOLINE, 300
                , 3, 300, "Kompakt SUV");
        Hatchback hatchbackCar = new Hatchback("Beyaz", FuelType.DIESEL, 100,
                5, 200, true);
        Sedan sedanCar = new Sedan("Siyah", FuelType.LPG, 150,
                1, 350, true);

        // SUV - HATCHBACK - SEDAN (methods Daily and Month) rent money
        // *
        // !! IMPORTANT !! = Bu araçlar aylık ya da günlük kiralanabilir ancak SUV araçlar sadece günlük kiralanabilir.

        // calculateDailyRentalFee()
        double suvRentalFee = suvCar.calculateDailyRentalFee(15);
        double sedanRentalFee = sedanCar.calculateDailyRentalFee(12);
        double hatchbackRentalFee = hatchbackCar.calculateDailyRentalFee(7);

        System.out.println("For Daily Rental \n"
                + "SUV car fee : " + suvRentalFee + "\n"
                + "SEDAN car fee : " + +sedanRentalFee + "\n"
                + "HATCHBACK car fee : " + hatchbackRentalFee);

        // calculateMonthlyRentalFee()
        // double suvRentalFee1 = suvCar.calculateMonthlyRentalFee(1); // SUV Araçlar Aylık Kiralanamaz
        double sedanRentalFee1 = sedanCar.calculateMonthlyRentalFee(2);
        double hatchbackRentalFee1 = hatchbackCar.calculateMonthlyRentalFee(1);

        System.out.println("For Monthly Rental \n"
                + "SEDAN car fee : " + +sedanRentalFee1 + "\n"
                + "HATCHBACK car fee : " + hatchbackRentalFee1);


        // INDIVIDUAL CustomerType Control [ false - true - false]
        System.out.println("Individual Customer Type Controls : "
                + CustomerType.customerTypeControl(individualCustomer, suvCar) + "\t"
                + CustomerType.customerTypeControl(individualCustomer, hatchbackCar) + "\t"
                + CustomerType.customerTypeControl(individualCustomer, sedanCar));

        // COMPANY CustomerType Control [true - true - true]
        System.out.println("Company Customer Type Controls : "
                + CustomerType.customerTypeControl(companyCustomer, suvCar) + "\t"
                + CustomerType.customerTypeControl(companyCustomer, hatchbackCar) + "\t"
                + CustomerType.customerTypeControl(companyCustomer, suvCar));
    }
}
