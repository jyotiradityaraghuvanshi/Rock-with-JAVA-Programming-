package OOPs;
class Method{
    int marks;
    String name;
    int age;
    final static String university = "AccioJob";  // class property

    Method(int marks, String name , int age){
        this.marks = marks;
        this.name = name;
        this.age = age;
    }
    // static calling static
    static void study(){ /* 'this' keyword cannot be used inside a static method of a class  and static method cannot
     call a non-static context or method. */
        System.out.println("The student studies in " + university + " university."); /* why we cannot use 'this' or any
         non-static variable in static method? because static is the first one to run in the class at that time no name
         variable is created that is why we cannot use variable and 'this'.*/
    }
    // non-static calling static and non-static calling non-static.
    void study(String subject){
        System.out.println("The student " + name + " in " + university + " university learns about " + subject);
    }
}
public class staticMethod {
    public static void main(String[] args) {

        Method obj1 = new Method(100 , "Yash" , 20);
        System.out.println(obj1.marks + " " + obj1.name + " " + obj1.age + " " + Method.university);
        obj1.study();
        obj1.study("DSA");  // non-static method is called only by creating an object.
        Method obj2 = new Method(200 , "Harsh" , 26);
        System.out.println(obj2.marks + " " + obj2.name + " " + obj2.age + " " + Method.university);
        Method.study();
        obj2.study("OOPs");

    }
}
