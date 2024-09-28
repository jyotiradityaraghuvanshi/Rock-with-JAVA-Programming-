package OOPs;
class Students{ // A new class has been formed inside a package.
    int marks;
    String name;
    int rollno;
}
public class introClass {
    public static void main(String[] args) {
        // obj is reference variable , where new has created a new object to access class.
        Students obj = new Students();
        obj.marks = 90;
        obj.name = "Jyotiraditya Raghuvanshi";
        obj.rollno = 21;
        System.out.println(obj.marks + " " + obj.name + " " + obj.rollno);
    }
}
