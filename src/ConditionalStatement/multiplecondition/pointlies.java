package ConditionalStatement.multiplecondition;

import java.util.Scanner;

public class pointlies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        double y = sc.nextInt();
        if(x==0 && y==0){
            System.out.println("The point lies on origin.");
        }
        else if(x==0){
            System.out.println("The point lies on Y-axis.");
        }
        else if(y==0){
            System.out.println("The point lies on X-axis.");
        }
        else{
            System.out.println("The point is not on origin neither on any axis.");
        }
    }
}
