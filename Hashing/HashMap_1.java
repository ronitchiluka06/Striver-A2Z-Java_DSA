// Frequency of each number using HashMap

package Striver_A2Z.Hashing;

import java.util.*;

public class HashMap_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        HashMap<Integer , Integer>mpp = new HashMap<>();

        for(int i=0;i<n;i++){
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0)+1);
        }

        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int number = sc.nextInt();
            System.out.println(mpp.getOrDefault(number, 0));
        }
    }
}
