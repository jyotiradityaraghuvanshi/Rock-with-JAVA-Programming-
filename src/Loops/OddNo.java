package Loops;
import java.util.Scanner;
public class OddNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // for(int i=1;i<=n;i+=2) System.out.println(i);
        // using break and continue statement
        for(int i=1;i<=n;i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }
    }
}
