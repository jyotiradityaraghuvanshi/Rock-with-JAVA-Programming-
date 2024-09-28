package OOPs;
class Student{
    int marks;
    String university;
    int rollno;
    String name;
    void study(){
        System.out.println(name + " studies in " + university);
    }
}
public class introObject {
    public static void main(String[] args) {
        // creating an objects
        Student Wash = new Student();
        Wash.name = "ash";
        Wash.marks = 98;
        Wash.rollno = 21;
        Wash.university = "AccioJob";
        Student raghav = new Student();
        System.out.println(Wash.name + " " + Wash.marks + " " + Wash.rollno + " " + Wash.university);
        System.out.println(raghav.name + " " + raghav.marks + " " + raghav.rollno + " " + raghav.university);
        Wash.study();
        raghav.study();
    }
}
