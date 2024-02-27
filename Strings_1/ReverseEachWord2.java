package Strings_1;

public class ReverseEachWord2 {

	public static String ReverseWord(String str,int start,int end){
		//int len=str.length();
		String reverse="";

		for (int i = end; i >=start; i--) {
			reverse=reverse+str.charAt(i);   
		}

		return reverse;

	}
	public static void ReverseEword(String str){


		String finalString="";
		int start=0;

		for (int i = 0; i <= str.length()-1; i++) {
			if (str.charAt(i)==' ') {
				int end=i-1;

				String reverseWord=ReverseWord(str, start, end);
				finalString+=reverseWord+" ";
				start=i+1;
			}
		}

		
			String reverseWord=ReverseWord(str, start, str.length()-1);
				finalString+=reverseWord+" ";
		

		System.out.print(finalString);

	}
	public static void main(String[] args) {
		String str="What is up youtube ?";

		ReverseEword(str);
	}
}
