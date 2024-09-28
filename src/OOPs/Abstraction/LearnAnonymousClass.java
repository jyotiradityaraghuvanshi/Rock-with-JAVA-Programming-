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

        // we are creating a child class by extending above and implementing below using anonymous class.
        OuterInter obj2 = new OuterInter() { // It seems like it is an interface object but that can't possible this is child class object.
            @Override
            public void vegetable() {
                System.out.println("Interface method is now having its body");
                System.out.println("This method has bunch of vegetables");
            }
        };

        obj2.vegetable();   // This vegetable function can also be made using lambda expression.
        OuterInter obj3 =  () -> {
            System.out.println("Interface method is having its new body");
            System.out.println("This is achieved using lambda expression");
        };

        obj3.vegetable(); // Lambda expression can only be used if there is only single method in interface i.e. it is a FunctionalInterface.

        funcInter lambda = (x , y) -> { // this is lambda expression where we do not need to make anonymous class instead we just write a short code.
            System.out.println("Adding the values using lambda expression");
            return x + y;
        }  ;
        int val = lambda.adding(236283 , 37281486);
        System.out.println(val);

    }

}

@FunctionalInterface
interface funcInter{ // How can we achieve the calling of this method in functional interface ? using Lambda Expression.
    int adding(int x , int y);
}

class OuterClass{

    public void outermethod(){
        System.out.println("Parent class is called");
    }
}

@FunctionalInterface
interface OuterInter{  // This is a functional interface -> interfaces which have single method in it are called fun. interface
    void vegetable();
}