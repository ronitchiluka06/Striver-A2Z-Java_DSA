// Find Second Largest and Second Smallest 


package BasicProblemsonArray;


import java.util.*;

public class SecLargest_SmallestOptimal {
    public static void secondSmallest(int arr[], int n){
        int smallest = arr[0];
        int secsmall = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]< smallest){
                secsmall= smallest;
                smallest = arr[i];
            }
            else if (smallest < arr[i] && arr[i]< secsmall) {
                secsmall = arr[i];
            }

        }
        System.out.println(secsmall);
    }
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
                seclargest = largest;
                largest= arr[i];
            }
            else if (arr[i]< largest && arr[i]>seclargest) {
                seclargest=arr[i];
            }
        }

        secondSmallest(arr, n);

        System.out.println(seclargest);

    }
}
