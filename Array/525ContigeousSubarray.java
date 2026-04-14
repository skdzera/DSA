class Solution {
    public int findMaxLength(int[] nums) {
        
        int n = nums.length;
        int [] arr = new int[n];
       // replacing zeroes to -1's
        for(int i=0;i<n;i++){
           if(nums[i]==0){
            nums[i] = -1;
           }
        }
        // now problem is converted into longest subarray with sum zero
        // core logic is the store the prefix sum in the array and 
        // check when it becomes same again(means the that subarray sum is zero) and 
        // and store the length and update it with time
        int prefix_sum = 0;
        int max_length = 0;
        Map<Integer,Integer>ss = new HashMap<>();
        for(int i = 0;i<n;i++){
            int len = 0;
            prefix_sum = prefix_sum + nums[i];

            if(prefix_sum==0){
                max_length = i+1;
            }
            
            else if(ss.containsKey(prefix_sum)){
                len = i - ss.get(prefix_sum);
                max_length = Math.max(max_length,len);
            }
            else{
                // only one occurence of that sum should be entering in the map
            ss.put(prefix_sum,i);
            }
            
        }
        return max_length;
    }
}