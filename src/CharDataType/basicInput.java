package CharDataType;
import java.util.Scanner;
public class basicInput {
    public static void main(String[] args) {
//        char ch = 'w';
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int x = (int)ch;
        System.out.println(x);
        char ch1 = 89;
        System.out.println(ch1);
        char ch2 = 'a';
        System.out.println(ch2);
    }
}
