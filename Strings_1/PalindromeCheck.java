package Strings_1;

public class PalindromeCheck {

	public static boolean CheckPal(String str){
		String pal="";
		for (int i = str.length()-1; i >=0; i--) {
			pal=pal+str.charAt(i);
		}

		if (pal.equals(str)) {
			System.out.println(true);
			return true;
		}else{
			System.out.println(false);
			return false;
		}
	}
	public static void main(String[] args) {
		String str="malayalam";

		CheckPal(str);

	}
}
