//gfg problem

class Solution{
    static List<Integer> pattern(int N){
        // code here
        ArrayList<Integer> l = new ArrayList<Integer>();
        return move(N,l);
    }
    
    static List<Integer> move(int N,ArrayList<Integer> l){
        if(N<=0){
            l.add(N);
            return l;
        }
        l.add(N);
        move(N-5,l);
        l.add(N);
        return l;
        
        //moving and returning the same way..
    }
}
