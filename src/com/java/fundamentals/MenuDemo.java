package com.java.fundamentals;

import java.util.Scanner;

public class MenuDemo {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("Welcome To E-Commerce App");
        System.out.println("-------------------------");
        System.out.println("MENU");
        System.out.println("1.Customer");
        System.out.println("2.Order");
        System.out.println("3.Product");
        System.out.println("4.Payment");
        System.out.println("5.Exit");
        System.out.println("Enter Your Input (1-5):");
        int menuInput = sc.nextInt();
        switch (menuInput) {
            case 1:
                System.out.println("Welcome to customer Section");
                System.out.println("Enter Your Input (1-2):");
                System.out.println("1.SignUp");
                System.out.println("2.Login");
                int customerChoice = sc.nextInt();
                switch (customerChoice) {
                    case 1:
                        System.out.println("Customer Signup Successful");
                        break;
                    case 2:
                        System.out.println("Customer Login Successful");
                        break;
                }
                break;
            case 2:
                System.out.println("Welcome to Order Section");
                System.out.println("1.New Order");
                System.out.println("2.Existing Order");
                int orderChoice = sc.nextInt();
                switch (orderChoice) {
                    case 1:
                        System.out.println("New Order Placed successfully");
                        break;
                    case 2:
                        System.out.println("Existing Order Processed successfully");
                        break;
                }
                break;
            case 3:
                System.out.println("Welcome to Product Section");
                System.out.println("1.Add Product");
                System.out.println("2.Delete Product");
                int productChoice = sc.nextInt();
                switch (productChoice) {
                    case 1:
                        System.out.println("Product added successfully");
                        break;
                    case 2:
                        System.out.println("product deleted successfully");
                        break;
                }
                break;
            case 4:
                System.out.println("Welcome to Payment Section");
                System.out.println("1.Cash");
                System.out.println("2.Card");
                int paymentChoice = sc.nextInt();
                switch (paymentChoice) {
                    case 1:
                        System.out.println("Paid with cash");
                        break;
                    case 2:
                        System.out.println("Paid with Card");
                        break;
                }
                break;
            case 5:
                System.exit(0);


            default:
                System.out.println("Invalid Input");


        }


    }
}
