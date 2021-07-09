package com.company;
import java.util.Scanner;
public class A02_PercentageCalculation {
    public static void main(String[] args) {
//        System.out.println("Enter the respecstive Subjects marks");
//        Scanner percentage=new Scanner(System.in);
//        System.out.println("Enter Maths Marks out of 100 :");
//        float maths =percentage.nextInt();
//        System.out.println("Enter English Marks out of 100 :");
//        float english =percentage.nextInt();
//        System.out.println("Enter Hindi Marks out of 100 :");
//        float hindi =percentage.nextInt();
//        System.out.println("Enter Marathi Marks out of 100 :");
//        float marathi =percentage.nextInt();
//        System.out.println("Enter Science Marks out of 100 :");
//        float science =percentage.nextInt();
//        float total = maths+english+hindi+marathi+science;
//        System.out.println("Total Marks Obtained :"+ total);
//        float per=((total/(5*100))*100);
//        System.out.println(per);
//        System.out.println("Percentage obtained :"+per);
//
//

//        Kilometer to Miles Converion

        Scanner KmtoMile =new Scanner(System.in);
        float km;
        float mile;
        System.out.println("Press 1 if want to convert Km to Miles or else press 0 to convert Miles to Km");
//        if(KmtoMile.hasNextBoolean()==true){
        int sel=KmtoMile.nextInt();
        if(sel==1){
            System.out.println("Enter KM to convert into Miles :");
            km=KmtoMile.nextFloat();
            System.out.println("Total miles for "+km+" : "+(km*0.621));
        }else if (sel==0){
            System.out.println("Enter Miles to convert into KM :");
            mile=KmtoMile.nextFloat();
            System.out.println("Total miles for "+mile+" : "+(mile/0.621));
        } else {
            System.out.println("Try Again!!!");
        }
    }
}
