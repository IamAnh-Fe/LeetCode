package _26_Remove_Duplicates_from_Sorted_Array;

import java.util.HashSet;

import java.util.Set;

public class Solution {
   public  static  int TwoPoiters(int[] nums){
       int n = nums.length;
       if(n == 0){
           return 0;
       }
       int i = 0;
       for (int j = 0; j < n; j++) {
           if(nums[i] != nums[j]){
               i++;
               nums[i] = nums[j];
           }
       }
       return  i + 1;

   }
   //-------------------------------------------------
    public static int Set(int[] nums){
       Set<Integer> set = new HashSet<>();
       int j = 0;
       for (int num : nums) {
            if(!set.contains(num)){

                nums[j++] = num;
                set.add(num);
            }

        }


        return  j;
    }

    public static void main(String[] args){
    int[] nums = {1,1,2};
    System.out.println(TwoPoiters(nums));
    System.out.println(Set(nums));
    }
}
