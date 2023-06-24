package com.company;
import java.util.Scanner;
public class Switch_Case {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner input=new Scanner(System.in);
       int  age=input.nextInt();

       switch(age){
           case 18:
               System.out.println("Adult");
               break;
           case 23:
               System.out.println("Get a job");
               break;
           case 28:
               System.out.println("Get Married");
               break;
           case 60:
               System.out.println("Retire");
               break;
           default:
               System.out.println("Enjoy your life");

       }
    }
}
