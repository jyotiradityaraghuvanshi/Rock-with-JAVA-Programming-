package Loops;
import java.util.Scanner;
public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();  // d = common differnce
        for(int i=1;i<=n;i+=d){
            System.out.print(i + " ");
        }
    }
}
