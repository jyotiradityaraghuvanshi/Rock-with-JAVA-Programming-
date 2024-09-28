package OOPs.Abstraction;

public class LearnAnonymousClass {
    public static void main(String[] args) {
        OuterClass obj = new OuterClass(){  // This is an anonymous class where obj is an object of anonymous class object.
            @Override
            public void outermethod(){
                System.out.println("Child anonymous class is called and obj is child class object");
            }
        }; // This anonymous class can be used only one time i.e. we cannot make another object for this anonymous class.

        obj.outermethod();
        obj.getClass();

        OuterInter obj2 = new OuterInter() { // It seems like it is an interface object but that can't possible this is child class object.
            @Override
            public void vegetable() {
                System.out.println("Interface method is now having its body");
                System.out.println("This method has bunch of vegetables");
            }
        };
    }

}

class OuterClass{

    public void outermethod(){
        System.out.println("Parent class is called");
    }
}

interface OuterInter{
    void vegetable();
}