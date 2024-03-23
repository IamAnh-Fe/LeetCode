package _152_Maximum_Product_Subarray;

public class Solution {
    public  static int BruteForce(int[] nums){
        int result = nums[0];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int mul = nums[i];
            for (int j = i + 1; j < n; j++) {
             result = Math.max(result,mul);
             mul *= nums[j];
            }
           result = Math.max(result,mul);
        }
        return  result;
    }
    //--------------------------------------------------------

   public  static  int travelsal(int[] nums){
        int ans = Integer.MIN_VALUE;
        int mul = 1;
       int n = nums.length;
        for(int i = 0; i < n; i++) {
           mul *= nums[i];
           ans = Math.max(mul,ans);
           if(nums[i] == 0){
               mul = 1;
           }
       }
         mul = 1;
       for (int i = n - 1; i >= 0; i--) {
           mul *= nums[i];
           ans = Math.max(ans, mul);
           if (nums[i] == 0) {
               mul = 1;
           }
       }
        return  ans;
   }
   //---------------------------------------------------
    public static int Kadane(int[] nums){
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int temp = Math.max(Math.max(nums[i], nums[i]* max), nums[i]*min);
            min = Math.min(Math.min(nums[i],nums[i] * max), nums[i]*min);
            max = temp;
            System.out.println(min);
            ans = Math.max(max,ans);
        }
        return  ans;
    }

         public static  void main (String[] args){
        int[] nums = {-2, 3 ,-4 };
        System.out.println(BruteForce(nums));
        System.out.println(travelsal(nums));
        System.out.println(Kadane(nums));

    }
}
