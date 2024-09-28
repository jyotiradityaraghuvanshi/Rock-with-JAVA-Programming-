package JavaInput;

import java.util.Scanner;

public class modulo {
    public static void main(String[] args) {


                Scanner sc = new Scanner(System.in);
                int a, b;
                System.out.println("Enter dividend: ");
                a = sc.nextInt();
                System.out.println("Enter divisor: ");
                b = sc.nextInt();
                int r = a%b;
        System.out.println(r);
    }
}
