package Loops;
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for(int i=1;i<=n*10;i++){
//            int tab = n;
//            tab*=i;
//            System.out.println(tab);
//        }
        for(int i=n;i<=n*10;i+=n) System.out.println(i);
    }
}
