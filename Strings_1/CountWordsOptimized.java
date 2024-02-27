package Strings_1;

public class CountWordsOptimized {
	public static int WordCount(String str){


		String arr[]=str.split(" ");

		int count = arr.length;

		return count;

	}
	public static void main(String[] args) {
		String str="An apple a day, keeps the doctor away.";

		int words=WordCount(str);
		System.out.println("Number of words in this sentence is: ");
		System.out.println(words);
	}
}
