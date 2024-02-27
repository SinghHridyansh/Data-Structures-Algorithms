package Recursion_2;

public class ReplaceChrR {

	public static String ReplaceIt(String str,char a,char b){

		if (str.length()==0) {
			return str;
		}

		String smalloutput=ReplaceIt(str.substring(1), a, b);

		if (str.charAt(0)==a) {
			return b+smalloutput; 
		} else {
			return str.charAt(0)+smalloutput;
		}

		

	}
	public static void main(String[] args) {
		String str="Moradabad";
		System.out.println(str);

		char a='a';
		char b='u';

		System.out.println(ReplaceIt(str, a, b));
	}
	
}
