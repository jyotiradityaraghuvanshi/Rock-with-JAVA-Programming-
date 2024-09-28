package OOPs;
class Methods{
    int marks;
    String name;
    int age;

    Methods(int marks, String name , int age){
        this.marks = marks;
        this.name = name;
        this.age = age;
    }
    // Note: we cannot call a non-static method from a static method ...  <-
    static void study(){
        System.out.println("Calling first static function/method");
        join("Static->static"); // calling from a static method to a static method.
    }
    void study(String s){
        System.out.println("Calling first non-static method");
        join("Non-static->static"); // calling from a non-static method to a static method.
        System.out.println("The call goes from " + s);
    }
    public static void join(String str){
        System.out.println("Calling second static method");
        System.out.println("The call goes from " + str);
    }
    public void coin(){
        System.out.println("Calling second non-static method");
        study("Non-static->non-static"); // calling from a non-static method to a non-static method.
    }
}
public class callingMethods {
    public static void main(String[] args) {
        Methods obj1 = new Methods(100 , "Yash" , 20);
        System.out.println(obj1.marks + " " + obj1.name + " " + obj1.age);
        System.out.println("Before calling Functions");
        Methods.study();
        obj1.coin();
        System.out.println("After calling Functions");


    }
}
