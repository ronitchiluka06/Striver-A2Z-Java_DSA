//Print Factorial of N numbers using recusion

package Striver_A2Z.BasicRecursion;

import java.util.*;

public class RecursionP_7 {
    public static int sums(int i ){
        if(i==0){
            
            return 1;
        }
        
        return i * sums(i-1);
        
    }
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        
        System.out.println(sums(n));
    }
}
