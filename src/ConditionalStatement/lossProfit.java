package ConditionalStatement;
import java.util.Scanner;
public class lossProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price:");
        int cp = sc.nextInt();
        System.out.println("Enter selling price:");
        int sp = sc.nextInt();
        if(sp==cp){
            System.out.println("No loss No profit");
        }
        else if(sp>cp){
            System.out.print("We made a Profit of :");
            System.out.print(sp-cp);
        }
        else {
            System.out.print("We made a Loss of :");
            System.out.println(cp-sp);
        }
    }
}
