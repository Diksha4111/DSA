//gfg problem

class Solution {
    
    static int len(Stack<Integer> s,String S,int l){
        
        for(int i = 0 ; i< S.length() ; i++){
            if(i>=S.length()){
                return l;
            }
            if(s.isEmpty()){
                s.push(i);
            }
            if(S.charAt(i) == '('){
                s.push(i);
            }
            else{
                s.pop();
                if(! s.isEmpty()){
                    l = Math.max(l,i-s.peek());
                }
                else{
                    s.push(i);
                }
            }
        }
        return l;
    }
    static int findMaxLen(String S) {
        // code here
        Stack<Integer> s = new Stack<Integer>();
        
        s.push(-1);
        
        return len(s,S,0);
        
        
        
    }
};
