class Solution {

    void swap(int []arr, int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

    public void sortColors(int[] nums) {
        
        int n = nums.length;
        int start=0;
        int end= n-1;
        int i=0;

       
        // my intution - swap 0 to start and swap 2's to end and don't do anythign when 1
        // i couldn't think about [1 2 0] case. we don't increase i when we are shifting to 
        // end 
        
         // Dutch nation Flag Algorithm
        /**"I traverse with i and:
If I see 0 → swap with start, both start and i move right
If I see 2 → swap with end, only end moves left, i stays because the swapped element is unknown
If I see 1 → it's already in the right region, just move i forward" */


        while(i<n && i<=end){
            if(nums[i]==0){
                swap(nums,i,start);
                start++;
                i++;
            }
           else if(nums[i]==2){
                swap(nums,i,end);
                end--;
            }
            else{
                i++;
            }
            
        }
        

    }
}
