package Practice;

import java.io.*;
import java.util.*;

class Solution {
    public static void swap(String s){
        char a[] = s.toCharArray();
        int i=0,j=a.length-1;
        while(i<j){
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++; j--;
        }
    }
    public String reverseAlternateWords(String str) {
        // write code here
        String arr[] = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                swap(arr[i]);
                sb.append(arr[i]);
            }
            else sb.append(arr[i]);
            if(i<arr.length-1) sb.append(" ");
        }
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution Obj = new Solution();
        System.out.println(Obj.reverseAlternateWords(s));
    }
}
