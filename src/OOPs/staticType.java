package OOPs;
class Type{
    int marks;
    String name;
    int age;
    static String university = "AccioJob";

    Type(int marks, String name , int age){
        this.marks = marks;
        this.name = name;
        this.age = age;
    }

    void study(String s){
        System.out.println(name + " studies " + s + " in " + university);
    }
}
public class staticType {
    public static void main(String[] args) {
        System.out.println(Type.university);
        Type obj = new Type(100,"Ash" , 20);
        obj.university = "GSPIIC";

        System.out.println(obj.marks + " " + obj.name + " " + obj.age + " " + Type.university);

        obj.study("OOPs");


        Type obj2 = new Type(200 , "Harsh" , 18);

        System.out.println(obj2.marks + " " + obj2.name + " " + obj2.age + " " + obj2.university);

        obj2.study("DSA");

    }
}
