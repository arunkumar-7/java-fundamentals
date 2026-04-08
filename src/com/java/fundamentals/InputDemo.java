package com.java.fundamentals;

import java.util.Scanner;

public class InputDemo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age :");
        byte age = sc.nextByte();
        System.out.println("Age:" + age);

        System.out.println("Enter Total Marks:");
        short totalMarks = sc.nextShort();
        System.out.println("Total Marks:" + totalMarks);

        System.out.println("Enter Salary:");
        int salary = sc.nextInt();
        System.out.println("Salary:" + salary);

        System.out.println("Enter Mobile Number:");
        long mobileNumber = sc.nextLong();
        System.out.println("Mobile Number:" + mobileNumber);

        System.out.println("Enter Discount percentage:");
        float discountPercentage = sc.nextFloat();
        System.out.println("Discount Percentage:" + discountPercentage);

        System.out.println("Enter Average Price of Product:");
        double averagePrice = sc.nextDouble();
        System.out.println("Average Price:" + averagePrice);

        System.out.println("Enter your Gender:");
        char gender = sc.next().charAt(0);
        System.out.println("Gender:" + gender);

        System.out.println("Is Stock Available: (true/false)");
        boolean isStockAvailable = sc.nextBoolean();
        System.out.println("Is Stock Available:" + isStockAvailable);
        sc.close();


    }
}
