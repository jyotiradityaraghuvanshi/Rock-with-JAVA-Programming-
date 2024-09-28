package OOPs.Encapsulation;
class Encapsulate{
    private int marks = 10;    /* now using private data members the only thing that public see is main object
     and output which make the marks and name to get access or updating them is only by programmer.*/
    private String name;
    int age;
    int get_marks(){   // getter always have a return type.
        return this.marks;
    }
    String get_Name(){
        return name;
    }
    void set_name(String name){  // setter don't have any return type except void
        this.name = name;
    }
    void set_marks(int marks){
        this.marks = marks;
    }

}
public class usingPrivate {
    public static void main(String[] args) {
        Encapsulate obj1 = new Encapsulate();
        System.out.println(obj1.get_marks() + " " + obj1.get_Name() + " " + obj1.age);
        obj1.set_marks(100);
        obj1.set_name("Yash Raghuvanshi");
        obj1.age = 20;
        System.out.println("After change in marks and name");
        System.out.println(obj1.get_marks() + " " + obj1.get_Name() + " " + obj1.age);
    }
}
