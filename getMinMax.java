package max_min_array;

public class getMinMax {
	public static void main(String[] args) {
		int[] a = {3,5,0,1,7};
		int temp;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.print("min = " + a[0] + " " + "max = " + a[(a.length)-1]);
	}
}

