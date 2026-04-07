package com.java.fundamentals;

public class Operators {
    static void main() {
        byte no1 = 100;
        byte no2;
        no2 = no1;
        System.out.println(no2);

        int result = 10 + 20 - 30 * 40 / 50 % 60;
        System.out.println(result);

        int num1 = 10;
        int num2 = 3;
        int sum = num1 + num2 ;
        System.out.println(sum);
        int difference = num1 - num2;
        System.out.println(difference);
        int product = num1 * num2;
        System.out.println(product);
        System.out.println("----------------------");
        // Arithmetic Operators
        System.out.println("Arithmetic Operators");
        System.out.println("num1 + num2 =" + (num1 + num2));
        System.out.println("num1 - num2 =" + (num1 - num2));
        System.out.println("num1 * num2 =" + (num1 * num2));
        System.out.println("num1 / num2 =" + (num1 / num2));
        System.out.println("num1 % num2 =" + (num1 % num2));
    }
}
