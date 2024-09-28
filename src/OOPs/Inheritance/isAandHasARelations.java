package OOPs.Inheritance;

class MusicPlayer{
    double radio;
}
class Is_Car{
    int gear;   // this is : Is A Relationship and Tightly coupled.
    int wheels;
    String engine;
    MusicPlayer car_player = new MusicPlayer();
    Is_Car(){
        System.out.println("Car constructor called.");
    }
}
class Has_FlyingCar extends Is_Car{   // this is  : Has A Relationship and loosely coupled.
    String wings;
    Has_FlyingCar(){
        System.out.println("Flying car constructor called.");
    }
}
class HydroCAr extends Is_Car{
    String pedals;
    HydroCAr(String pedals){
        System.out.println("Assigning the value of pedals.");
        this.pedals = pedals;
    }
}
public class isAandHasARelations {
    public static void main(String[] args) {
        Has_FlyingCar obj = new Has_FlyingCar();
        obj.gear = 5;               /* all this gear,wheels,engine can be directly access through so all these are
                                        strong Association(Composition). */
        obj.wheels = 6;
        obj.engine = "JET";
        obj.wings = "Metallic";
        obj.car_player.radio = 98.69;  // this is a loosely coupled relationship because we access through an object
                                       // so this is a weak Association(Aggregation)

        System.out.println(obj.gear + " " + obj.wheels + " " + obj.engine + " " + obj.wings + " " + obj.car_player.radio);

        HydroCAr obj2 = new HydroCAr("Hydraulic_pedals");
        obj2.gear = 3;
        obj2.wheels = 5;
        obj2.engine = "Water Pressure";
        //obj2.pedals = "Mechatronics";
        obj2.car_player.radio = 94.32;

        System.out.println(obj2.gear + " " + obj2.wheels + " " + obj2.engine + " " + obj2.pedals +" " +obj2.car_player.radio);

    }
}
