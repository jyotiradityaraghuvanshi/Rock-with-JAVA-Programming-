package OOPs;

class Practice{
    int marks;
    String name;
    int age;
    // Good practice to make a default constructor.
    Practice(){ // this is Function overloading with same name as Practice but difference in no. of parameters.
        System.out.println("object two is made from this default constructor.");
    } // we made this because when we make any constructor by ourselves java delete the default(implicitly) constructor.
    // Parameterised constructor.
    Practice(int marks){ // this is Function overloading with same name as Practice but difference in no. of parameters.
        this.marks = marks; // we use 'this' keyword as both parameter and variable name are same.
        name = "acciojob"; // here java use 'this' keyword implicitly by himself in the backend.
        this.age = 20;          // but we still can use this if we want.
        System.out.println("object one is made from this parameterised constructor.");
    }
}
public class constructorAll {
    public static void main(String[] args) {
        Practice obj = new Practice(100);
        System.out.println(obj.marks + " " + obj.name + " " + obj.age);

        Practice obj1 = new Practice();
        System.out.println(obj1.marks + " " + obj1.name + " " + obj1.age);
    }
}
