class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        // observation 1: window size is there that is k. we have to check the index 
        // difference for matching element and abs(i-j)<<k.

        int n = nums.length;
        int iter1 = 0;
        int iter2 = 0;
       HashMap <Integer,Integer> map = new HashMap <> ();
      
       for(int i=0;i<n;i++){
        if(map.containsKey(nums[i])){
            if(Math.abs(i-map.get(nums[i]))<=k){
                return true;
            }  
        } 
                map.put(nums[i],i);
        
       }

       return false;       
    }
}

// 2nd solution using sliding window


// Time Complexity : O(n)
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Base case...
        if(nums == null || nums.length < 2 || k == 0)
            return false;
        int i = 0;
        // Create a Hash Set for storing previous of k elements...
        HashSet<Integer> hset = new HashSet<Integer>();
        // Traverse for all elements of the given array in a for loop...
        for(int j = 0; j < nums.length; j++) {
            // If duplicate element is present at distance less than equal to k, return true...
            if(!hset.add(nums[j])){
                return true;
            }
            // If size of the Hash Set becomes greater than k...
            if(hset.size() > k){
                // Remove the last visited element from the set...
                hset.remove(nums[i++]);
            }
        }
        // If no duplicate element is found then return false...
        return false;
    }
}
