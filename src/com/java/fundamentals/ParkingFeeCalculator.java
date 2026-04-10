package com.java.fundamentals;

import java.util.Scanner;

public class ParkingFeeCalculator {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Vehicle Type- Bike('B')/car('C') : ");
        char vehicleType = sc.next().charAt(0);

        System.out.print("Enter Number of Hours Parked: ");
        short hoursParked = sc.nextShort();

        byte baseCharge;
        int extraCharge = 0;
        int finalBill;
        int parkingFeeBeforeExtra;
        if (vehicleType == 'B')
            baseCharge = 10;
        else if (vehicleType == 'C')
                baseCharge = 20;
        else {
            System.out.println("Invalid Vehicle Type");
            return;
        }

        parkingFeeBeforeExtra = hoursParked * baseCharge;

        if (hoursParked > 5)
            extraCharge = 50;

        finalBill = parkingFeeBeforeExtra + extraCharge;

        System.out.println("Total Hours Parked:" + hoursParked);
        System.out.println("Vehicle Type:" + vehicleType);
        System.out.println("Extra Charge(If More than 5 hours):" +extraCharge);
        System.out.println("Final Parking Fee:" + finalBill);
        sc.close();
    }
}
