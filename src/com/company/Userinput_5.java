package com.company;

import java.util.Scanner;

public class Userinput_5 {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc=new Scanner(System.in);

//        System.out.println("Enter num 1");
//       // int a=sc.nextInt();
//        float a=sc.nextFloat();
//        System.out.println("Enter num 2");
//       // int b=sc.nextInt();
//        float b=sc.nextFloat();
//       // int sum=a+b;
//        float sum=a+b;
//
//        System.out.println("The sum of these number is ");
//        System.out.println(sum);
      //  boolean b1=sc.hasNextInt();
       // System.out.println(b1); //will give true/false on the basis of input value
       // String str=sc.next(); //take only one word as an input
        String str=sc.nextLine();// take only one line as an input
        System.out.println(str);
    }
}
