package OOPs;
class Practical{
    int marks;
    String name;
    int age;
    /* this is function overloading with same name of both of the constructor(constructor are special functions) and
    * same no. of parameters but with satisfying the condition of Difference in order of parameters. */
    // int ,int, String
    Practical(int marks, int age, String name){
       this.marks = marks;
       this.name = name;
       this.age = age;
    }
    // int , String, int
    Practical(int marks, String name, int age){
        this.marks = marks;
        this.name = name;
        this.age = age;
    }
}
public class functionOverload {
    public static void main(String[] args) {
        Practical obj = new Practical(100 , "anything goes" , 20);
        System.out.println(obj.marks + " " + obj.name + " " + obj.age);
        Practical obj2 = new Practical(200 , 17 , "nothing goes");
        System.out.println(obj2.marks + " " + obj2.name + " " + obj2.age);
    }
}
