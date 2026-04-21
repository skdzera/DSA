class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet <Integer> set = new HashSet <>();
        
        for(int x: nums){
            set.add(x);
        }
        int i=0;
        int j=0;
        int maxseq =0;
        
        for(int temp: set){
    
        if(!set.contains(temp-1)){
               int cur_num = temp;
                int count=1;
            
            while(set.contains(cur_num+1)){
                count++;
                cur_num++;
            }
           maxseq = Math.max(maxseq,count); 
        }
            
           
            
        }
        return maxseq;
    }
}
