//Print 1 to N times using recursion (but using backtracking)

package Striver_A2Z.BasicRecursion;

import java.util.*;

public class RecursionP_4 {
    public static void nums(int i , int n){
        if(i<1){
            return;
        }
        
        nums(i-1,n);
        System.out.println(i);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        nums(n,n);
    }   
}
