package Strings_1;

public class StringReverse {

	public static String stringReverse(char[] arr) {
	
		String str= new String(arr);
		//System.out.println(str);
		int len=str.length();
		String reverse="";

		for (int i = len-1; i >=0; i--) {
			reverse=reverse+str.charAt(i);   
		}

		return reverse;
	  }
	public static void main(String[] args) {
		//String str="malayalam";
		char ch[]={'h','e','l','l','o'};
		String str= new String(ch);
		System.out.println("Default string is : "+str);
		System.out.println("Reverse of the default string is: ");
		System.out.println(stringReverse(ch));
		
	}
}
