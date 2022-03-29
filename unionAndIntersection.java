package union_and_intersection_arrays;

public class unionAndIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4};
		int[] b = {3,4,5,6};
		int i=0,j=0;
		
		//union
		System.out.print("Union is:\n");
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				System.out.print(a[i]+" ");
				i++;
			}
			else if(b[j]>a[i]) {
				System.out.print(b[j]+" ");
				j++;
			}
			else {
				System.out.print(b[j]+" ");
				j++;
				i++;
			}
		}
		
		while(i<a.length) {
			System.out.print(a[i]+" ");
			i++;
		}
		while(j<b.length) {
			System.out.print(b[j]+" ");
			j++;
		}
		
		//intersection
		int m=0,n=0;
		System.out.print("\nIntersention is:\n");
		while(m<a.length && n<b.length) {
			if(a[m]<b[n]) {
				m++;
			}
			else if(b[n]>a[m]) {
				n++;
			}
			else {
				System.out.print(b[n]+" ");
				n++;
				m++;
			}
		}
	}
}
