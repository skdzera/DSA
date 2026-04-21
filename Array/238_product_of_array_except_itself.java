class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int product = 1;
        int count = 0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                product *=nums[i];
            }
            else{
               count++;
            }
        }
        
        for(int j=0;j<n;j++){
            if(count>1){
            nums[j]=0;
        }
            else if(nums[j]!=0 && count==0){
                int temp = nums[j];
                nums[j] = product/temp;
            }
            else if (nums[j]!=0 && count==1){
                nums[j]=0;  
            }
            else{
                nums[j] = product;
            }
        
        }

        return nums;
    }
}
