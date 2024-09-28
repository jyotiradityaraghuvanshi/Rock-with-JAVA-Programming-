package JavaInput;
import java.util.Scanner;
public class Twointegersinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter dividend: ");
        a = sc.nextInt();
        System.out.println("Enter divisor: ");
        b = sc.nextInt();
        if(a>b){
            int Q = a/b;
            int R = a - (b*Q);
            System.out.println("The remainder is: " +R);
        }
        else{
            System.out.println("The given numbers does not match the question criteria.");
        }
    }
}
