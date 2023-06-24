package com.company;

class MyEmployee{
    private int id;
    private String name;
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
public class Access_Modifiers {
    public static void main(String[] args) {
          MyEmployee saurabh=new MyEmployee();
//          saurabh.id=45;
//          saurabh.name="Saurabh Kumar Singh"; -->throws an error due to private access modifiers
        saurabh.setName("Saurabh Kumar Singh");
        saurabh.setId(23);
        System.out.println(saurabh.getName());

    }
}
