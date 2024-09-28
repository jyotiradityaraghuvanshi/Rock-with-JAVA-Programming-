package ConditionalStatement;
import java.util.Scanner;
public class divisibleof5 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
     int n = sc.nextInt();
     if(n%5==0){
         System.out.println("The no. is divisible by 5.");
     }
     else{
         System.out.println("The no. is not divisible by 5.");
     }
    }
}
