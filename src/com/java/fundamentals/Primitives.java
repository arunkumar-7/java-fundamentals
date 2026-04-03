package com.java.fundamentals;

public class Primitives {
    static void main() {
        //primitives
        //byte
        //stores 1 byte of memory
        //range : -128 to 127
        byte age;
        byte subject1Marks, subject2Marks, subject3Marks, subject4Marks, subject5Marks;
        age = 22;
        subject1Marks = 91;
        subject2Marks = 92;
        subject3Marks = 85;
        subject4Marks = 87;
        subject5Marks = 93;

        System.out.println("Age: " + age);
        System.out.println("subject 1 Marks :" + subject1Marks);
        System.out.println("subject 2 Marks :" + subject2Marks);
        System.out.println("subject 3 Marks :" + subject3Marks);
        System.out.println("subject 4 Marks :" + subject4Marks);
        System.out.println("subject 5 Marks :" + subject5Marks);
        System.out.println("-----------------------------------");
        System.out.println("subject 1 Marks : " + subject1Marks + ", subject 2 Marks :" + subject2Marks + ", subject 3 Marks:" + subject3Marks + ", subject 4 Marks : " +subject4Marks + ", subject 5 Marks :" + subject5Marks);


        short totalMarks = 350;
        System.out.println("Total Marks :" + totalMarks);

        System.out.println("--------------------------------");


        short manufacturingYear = 2022;
        short daysInExpiry = 200;

        System.out.println("Manufacturing year :" + manufacturingYear + ", Days in Expiry :" + daysInExpiry);

        /*
        salary
        roll numbers
        course fees
        price
         */
        int productPrice = 60000;
        int salary = 45000;
        int rollNumber = 100921;
        int courseFees = 40000;
        System.out.println("The price of product is " + productPrice);
        System.out.println("Salary per month is " + salary);
        System.out.println("Roll number is " + rollNumber);
        System.out.println("Course Fees is " + courseFees);

        System.out.println("-------------------");
        // long 8 bytes

        long mobileNumber = 9390591458L;
        long aadharNumber = 710279931595L;
        long bankAccountNumber = 990800360014125L;
        System.out.println("My Mobile Number :" + mobileNumber);
        System.out.println("My Aadhar Number :" + aadharNumber);
        System.out.println("My Bank Account Number :" + bankAccountNumber);


    }
}
