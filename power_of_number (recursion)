//gfg practice problem

class Solution
{
        
    long power(int N,int R)
    {
        //Your code here
        long ans = 1;
        if(R==0){
           return 1;
        }
        else if(R==1){
           return N % 1000000007;
        }
        long x = power(N,R/2);
        if(R%2==0){
            ans = ans * (( x * x )) % 1000000007;
            //return ans;
        }
        else{
            ans = ((ans * N )%1000000007) * (( x * x ) % 1000000007);
            //return ans;
        }
        
        ans = ans % 1000000007;
        return ans;
    }

}
