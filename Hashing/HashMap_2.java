// frequency of characters in Sting using HasMap

package Striver_A2Z.Hashing;

import java.util.*;

public class HashMap_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        String str = sc.next();

        HashMap<Character , Integer> mpp = new HashMap<>();

        for(int i=0;i<str.length();i++){
            mpp.put(str.charAt(i), mpp.getOrDefault(str.charAt(i), 0)+1);
        }

        int q = sc.nextInt();

        for(int i=0 ;i<q;i++){
            String s = sc.next();
            System.out.println(mpp.getOrDefault(s.charAt(0), 0));
        }
    }
}
