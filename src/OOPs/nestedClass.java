package OOPs;

 // This is a nested class class inside a class.
public class nestedClass {
     static class Nested{   /* this clas is inside a another class as we know while object creation the static context cannot
      be called by non-static class as it is a nested class. */
        int marks;
        String name;
        int age;
        Nested(int marks, String name ,  int age){
            this.marks = marks;
            this.name = name;
            this.age = age;
        }
        void study(String sub){
            System.out.println(name + " studies " + sub);
        }
    }
    public static void main(String[] args) {
        Nested obj1 = new Nested(100 , "Yash" , 20);
        System.out.println(obj1.marks + " " + obj1.name + " " + obj1.age );
        obj1.study("OOPs");
    }
}
