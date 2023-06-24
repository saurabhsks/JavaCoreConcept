package com.company;

public class Arrays {
    public static void main(String[] args) {
        // 1. Declaration and memory allocation
        // int [] marks = new int[5];

        // 2. Declaration and then memory allocation
        // int [] marks;
        // marks = new int[5];
        // Initialization
        // marks[0] = 100;
        // marks[1] = 60;
        // marks[2] = 70;
        // marks[3] = 90;
        // marks[4] = 86;

        // 3. Declaration, memory allocation and initialization together
        int [] marks = {98, 45, 79, 99, 80};

        // marks[5] = 96; - throws an error
        System.out.println(marks[4]);

        //declaring an array
        int arr[]={1,2,3,3,4,5};
        //traversing the array with for-each loop
        for(int i:arr){
            System.out.println(i);
        }

        int [] marks1 = {98, 45, 79, 99, 80};
        System.out.println("Printing using for-each loop");
        for(int element: marks1){
            System.out.println(element);
        }
    }
}
