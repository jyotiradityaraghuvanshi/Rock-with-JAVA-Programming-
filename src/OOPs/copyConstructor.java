package OOPs;

class Copy{
    int marks = 1000;
    String name = "time to die";
    int age = -1;
    // good practice
    Copy(){

    }
    Copy(int marks, String name, int age){
        this.marks = marks;
        this.name = name;
        this.age = age;
    }
    // Copy Constructor.
    Copy(Copy object){
        marks = object.marks;
        name = object.name;
        age = object.age;
    }

}
public class copyConstructor {
    public static void main(String[] args) {
        Copy obj1 = new Copy(100 , "AccioJob" , 20);
        System.out.println(obj1.marks + " " + obj1.name + " " + obj1.age);

        Copy obj2 = new Copy();
        System.out.println(obj2.marks + " " + obj2.name + " " + obj2.age);

        Copy obj3 = new Copy(obj1);
        System.out.println(obj3.marks + " " + obj3.name + " " + obj3.age);

    }
}
