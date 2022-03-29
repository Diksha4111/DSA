package reverse_array;

public class rev_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4};
		int[] b = new int[a.length];
		int j = a.length; 
		
		for(int i=0 ; i< a.length ; i++) {
			
			b[j-1] = a[i];
			j = j-1;
		}
		
		for(int k=0 ; k< a.length ;k++) {
			System.out.print(b[k]);
		}
	}

}
