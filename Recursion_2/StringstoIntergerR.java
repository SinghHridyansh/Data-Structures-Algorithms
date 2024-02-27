package Recursion_2;

public class StringstoIntergerR {
	
	public static int convertStringToInt(String str){

		if (str.length()==1) {
			return 0;
		}
		
		
		int digit= str.charAt(0)-'0';
		int power = str.length()-1;

		return digit*(int)Math.pow(10, power)+convertStringToInt(str.substring(1));

	}

	public static void main(String[] args) {
		String str="12567";

		int num=convertStringToInt(str);
		System.out.println(num);
	}
}
