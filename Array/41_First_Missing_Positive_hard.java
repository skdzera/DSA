class Solution {
    public int firstMissingPositive(int[] nums) {
        /* */
        int n = nums.length;
        int maximum = Integer.MIN_VALUE;
        // question:- smallest positive number that is not preseent in nums array
        // observation 1: the smallest positive number can not be more than length of
        // nums array size + 1.
        // observation 2: if the element is missing it would be between 1 to n


        // brute force aproach would be storing all the elements in the hashset and 
        // serach in the hashset starting from element 1-n. if element is not 
        // present  in hashset return that number else return n+1(array is      
        // contineous 0,1,2,3,4 ...)
        

        // Cyclic sort I have used here. Ignored all the negative values and swapped  *         values and started the array from 1 where it missed it returned the element *          next to it
        int i=0;
        while(i<n){
            int sval = nums[i]-1;
            if(nums[i]>0 && nums[i]<=n && nums[i] != nums[sval]){
                int temp = nums[i];
                nums[i] = nums[sval];
                nums[sval]= temp;                               
            }
            else{
                i++;
            }

        }
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return n+1;





        }
    }
