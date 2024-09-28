package ConditionalStatement;
import java.util.Scanner;
public class areaperimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.println("Enter breadth: ");
        int b = sc.nextInt();
        int area = l*b;
        int perimeter = 2*(l+b);
        if(area>perimeter){
            System.out.println("The area is greater than perimeter.");
        }
        else if(area==perimeter){
            System.out.println("The area is equal to perimeter.");
        }
        else {
            System.out.println("The perimeter is greater than area.");
        }
    }
}
