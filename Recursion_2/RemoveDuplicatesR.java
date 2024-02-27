package Recursion_2;

public class RemoveDuplicatesR {
	
	public static String RemoveRepeating(String str){

		if (str.length()<=1) {
			return str;
		}
		if (str.charAt(0)==str.charAt(1)) {
			return RemoveRepeating(str.substring(1));
		}else{
			return str.charAt(0)+RemoveRepeating(str.substring(1));
		}

	}

	public static void main(String[] args) {
		String sre="xxxyyyzwwzzz";

		System.out.println(RemoveRepeating(sre));
	}
}
