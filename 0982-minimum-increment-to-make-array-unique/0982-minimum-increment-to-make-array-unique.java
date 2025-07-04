class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
       int n=nums.length;
       int count = 0;
       int i;
       for(i=1;i<n;i++) {
        if(nums[i-1]>=nums[i]) {
            count = count + nums[i-1]-nums[i]+1;
            nums[i] = nums[i-1]+1;
        }
       }
        return count;
    }
}