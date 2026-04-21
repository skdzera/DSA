class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        if(n==1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }
        
        while(start<=end){
            mid = start + (end-start)/2;

            if((mid%2==0 && nums[mid]==nums[mid-1])|| (mid%2 !=0 && nums[mid]==nums[mid+1])){
                end = mid - 1;

            }
            else if((nums[mid]!=nums[mid-1]) && (nums[mid]!=nums[mid+1])){
                return nums[mid];
            }
            else{
                start = mid+1;
            }

        }
        return -1;
        
    }
}
