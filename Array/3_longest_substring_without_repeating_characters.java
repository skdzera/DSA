import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        char sarr[] = s.toCharArray(); 
        int maxcount = 0;
        int i=0;
        // in the first go i wrote this  logic below i got the right intution but there
        // is a one logic trap for abba when it comes at second b we are updating i=2
        // but when 2nd a comes we are moving i to backward(get(a)+1 = 0+1=1) that should 
        // not happen in sliding window

        // below i have updated my code 

        /**Map<Character, Integer> charMap = new HashMap<>();
        for (int j = 0; j < sarr.length; j++) {
            if(charMap.containsKey(sarr[j])){
                i= charMap.get(sarr[j])+1;
            }
          
                charMap.put(sarr[j],j);
            
            maxcount = Math.max(maxcount ,j-i+1);
          
        }        */


        Map<Character, Integer> charMap = new HashMap<>();
        for (int j = 0; j < sarr.length; j++) {
            if(charMap.containsKey(sarr[j])){
                i= Math.max(i,charMap.get(sarr[j])+1);
            }
          
                charMap.put(sarr[j],j);
            
            maxcount = Math.max(maxcount ,j-i+1);
          
        }       
        return maxcount;
    }
}
