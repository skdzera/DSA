class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        /* my core logic here is i want to search the element in the rotated array
        Intution:- 1. i thought if middle element is equal to target i will return the index
                   2. when i got the middle element the either one or other side will be sorted so 
                        i will be seraching according in that arary side whether that 
                        element is present or not . i have set the condition according to that.
                    
                    3. if start element is less than than target and target is also less 
                    than mid  element i surely knew it would be present in 
                    left side array . else   right side  . vice versa for other side. 
        */

                        /* * Intuition:
    * 1. Use Binary Search: Even though the array is rotated, one half of the 
    * current search space [start...end] is always monotonically increasing.
    * 2. Identify Sorted Half: Determine if the left half or right half is sorted 
    * by comparing nums[start] with nums[mid].
    * 3. Narrow the Search: If the target lies within the boundaries of the 
    * sorted half, move the pointers to search there. Otherwise, search 
    * the opposite (unsorted/rotated) half.
    */

        while(start<=end){

            int mid = start + (end-start)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[start]<=nums[mid]){
                
                if(nums[start]<=target && target < nums[mid]){
                    end = mid-1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{

                if(target <= nums[end] && target > nums[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }


        }
        return -1;
    }
}
