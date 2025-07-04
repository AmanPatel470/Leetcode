class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int longest = 0;
        int i;
        for(i=1;i<=n-2;i++) {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
                int j=i;
                int left = 1;
                int right = 0;
                while(j>0 && arr[j]>arr[j-1]) {
                    left++;
                    j--;
                }
                j=i;
                while(j<=n-2 && arr[j]>arr[j+1]) {
                    j++;
                    right++;
                }
                longest = Math.max(longest,(left+right));
            }
            
        }
        return longest;
    }
}