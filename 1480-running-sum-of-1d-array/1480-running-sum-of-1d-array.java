class Solution {
    public int[] runningSum(int[] nums) {
        int[] output=new int[nums.length];
        int total=0;
        for (int i = 0; i<output.length; i++) {
            total+=nums[i];
            output[i]=total;
//            System.out.println(output[i]);
        }
        return output;
    }

}
class Main {
    public static void main(String[] args) {
       int[] nums = new int[] {1,2,3,4};
       Solution solution=new Solution();
       solution.runningSum(nums);

    }
 }
