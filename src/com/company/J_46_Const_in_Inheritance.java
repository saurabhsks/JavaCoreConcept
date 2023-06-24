package com.company;

class Base1{
    public Base1(){
        System.out.println("I am a constructor from base");
    }
    public Base1(int x){
        System.out.println("I am a overloaded constructor from base with value of x as "+x);
    }
}

class Derived1 extends Base1{
    public Derived1(){
       // super(0);  use when you want to use argument wala constructor
        System.out.println("I am a derived class constructor");
    }
    public Derived1(int x,int y){
         super(x);  //use when you want to use argument wala constructor
        System.out.println("I am a overloaded derived class constructor with value of y as "+y);
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am a child of derived constructor with value of z as"+z);
    }
}
public class J_46_Const_in_Inheritance {
    public static void main(String[] args) {
   // Base1 b=new Base1();
        //Derived1 d=new Derived1();
       // Derived1 d=new Derived1(14,9);
     //   ChildOfDerived cd=new ChildOfDerived();
        ChildOfDerived cd=new ChildOfDerived(14,10,13);
    }
}
