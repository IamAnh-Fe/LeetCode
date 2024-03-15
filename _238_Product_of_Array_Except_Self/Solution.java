package _238_Product_of_Array_Except_Self;

import java.util.Arrays;

public class Solution {
    public  static int[] BruteForce(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int proExclCurr = 1;

            for(int j = 0; j < n; j++) {
                if(i == j){
                    continue;
                }
             proExclCurr = proExclCurr * nums[j];
            }
            ans[i] = proExclCurr;
        }
        return ans;
    }

    public static int[] Deviding(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        int prod = 1;
        for(int num : nums){
            prod *= num;
        }
        for(int i = 0; i < n; i++) {
           ans[i] = prod / nums[i];
        }
        return ans;
    }

    public  static  int[] PreAndSuf1(int[] nums){
        int n = nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        prefix[0] = 1;
        suffix[n - 1] = 1;

        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
        for(int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        int ans[] = new int[n];
        for(int i = 0; i < n; i++) {
            ans[i] = prefix[i] * suffix[i];
        }
        return ans;
    }

    public  static  int[] PreAndSuf2(int[] nums){
        int n = nums.length;
        int[] right = new int[n];
        int[] res = new int[n];

        int prod = 1;
        for(int i=n-1; i>=0; i--) {
            prod *= nums[i];
            right[i] = prod;
        }

        prod = 1;
        for(int i=0; i<n-1; i++) {
            int lp = prod;
            int rp = right[i+1];

            res[i] = rp*lp;
            prod *= nums[i];
        }
        res[n-1] = prod;
        return res;
    }
    public  static  void  main(String[] args){
     int[] nums = {1,2,3,4};
     System.out.println(Arrays.toString(BruteForce(nums)));
     System.out.println(Arrays.toString(Deviding(nums)));
     System.out.println(Arrays.toString(PreAndSuf1(nums)));
     System.out.println(Arrays.toString(PreAndSuf2(nums)));

    }

}
