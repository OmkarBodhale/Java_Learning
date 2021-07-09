package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int arr[] ={1,2,5,10,3,20} ;
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        Arrays.sort(arr);
//        System.out.println("*******************");
//        for(int j =0;j<arr.length;j++){
//            System.out.println(arr[j]);
//        }
        for(int rep=0;rep<(arr.length-1);rep=rep+1){
            if(arr[rep]==arr[rep+1]){
                System.out.println(arr[rep]);
                break;
            }
        }
    }
}