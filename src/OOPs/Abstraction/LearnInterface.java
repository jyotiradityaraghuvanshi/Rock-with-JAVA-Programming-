package OOPs.Abstraction;

public class LearnInterface {
    public static void main(String[] args) {
        //Animal obj = new Animal(); this cannot be made similar to abstract class

        Monkey obj = new Monkey();
        obj.drinks();
        obj.eat();
        obj.walk();
        obj.Plant();

        System.out.println(Animal.eyes);
        // Animal.eyes = 3; This cannot be done as it is final static
        System.out.println(Animal.eyes);
    }
}

interface Animal{

    public final static int leg = 4;
    int eyes = 2; // In interfaces data members are implicitly public and final static

    void drinks();   // in interfaces all the methods are public and abstract implicitly e.g-> public abstract void drinks()

    void eat();

    default void walk(){  // here this method is not public we explicitly make it as default
                                                    // So it is similar like regular class in abstract class
        System.out.println("Animal can walk");
    }
}

interface Herbivores {

    void Plant();
}

class Monkey implements Animal , Herbivores{  // Now this is multiple inheritance which is achieved using interfaces.
// this monkey class inherits from two parent interfaces which is multiple inheritance.
    @Override
    public void drinks() {
        System.out.println("Monkey is drinking");
    }

    @Override
    public void eat() {
        System.out.println("Monkey is eating");
    }

    @Override
    public void Plant() {
        System.out.println("Monkey is a plant eating animal");
    }
}

