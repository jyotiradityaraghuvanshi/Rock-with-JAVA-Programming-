package JavaInput;
import java.util.Scanner;
public class AddtwonU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.print("Enter first number: ");
        x = sc.nextInt();
        System.out.println("\n");
        System.out.print("Enter second number: ");
        y = sc.nextInt();
        int sum = x + y;
        System.out.println("\n The sum of two given no. is : " +sum);
    }
}
