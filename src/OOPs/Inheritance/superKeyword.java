package OOPs.Inheritance;

class Car_super{
    int gear;
    int wheels;
    String engine;
    Car_super(){
        System.out.println("Calling Car super constructor.");
    }
}
class SportsCar extends Car_super{
    String engine;
    String nitro;
    SportsCar(String engine){
        super();   // calling SuperClass i.e. parent class
        System.out.println("Coming to sports car constructor.");
        super.engine = engine;  // giving the child class engine value
    }
}
public class superKeyword {
    public static void main(String[] args) {
        SportsCar obj = new SportsCar("Dual Engine");
        obj.gear = 6;
        obj.wheels = 4;
        obj.nitro = "Nitrous oxide";
        obj.engine = "FourX_engine";

        System.out.println("The Sports car has "+obj.gear+" gear "+obj.wheels+" wheels "+obj.nitro+" Nos in it "+obj.engine);
        

    }
}
