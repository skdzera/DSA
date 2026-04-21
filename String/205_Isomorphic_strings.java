class Solution {
    public boolean isIsomorphic(String s, String t) {
        // observation1: for same key(char of s) values (char of t) can not be different.
        // observation2: after compling first code from obsvervation1 got to know 2 different 
        //  key can not point to same value.

        // in last submitted code contains value is O(n) so it will be O(n*n) so i have optimized it here
    if(s.length() != t.length()){
        return false;
    }
    else{
        HashMap<Character,Character> mapS = new HashMap<>();
         HashMap<Character,Character> mapT = new HashMap<>();

        for(int i=0;i<s.length();i++){
            Character c1 = s.charAt(i);
            Character c2 = t.charAt(i);

           if(mapS.containsKey(c1) && mapS.get(c1) != c2  ) {
            return false;
           }
           if(mapT.containsKey(c2) && mapT.get(c2)!= c1){
            return false;
           }
           mapS.put(c1,c2);
           mapT.put(c2,c1);
    }
    return true;
    }
}
}
