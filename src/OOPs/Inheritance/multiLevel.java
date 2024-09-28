package OOPs.Inheritance;

// This is a Multi-Level Inheritance.
class CAR{  // Here this is a Prent class which is inherits by two of child classes.
    int gear;
    int wheels;
    String engine;
}
class FlyingCar extends CAR{ // this is a child class and a subParent class for the sub-child class.
    String wings;
}
class FlyingHydroCar extends FlyingCar{  // this is a sub-child class of subParent class
    String pedal;
}
public class multiLevel {
    public static void main(String[] args) {
        FlyingCar obj = new FlyingCar();
        obj.gear = 7;
        obj.wheels = 8;
        obj.engine = "Canvas";
        obj.wings = "Narrow Headed";
        System.out.print("The Flying car has : ");
        System.out.println(obj.gear + " gear " + obj.wheels + " wheels " + obj.engine + " engine " + obj.wings + " wings.");

        CAR obj2 = new CAR();
        obj2.gear = 5;
        obj2.wheels = 4;
        obj2.engine = "Normal";
        System.out.print("The car has : ");
        System.out.println(obj2.gear + " gear " + obj2.wheels + " wheels " + obj2.engine + " engine.");

        FlyingHydroCar obj3 = new FlyingHydroCar();
        obj3.gear = 12;
        obj3.wheels = 5;
        obj3.engine = "Hydraulic";
        obj3.wings = "Spiky";
        obj3.pedal = "Induce";
        System.out.print("The Flying Hydro car has : ");
        System.out.println(obj3.gear + " gear " + obj3.wheels + " wheels " + obj3.engine + " engine " + obj3.wings + " wings " + obj3.pedal + " pedals.");

    }
}
