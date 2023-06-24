package com.company;
import java.util.Scanner;
public class Exercise_4 {
    public static void main(String[] args) {
        //Question 1
//        int a=10;
//        if(a==11){
//            System.out.println("I am 11");
//        }
//        else{
//            System.out.println("I am not 11");
//        }
        //Question 2
//         int m1,m2,m3;
//         Scanner sc=new Scanner(System.in);
//        System.out.println("Mathematics");
//        m1=sc.nextByte();
//        System.out.println("Physics");
//        m2=sc.nextByte();
//        System.out.println("Chemistry");
//        m3=sc.nextByte();
//        float avg=(m1+m2+m3)/3.0f;
//
//        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Pass");
//        }
//       else{
//            System.out.println("fail");
//        }
        //Question 3
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Number");
        }

    }
}
