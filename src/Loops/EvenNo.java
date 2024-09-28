package Loops;
import java.util.Scanner;
public class EvenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for(int i=0;i<=n;i+=2){
//            System.out.println(i);
//        }
//        int i=1;
//        while(i<=n){
//           if(i%2==0) System.out.println(i);
//           i++;
//        } using continue statement
        for(int i=1;i<=n;i++) {
            if (i % 2 != 0) continue;
            System.out.println(i);
        }
    }
}
