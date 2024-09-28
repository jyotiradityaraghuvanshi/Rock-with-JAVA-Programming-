package OOPs.Inheritance;

// This is a Hierarchical Inheritance. In which one Parent class has 2 independence child class.
class Parent{  // this parent has 2 child class and they both inherit from this parent class
    int money = 1000;
    int house = 1;
    String acc_no = "random";
}
class Child1 extends Parent{ // this child property and behavior is not connected another child class.
    String job;
}
class Child2 extends Parent{  // this child property and behavior is not connected another child class.
    String jobs;
}
public class Hierarchical {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.money = 10000;
        obj.house = 2;
        obj.acc_no = "tus135";
        System.out.print("Parent has : ");
        System.out.println(obj.money + "$ " + obj.house + " houses and their account no. is->" + obj.acc_no);

        Child1 obj2 = new Child1();
        obj2.job = "Scientist";
        obj2.acc_no = "axis7568";
        System.out.print("1st Child has : ");
        System.out.println(obj2.money + "$ " + obj2.house + " house and has an account->" + obj2.acc_no + " and he is a " + obj2.job);


        Child2 obj3 = new Child2();
        obj3.jobs = "Developer";
        obj3.acc_no = "subI4578";
        System.out.print("2nd Child has : ");
        System.out.println(obj3.money + "$ " + obj3.house + " house and has an account->" + obj3.acc_no + " and he is a " + obj3.jobs);

    }
}
