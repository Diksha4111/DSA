//gfg problem

class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        String ans = "";
        char[] a = A.toCharArray();
        Queue<Character> q = new LinkedList<Character>();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        
        for(int i=0;i<a.length;i++){
            
            map.put(a[i],map.getOrDefault(a[i],0)+1);
            if(map.get(a[i])==1){
                q.offer(a[i]);
            }
            
            while(!q.isEmpty()){
                if(map.get(q.peek()) == 1){
                    break;
                }
                else{
                    q.poll();
                }
            }
            
            if(q.isEmpty()){
                ans = ans+"#";
            }
            else{
                ans = ans+q.peek().toString();
            }
        }
        return ans;
    }
}
