//gfg practise problem

class Solution{
    
    static ArrayList<Integer> subarraySum(int arr[],int n,int s){
        ArrayList<Integer> a = new ArrayList<Integer>();
        int currSum = arr[0];
        int i = 0,j;
        for(j=1;j<=n;j++){
                while(currSum>s && i<j-1){
                    currSum -=arr[i];
                    i++;
                }
                /*else if(currSum>s){
                    currSum -= arr[i] ;
                    i++;
                }*/
                if(currSum==s){
                    a.add(i+1);
                    a.add(j);
                    break;
                }
                if(j<n){
                    currSum += arr[j];
                }
        }
        if(a.isEmpty()){
                    a.add(-1);
                    return a;
                }
                else{
                    return a;
                }
    }
}
