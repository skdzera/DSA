class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        int n = stalls.length;
        Arrays.sort(stalls);
        int low = 0;
        int high = stalls[n-1] - stalls[0];
        int ans = 0;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(isPos(stalls, k , mid)){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
        
    }
    
    
    boolean isPos (int [] arr , int k , int distance){
        int cowcount = 1;
        int temp = arr[0];
        
        for(int i=1;i<arr.length;i++){
            
            if(arr[i] - temp >= distance){
                cowcount++;
                temp = arr[i];
            }
            
            if(cowcount>=k){
                return true;
            }
        }
        
        return false;
    }
}