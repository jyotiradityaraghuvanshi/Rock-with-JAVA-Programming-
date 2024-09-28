package OOPs;
class Construct{
    int x;
    int y;
    // Default constructor Explicitly
    Construct(){
        System.out.println("Constructor before giving values");
        this.x = 10;
        this.y = 7;
        System.out.println("Constructor after giving values");
    }
    // Paramaterised constructor
    Construct(int marks, String name, int rollno){
        x = marks;
        y = rollno;
        System.out.println(name);
    }
}
public class introConstructor {
    public static void main(String[] args) {
        Construct obj1 = new Construct();
        System.out.println(obj1.x + " " + obj1.y);
          obj1.x = 5;
          obj1.y = 9;
        System.out.println(obj1.x + " " + obj1.y);
        Construct obj2 = new Construct();
        System.out.println(obj2.x + " " + obj2.y);
        obj2.x = 6;
        obj2.y = 8;
        System.out.println(obj2.x + " " + obj2.y);
        // obj3 jab bana toh usne Paramaterised constructor ka use kiya ise liye uske Default values change nahi hue
        Construct obj3 = new Construct(200, "acciojob", 21);
        System.out.println(obj3.x + " " + obj3.y);
    }
}
