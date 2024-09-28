package ConditionalStatement.multiplecondition.nestedIfelse;

import java.util.Scanner;

public class notdivisibleby15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.: ");
        int n = sc.nextInt();
        if(n%3==0 || n%5==0){
            if(n%15!=0){
                System.out.println("The no. is satisfying all the conditions.");
            }
            else{
                System.out.println("The no. is not satisfying all the conditions.");
            }
        }
        else{
            System.out.println("The no. is not satisfying all the conditions.");
        }
//        if((n%3==0 || n%5==0) && n%15!=0){   second method.
//            System.out.println("The no. is satisfying all the conditions.");
//        }
//        else{
//            System.out.println("The no. is not satisfying all the conditions.");
//        }
    }
}
