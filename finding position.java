//gfg problem

class Solution {
    static long nthPosition(long n){
        // code here
        return findEven(1,n);
    }
    static long findEven(long index,long n){
        if(index>n){
            index = index / 2;
            return index;
        }
        else{
            index = index * 2;
            return findEven(index,n);
        }
    }
