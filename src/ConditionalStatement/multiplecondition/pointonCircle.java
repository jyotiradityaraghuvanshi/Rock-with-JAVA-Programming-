package ConditionalStatement.multiplecondition;

import java.util.Scanner;

public class pointonCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        double y = sc.nextInt();
        int radius = sc.nextInt();
        double x1 = sc.nextInt();
        double y1 = sc.nextInt();
        double pd = ((x-x1)*(x-x1)) + ((y-y1)*(y-y1)); //* ((x-x1)*(x-x1)) + ((y-y1)*(y-y1)) );  // pd is points distance.
        if((pd*pd)>(radius*radius))
            System.out.println("The point lies outside the circle.");

        else if((pd*pd)<(radius*radius))
            System.out.println("The point lies inside the circle.");

        else
            System.out.println("The point lies on the circle.");

    }
}
