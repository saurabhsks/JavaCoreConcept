package com.company;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        float p;
        float tm;
        float score;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks  ");
        score=sc.nextFloat();
        System.out.println("Enter total marks ");
        tm=sc.nextFloat();
        p=((score/tm)*100);
        System.out.println("Percentage ::"+p);
    }
}
