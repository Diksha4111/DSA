package kth_min_max_array;
import java.util.*;

public class getMinMax {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		
		int[] a = {1,6,4,9,3,8};
		int temp;
		
		for(int i=0 ;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("The kth min max are:\n");
		System.out.print("min = "+ a[k-1] + " " + "max =" + a[(a.length)-k]);
	}
}
