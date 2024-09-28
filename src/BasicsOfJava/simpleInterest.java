package BasicsOfJava;

public class simpleInterest {
    public static void main(String[] args) {
        double principle = 1000;
        double rate = 8.76;
        double time = 2.5;
        double SI = (principle * rate * time) / 100;
        System.out.println("The simple interest is : " + SI);
    }
}
