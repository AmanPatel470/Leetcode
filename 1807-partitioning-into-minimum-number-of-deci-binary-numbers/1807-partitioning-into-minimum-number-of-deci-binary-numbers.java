class Solution {
    public int minPartitions(String n) {
       int len = n.length();
       int i;
       int max = 0;
       for(i=0;i<=len-1;i++) {
        if(max<n.charAt(i)-48) {
            max = n.charAt(i)-48;
        }
       }
       return max;
    }
}