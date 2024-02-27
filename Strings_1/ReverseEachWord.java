package Strings_1;

public class ReverseEachWord {

	public static String ReverseWord(String str){

		//String str= new String(arr);
		//System.out.println(str);
		int len=str.length();
		String reverse="";

		for (int i = len-1; i >=0; i--) {
			reverse=reverse+str.charAt(i);   
		}

		return reverse;

	}
	public static void ReverseEword(String str){

		String arr[]=str.split(" ");

		String ReversedSentence="";

		for (String string : arr) {
			ReversedSentence+=ReverseWord(string)+" ";
		}

		ReversedSentence.trim();

		System.out.println(ReversedSentence);

		// for (String string : arr) {
		// 	System.out.println(string);
		// }

	}
	public static void main(String[] args) {
		String str="LET US CODE";

		ReverseEword(str);
	}
}
