// Frequency of each number in array using Hashing

package Striver_A2Z.Hashing;

import java.util.*;

public class Hashing_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int hash[]= new int[13];
        for(int i=0; i<n;i++){
            hash[arr[i]] +=1;
        }

        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int number= sc.nextInt();
            System.out.println(hash[number]);
        }
        
    }
}
