package com.company;
import java.util.Scanner;
public class A01_UserInput {
    public static void main(String[] args) {
        Scanner userIP =new Scanner(System.in);
        System.out.println("Enter First number :");
        System.out.println(userIP.hasNextInt());   //To Check whether the next input is int or not
        int a = userIP.nextInt();
        System.out.println("Enter Second number :");
        System.out.println(userIP.hasNextInt());
        int b = userIP.nextInt();
        System.out.println("Sum of a & b is :"+ (a+b));

    }
}
