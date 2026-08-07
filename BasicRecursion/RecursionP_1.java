//Print Name N times using recursion

package Striver_A2Z.BasicRecursion;

import java.util.*;

public class RecursionP_1 {

    public static void names(int i , int n , String name){
        if(i >n){
            return;
        }
        System.out.println(name);
        names(i+1 , n , name);
    } 
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int n = sc.nextInt();
        names(1, n ,name );
    }   
}
