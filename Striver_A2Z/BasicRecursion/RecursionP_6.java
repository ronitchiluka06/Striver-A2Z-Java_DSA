//Print sum of N numbers using recusion

package Striver_A2Z.BasicRecursion;

import java.util.*;

public class RecursionP_6 {
    public static void sums(int i , int count){
        if(i<1){
            System.out.println(count);
            return;
        }
        
        sums(i-1,count+i );
        
    }
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int count =0;
        sums(n,0);
    }
}
