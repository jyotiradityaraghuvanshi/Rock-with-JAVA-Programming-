package OOPs;
class Using{
    int marks;
    String name;
    int age;
    final static String university = "AccioJob"; // during the use of final we must initialize the value.

}
public class usingFinal {
    public static void main(String[] args) {
        System.out.println(Using.university);
        Using obj1 = new Using();
        obj1.marks = 100;
        obj1.name = "Rare";
        obj1.age = 20;
        // obj1.university = "BASIS" now this cannot be happen because we use final in university which makes it immutable.
        System.out.println(obj1.marks + " " + obj1.name + " " + obj1.age + " " + obj1.university);

        Using obj2 = new Using();
        obj2.marks = 200;
        obj2.name = "Rares";
        obj2.age = 10;
        // obj1.university = "BASIS" now this cannot be happen because we use final in university which makes it immutable.
        System.out.println(obj2.marks + " " + obj2.name + " " + obj2.age + " " + obj2.university);
    }
}
