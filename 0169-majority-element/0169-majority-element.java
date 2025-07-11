class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majority = -1;
        int count = 0;
      Map<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<n;i++) {
        if(map.containsKey(nums[i])) {
            map.put(nums[i],map.get(nums[i])+1);
        }
        else {
            map.put(nums[i],1);
        }
    }
    for (int key : map.keySet()) {
    if (map.get(key) > n / 2) {
        return key;
    }
}

    return 0;
}
}