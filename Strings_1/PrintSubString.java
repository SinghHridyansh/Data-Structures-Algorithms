package Strings_1;

public class PrintSubString {

	public static void printSubStrings(String str){
		int len=str.length();

		 for (int i = 0; i <= len-1; i++) {
			for (int j = i; j <=len-1 ; j++) {
				//System.out.print("*");
				System.out.print(str.substring(i, j+1)+" ");
			}
			//System.out.println();
		 }
	}
	public static void main(String[] args) {
		String str="pqrs";

		printSubStrings(str);
	}
}
