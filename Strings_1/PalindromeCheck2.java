package Strings_1;

// Two Pointer Approach

public class PalindromeCheck2 {
	public static boolean CheckPal(String str){
		int l=0;
		int r=str.length()-1;

		while (l<r) {
			if (str.charAt(l)!=str.charAt(r)) {
				System.out.println("false");
				return false;
			}
			l++;
			r--;
		}
		System.out.println("true");
		return true;
	}
	public static void main(String[] args) {
		String str="malayalam";

		CheckPal(str);

	}
}
