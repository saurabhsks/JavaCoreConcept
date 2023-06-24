package com.company;
class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id =44;
        name="Saurabh sks";
    }
//    public MyMainEmployee(String myName, int myId){
//        id = myId;
//        name = myName;
//    }
//    public MyMainEmployee(String myName){
//        id = 1;
//        name = myName;
//    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id=i;
    }
}
public class Constructors_40 {
    public static void main(String[] args) {
        MyMainEmployee saurabh=new MyMainEmployee();
//        saurabh.setName("Saurabh Kumar Singh"); //no need to do it due to constructor ,now we will make function
        // and work on it
//        System.out.println(saurabh.getName());
        System.out.println(saurabh.getId());
        System.out.println(saurabh.getName());
    }
}
