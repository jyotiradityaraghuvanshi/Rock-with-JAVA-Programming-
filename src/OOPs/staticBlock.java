package OOPs;
class Block{
    int marks;
    String name;
    int age;
    static String university = "NIT";

    Block(int marks, String name , int age){
        this.marks = marks;
        this.name = name;
        this.age = age;
    }
    static {
        System.out.println("This is the static block which is the first one to run in the memory.");
        String university = "AccioJob";
        System.out.println(university);
    }
}
public class staticBlock {
    public static void main(String[] args) {
        System.out.println(Block.university);
        Block obj1 = new Block(100 , "J.S.R" , 20);
        obj1.university = "VIT";
        System.out.println(obj1.marks + " " + obj1.name + " " + obj1.age + " " + obj1.university);
    }
}
