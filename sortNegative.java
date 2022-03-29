package negatives_to_one_side;

public class sortNegative {
	public static void main(String[] args) {
		int[] a = {-1,0,5,-2,-4,3};
		int low = 0,mid = 0, high = a.length-1;
		
		while(mid<=high) {
			if(a[mid]<0) {
				int temp = a[mid];
				a[mid] = a[low];
				a[low] = temp;
				mid++;
				low++;
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
