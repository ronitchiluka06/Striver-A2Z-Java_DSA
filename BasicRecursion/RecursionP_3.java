//Print N to 1 times using recursion

package Striver_A2Z.BasicRecursion;

import java.util.*;

public class RecursionP_3 {
    public static void nums(int i , int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        nums(i-1,n);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        nums(n,n);
    }   
}
