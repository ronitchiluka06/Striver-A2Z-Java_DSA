package Striver_A2Z.Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMap_3 {
    public static class Solution {
    public int mostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int i=0; i<nums.length;i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i],0)+1);
        }

        int maxFreq =0;
        int ans = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> entry: mpp.entrySet()){
            int element = entry.getKey(); 
            int freq = entry.getValue();

            if(freq > maxFreq){
                maxFreq = freq;
                ans = element;
            }
            else if(freq == maxFreq && element<ans){
                ans = element;
            }
        }
        return ans;
    }
}



}
