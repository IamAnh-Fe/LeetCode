package _15_3Sum;
import java.util.*;

public class Solution {
    public static List<List<Integer>> HashTable(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i - 1 >= 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] > 0) {
                    break;
                }
                if (j - 1 >= i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                Integer k = map.get(-nums[i] - nums[j]);
                if (k != null && k > j) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                }
            }
        }
        return res;
    }
        public static List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3){
          return new ArrayList<>();
        }
        List<List<Integer>> ans = new ArrayList<>(); 
        Arrays.sort(nums);
        for (int i = 0; i + 2 < nums.length; i++) {
          if(i > 0 && nums[i] == nums[i - 1]){
            continue;
          }
          int l = i + 1;
      int r = nums.length - 1;
      while (l < r) {
        final int sum = nums[i] + nums[l] + nums[r];
        if (sum == 0) {
          ans.add(Arrays.asList(nums[i], nums[l++], nums[r--]));
          while (l < r && nums[l] == nums[l - 1])
            ++l;
          while (l < r && nums[r] == nums[r + 1])
            --r;
        } else if (sum < 0) {
          ++l;
        } else {
          --r;
        }

      }
        }
        return ans;
  }
  public static void main(String[] args) {
    int[] nums = {-1,0,1,2,-1,-4};
    System.out.println(threeSum(nums));
    System.out.println(HashTable(nums));

  }
}
