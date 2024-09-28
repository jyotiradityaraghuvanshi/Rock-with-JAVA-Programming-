package Loops;
import java.util.Scanner;
public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        for(int i=1;i<=n;i*=r){
            System.out.println(i + " ");
        }
    }
}
