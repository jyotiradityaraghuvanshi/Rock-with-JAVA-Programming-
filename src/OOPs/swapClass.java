package OOPs;
class School{
    int marks;
    String name;
    int rollno;
    void study(String str){
        System.out.println(name + " studies " + str);
    }
}
public class swapClass {
    public static void swap1(School a,School b){
        School temp = a;  // This is a Shallow copy because of change in address.
        a = b;
        b = temp;

        System.out.println(a.marks + " " + a.rollno);
        System.out.println(b.marks + " " + b.rollno);
    }
    public static void swap2(School x, School y){
        School temp = new School();
        temp.marks = x.marks;
        temp.rollno = x.rollno;

        x = y;
        y = temp; // shallow copy because of change in address.
    }
    public static void swap3(School a, School b){
        School temp = a; // shallow copy because of change in address.
        a.marks = b.marks;
        a.rollno = b.rollno;

        b.marks = temp.marks;
        b.rollno = temp.rollno;

    }
    public static void swap4(School p, School q){
        School temp = new School();
        temp.marks = p.marks;
        temp.rollno = p.rollno;       // This is a DEEP COPY because of change in values.

        p.marks = q.marks;
        p.rollno = q.rollno;

        q.marks = temp.marks;
        q.rollno = temp.rollno;
    }
    public static void main(String[] args) {

        School Gulliver = new School();
        Gulliver.marks = 80;
        Gulliver.name = "gulliver";
        Gulliver.rollno = 5;

        School Roman = new School();
        Roman.marks = 90;
        Roman.name = "Roman Reigns";
        Roman.rollno = 17;

        System.out.println(Gulliver.marks + " " + Gulliver.rollno);
        Gulliver.study("DSA");
        System.out.println(Roman.marks + " " + Roman.rollno);
        Roman.study("OOPs");

        swap4(Gulliver,Roman);

        System.out.println(Gulliver.marks + " " + Gulliver.rollno);
        Gulliver.study("DSA");
        System.out.println(Roman.marks + " " + Roman.rollno);
        Roman.study("OOPs");
    }
}
