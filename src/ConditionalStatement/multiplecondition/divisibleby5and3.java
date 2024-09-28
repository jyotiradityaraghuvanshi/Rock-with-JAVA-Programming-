package ConditionalStatement.multiplecondition;
import java.util.Scanner;
public class divisibleby5and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(n%5==0 && n%3==0){
            System.out.println("The given number is divisible by 5 and 3.");
        }
        else {
            System.out.println("It is not divisible by 5 and 3.");}
    }
}
