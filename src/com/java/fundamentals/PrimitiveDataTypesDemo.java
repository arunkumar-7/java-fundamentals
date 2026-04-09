package com.java.fundamentals;

import java.util.Scanner;

public class PrimitiveDataTypesDemo {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Age: ");
        byte age = sc.nextByte();

        System.out.print("Year of Birth: ");
        short yearOfBirth = sc.nextShort();

        System.out.print("Enter Your Salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter Mobile Number: ");
        long mobileNumber = sc.nextLong();

        System.out.print("Enter Current Temperature: ");
        float temperature = sc.nextFloat();

        System.out.print("Enter Product Price: ");
        double productPrice = sc.nextDouble();

        System.out.print("Enter your Gender: ");
        char gender = sc.next().charAt(0);

        System.out.print("is User Active- Enter(true/false): ");
        boolean isActive = sc.nextBoolean();

        System.out.println("---User Profile-----");
        System.out.println("Age:" + age);
        System.out.println("Year of Birth:" + yearOfBirth);
        System.out.println("Salary:" + salary);
        System.out.println("Mobile Number:" + mobileNumber);
        System.out.println("Current Temperature:" + temperature);
        System.out.println("Product Price:" + productPrice);
        System.out.println("Gender:" + gender);
        System.out.println("Is User Active:" + isActive);

        sc.close();

    }
}
