class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i=0;
        int j=0;
        int sum=0;
        int mincount = Integer.MAX_VALUE;
        while(i<n){
            sum += nums[i];
            
            while(sum>=target){
                int count = i-j+1;
                mincount = Math.min(count, mincount);
                sum -= nums[j];
                j++;
            }
            i++;
            
        }
        return mincount == Integer.MAX_VALUE ? 0 : mincount ;
    }
}
