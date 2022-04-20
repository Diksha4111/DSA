//gfg problem

class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    // Your code goes here
	    int[] arr2 = new int[n]; 
	    int k=0;
	    for(int i=0 ; i<n ;i++){
	        int j=i+1;
	        for(j=i+1 ; j<n ; j++){
	            if(arr[i]>arr[j]){
	                arr2[k] = arr[j];
	                k++;
	                break;
	            }
	        }
	        if(j==n){
	            arr2[k] =-1;
	            k++;
	        }
	    }
	    return arr2;
	}
}
