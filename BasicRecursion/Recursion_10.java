// print fibonnaci of n'th number 

package Striver_A2Z.BasicRecursion;

import java.util.*;

public class Recursion_10 {
    public static int fibo(int n){
        if(n<=1){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}
