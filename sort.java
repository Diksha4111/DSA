package Sorting_without_sorting;

public class sort {
	public static void main(String[] args) {
		int[] a = {0,1,2,2,1,0};
		int low =0 , mid = 0 , high = (a.length)-1  ;
		
		while(mid<=high) {
			if(a[mid] == 0) {
				int temp = a[mid];
				a[mid] = a[low];
				a[low] = temp;
				mid++;
				low++;
			}
			else if(a[mid] == 1){
				mid++;
			}
			else {
				int temp = a[mid];
				a[mid] = a[high];
				a[high] = temp;
				high--;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
	}
}
