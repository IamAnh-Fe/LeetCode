public class Window {
   public  static double window(int[] nums,  int k){
       int sum = 0;
       for(int i = 0; i < nums.length; i++){
           sum+= nums[i];
   }
       sum = sum / k;

       return sum;

}
    public static void main(String[] args) {

    int[] nums = {1,12,-5,-6,50,3};
   int k = 4;
   System.out.println(window(nums, k));
    }
}
