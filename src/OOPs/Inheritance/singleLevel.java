package OOPs.Inheritance;

import java.util.concurrent.Callable;

class Car{ // Parent class /OR/ Base class /OR/ Super class.
    int gear;
    int wheels;
    String engine;
}
// This class inherited by its parent class and this inheritance has only 1parent and 1child it is Single-Level Inheritance.
class Flying_car extends Car{  // Child class /OR/ SubClass.
    String wings;
}
public class singleLevel {
    public static void main(String[] args) {
        Flying_car obj = new Flying_car();
        obj.gear = 7;
        obj.wheels = 8;
        obj.engine = "Canvas";
        obj.wings = "Narrow Headed";
        System.out.print("The child class car has : ");
        System.out.println(obj.gear + " gear " + obj.wheels + " wheels " + obj.engine + " engine " + obj.wings + " wings.");

        Car obj2 = new Car();
        obj2.gear = 5;
        obj2.wheels = 4;
        obj2.engine = "Normal";
        System.out.print("The Parent class car has : ");
        System.out.println(obj2.gear + " gear " + obj2.wheels + " wheels " + obj2.engine + " engine.");

    }
}
