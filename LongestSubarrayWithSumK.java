// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        int sum = 0;     
        int maxlen =0;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<n;i++){
            int len = 0;
            sum += arr[i];
           
            // now we have to check for the value
            //  Sum(curr) - Sum(prev) = k
            // sum(c) - k = sum(p)
            if(sum==k){
                maxlen = i+1;
            }
           if(map.containsKey(sum-k)){
                len = i - map.get(sum-k);
                maxlen = Math.max(maxlen,len);
            }
            // only inserting the unique sum 
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
    
             return maxlen;
        }
       
    }

