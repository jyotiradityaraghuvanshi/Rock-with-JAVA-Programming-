package ConditionalStatement;
import java.util.Scanner;
public class absolutevalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int n = sc.nextInt();
        if(n<0){
            n = -1*n;
            System.out.println("The absolute value is " +n);
        }
        else {
            System.out.println("The absolute value is " +n);
        }
    }
}
