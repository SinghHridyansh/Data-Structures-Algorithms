package Recursion_1;

public class CheckPalindromeR {
	
	public static boolean checkPal(String str,int si,int ei){
		if (str.length()==0 || str.length()==1) {
			return true;
		}
		if (si ==ei || ei-si==1) {
			return true;
		}

		if (str.charAt(si)!=str.charAt(ei)) {
			return false;
		}

		return checkPal(str, si+1, ei-1);
	}

	public static void main(String[] args) {
		//String str="malayalam";
		String str="sucuhhucus";
		int si=0;
		int ei=str.length()-1;
		//System.out.println(str.charAt(1));
		System.out.println(checkPal(str, si, ei));
		//System.out.println(str.charAt(si)==str.charAt(6)); 
	}
}

// sucuhhucus