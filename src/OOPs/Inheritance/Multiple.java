package OOPs.Inheritance;
class Cars{
    int gear;
    int wheels;
    String engine;
}                                     // If we include the comment out class than this is a DIAMOND Problem in Inheritance
class Flying_Car extends Cars{         // or in Multiple Inheritance.
    String wings;
}
class Hydro_car extends Cars{
    String pedals;
}
//class Flying_HydroCar extends Flying_Car , Hydro_car{
//
//}
public class Multiple {
    public static void main(String[] args) {
        // Flying_HydroCar obj = new Flying_HydroCar();
        /* this is a multiple inheritance which is not possible in JAVA.
        *  In this type Inheritance a child class has Two Parent classes. */

    }
}
