class Solution {

    public Stack<Character> str_stack(String t){
         Stack<Character> tt = new Stack <> ();
          for(char y: t.toCharArray()){
            if(y != '#' ){
                tt.push(y);
            }
            else{
                if(!tt.empty()){
                    tt.pop();
                }
            }   
        }
        return tt;
    }
    
    

    public boolean backspaceCompare(String s, String t) {
         return str_stack(s).equals(str_stack(t));
    }
}
