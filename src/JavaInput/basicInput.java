package JavaInput;
import java.util.Scanner;
public class basicInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius :");
        int r = sc.nextInt();
        double pi = 3.1415;
        double A = pi * r* r;
        System.out.println("The area of circle : " + A);
    }
}
