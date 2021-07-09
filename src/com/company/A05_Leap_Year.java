package com.company;
import java.util.Scanner;
import java.util.Random;
public class A05_Leap_Year {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter year from 21st Century to check Leap or not :");
//        int year=sc.nextInt();
//        if(year%4==0 && (year%4==0 && year%100!=0)(year%100==0 || year%400==0)){
//            System.out.println("This Year is a Leap Year : "+year);
//        }else {
//            System.out.println("This Year is not a Leap Year : "+ year);
//        }

//        Stone  Paper Sicssor game
        Scanner sc= new Scanner(System.in);
        Random rnd= new Random();
        int round = 0;   //Nos of rounds
        int usercount=0;
        int compcount=0;
        while (round<=2){
            System.out.println("Press 0 for Stone 1 for Paper & 2 for Sicssor :");
            int usersel =sc.nextInt();  //Userr

            int compsel = rnd.nextInt(3);
            System.out.println(compsel); //Computer input ramdomly selected from 0 to 2

            if (compsel<usersel){
                System.out.println("User Won");
                usercount=usercount+1;
            }else if(compsel>usersel){
                System.out.println("Computer Won");
                compcount++;
            }else if(compsel==usersel){
                System.out.println("Its a tie");
            }
            round++;
        }
        if (usercount>compcount){
            System.out.println("User Won the Round by "+ usercount);
        }else if (usercount<compcount) {
            System.out.println("Comp Won the Round by " + compcount);
        } else if (usercount==compcount){
            System.out.println("Its a Tie in both");
        }

    }

}
