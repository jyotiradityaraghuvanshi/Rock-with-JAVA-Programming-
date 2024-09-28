package ConditionalStatement.multiplecondition;

import java.util.Scanner;

public class straightline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextInt();double y1 = sc.nextInt();
        double x2 = sc.nextInt();double y2 = sc.nextInt();
        double x3 = sc.nextInt();double y3 = sc.nextInt();
        double m1 = (y2-y1)/(x2-x1);
        double m2 = (y3-y2)/(x3-x2);
        if(m1==m2){
            System.out.println("The points lie on the straight line.");
        }
        else{
            System.out.println("The points does not lie on the straight line.");
        }
    }
}
