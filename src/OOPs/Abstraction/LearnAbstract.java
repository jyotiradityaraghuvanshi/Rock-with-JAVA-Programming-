package OOPs.Abstraction;

public class LearnAbstract {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.accerlerate();
        obj.brakes(9);

        Car obj1 = obj;
        obj1.honk();
    }
}

abstract class Vehicle{
    abstract void accerlerate();  // in abstract class abstract methods body should not be there.

    abstract int brakes(int wheels);

    void honk(){
        System.out.println("Vehicle has a feature honk");
    }

}

class Car extends Vehicle {

    @Override
    void accerlerate() {
        System.out.println("Abstract accelerate method body implemented");
    }

    @Override
    int brakes(int wheels) {
        return wheels + 1;
    }

    @Override
    void honk(){
        System.out.println("Car has taken the honk feature from vehicle");
    }
}
