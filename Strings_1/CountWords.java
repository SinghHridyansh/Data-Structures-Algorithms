package Strings_1;
//import java.lang.*;

public class CountWords {
	public static int WordCount(String str){

		int count=0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)==' ') {
				count++;
			}
		}

		return count+1;

	}
	public static void main(String[] args) {
		String str="An apple a day, keeps the doctor away.";

		int words=WordCount(str);
		System.out.println("Number of words in this sentence is: ");
		System.out.println(words);
	}
}
