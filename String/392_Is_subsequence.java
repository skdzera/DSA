class Solution {
    public boolean isSubsequence(String s, String t){
             int i = 0; // pointer for s
        int j = 0; // pointer for t

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; // move s pointer when match found
            }
            j++; // always move t pointer
        }

        return i == s.length();
        
    }
}