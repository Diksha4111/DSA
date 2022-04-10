package palindrome_string;

public class checkPalindrome {
	public static void main(String[] args) {
		String s = "ntin";
		int i=0,j=s.length()-1;
		boolean check = true;
		while(i<s.length()-1) {
			
			if(s.charAt(i)!=s.charAt(j)) {
				 
				check = false;
				break;	
			}
			i++;
			j--;
		}
		if(check == true) {
			System.out.print("is palindrome");
		}
		else {
			System.out.print("is not palindrome");

		}
	}
}

