package ConditionalStatement.multiplecondition;
import java.util.Scanner;
public class greatestofthem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no. ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd no. ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd no. ");
        int c = sc.nextInt();
        if(a<b){  // we can also use  if(a<b && b>c) else if(a>b && a>c) else c is greatest.
            if(b>c){
                System.out.println(b + " is greatest among three numbers.");
            }
            else{
                System.out.println(c + " is greatest among three numbers.");
            }
        }
        else if(a>c){
            System.out.println(a + " is greatest among three numbers.");
        }
        else{
            System.out.println(c + " is greatest among three numbers.");
        }

    }
}
