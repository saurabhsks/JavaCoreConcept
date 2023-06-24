package com.company;
class Base{
    public int x;
    public int getX(){
        return x;
    }

    public void setX(int x){
        System.out.println("I am in base and setting X now");
        this.x=x;
    }

}
class Derived extends Base{
    public int y;
    public int getY(){
        return y;
    }

    public void setY(int y){
        System.out.println("I am in derived and setting Y now");
        this.y=y;

    }
}
public class J_45_Inheritance {
    public static void main(String[] args) {
        Base b=new Base();
        b.setX(44);
        System.out.println( b.getX());

       //Accessing base class from derived class
        Derived d=new Derived();
        d.setX(33);
        System.out.println(d.getX());

        // Creating an object of derived class
      //  Derived d = new Derived();
        d.setY(43);
        System.out.println(d.getY());
    }
}
