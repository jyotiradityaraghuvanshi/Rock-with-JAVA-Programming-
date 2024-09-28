package ConditionalStatement.multiplecondition;
import java.util.Scanner;
public class threedigitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(n>99 && n<1000){
            System.out.println("The given number is a three digit number.");
        }
        else {
            System.out.println("It is not a three digit number.");}
    }
}
