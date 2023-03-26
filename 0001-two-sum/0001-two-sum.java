class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] Array =new int[2];
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashmap.containsKey(target-nums[i])){
                Array[0]=hashmap.get(target-nums[i]);
                Array[1]=i;   
            }
            hashmap.put(nums[i],i);
        }
        return Array;
    }
}