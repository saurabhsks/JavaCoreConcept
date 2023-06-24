package com.company;

class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("and my name is "+name);
    }
//    public int getSalary(){
//        return salary;
//    }
}
public class Custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee saurabh=new Employee();//Instantiating a new employee
        Employee shivam=new Employee();
        //Setting Attributes
        saurabh.id=22;
        saurabh.name="Saurabh kumar singh";
        saurabh.salary=34;

        shivam.id=23;
        shivam.name="Shivam patel";
        shivam.salary=15;
        //Printing the Attributes
//        System.out.println(saurabh.id);
//        System.out.println(saurabh.name);
        saurabh.printDetails();
        shivam.printDetails();
//        int salary=saurabh.getSalary();
//        System.out.println(salary);
        System.out.println(saurabh.salary);

    }
}
