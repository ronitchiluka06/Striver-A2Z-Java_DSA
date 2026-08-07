package BasicProblemsonArray;

import java.util.*;

public class SecLargestElem {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int largest = arr[0];
        int seclargest =-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest= arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>seclargest && arr[i] != largest){
                seclargest=arr[i];
            }
        }

        System.out.println(seclargest);

    }
}
