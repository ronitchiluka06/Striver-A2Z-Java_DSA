// check wether the string is palindrome or not using recursion

package Striver_A2Z.BasicRecursion;

import java.util.*;

public class Recursion_9 {

    public static boolean palindrome(String str, int left, int right){
        if(left >= right){
            return true;
        }

        if(str.charAt(left) != str.charAt(right)){
            return false;
        }

        return palindrome(str, left+1, right-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if(palindrome(str, 0, str.length()-1)){
            System.out.print("Palindrome");

        }
        else{
            System.out.print("NotPalindrome");
        }    
    }
}
