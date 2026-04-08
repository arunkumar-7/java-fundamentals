package com.java.fundamentals;

import java.util.Scanner;

public class PriceCalculator {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Price of Product:");
        int priceOfProduct = sc.nextInt();

        System.out.println("Enter Your Membership: (diamond('D') gold('G') silver('S') bronze('B')");
        char customerMembership = sc.next().charAt(0);

        System.out.println("Enter Your Age:");
        byte customerAge = sc.nextByte();

        double discountPercentage;
        double discountAmount;
        double priceAfterDiscount;
        double centralTax;
        double stateTax;
        double finalPrice;

        if (customerMembership == 'D')
            discountPercentage = 50;
        else if (customerMembership == 'G')
            discountPercentage = 20;
        else if (customerMembership == 'S')
            discountPercentage = 15;
        else if (customerMembership == 'B')
            discountPercentage = 10;
        else
            discountPercentage = 0;

        if (customerAge > 65)
            discountPercentage += 10;
        else if (customerAge >= 45 && customerAge <= 65)
            discountPercentage += 8;
        else if (customerAge >= 25 && customerAge <= 45)
            discountPercentage += 5;
        else
            discountPercentage += 0;

        discountAmount = priceOfProduct * discountPercentage/100;
        priceAfterDiscount = priceOfProduct - discountAmount;
        centralTax = priceAfterDiscount * 2.5 / 100;
        stateTax = priceAfterDiscount * 2.5 / 100;
        finalPrice = priceAfterDiscount + centralTax + stateTax;

        System.out.println("Product Price:" + priceOfProduct);
        System.out.println("Customer Membership:" + customerMembership);
        System.out.println("Customer Age:" + customerAge);
        System.out.println("Discount Amount:" + discountAmount);
        System.out.println("price After Discount:" + priceAfterDiscount);
        System.out.println("Central Tax:" + centralTax);
        System.out.println("State Tax:" + stateTax);
        System.out.println("Final Amount:" + finalPrice);

        sc.close();

    }
}
