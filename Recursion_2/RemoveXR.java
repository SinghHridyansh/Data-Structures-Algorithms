package Recursion_2;

public class RemoveXR {
	
	public static String RemoveX(String str){
		if (str.length()==0) {
			return str;
		}

		String outputString=RemoveX(str.substring(1));

		if (str.charAt(0)=='x' || str.charAt(0)=='X') {
			return outputString;
		} else {
			return str.charAt(0)+outputString;
		}
	}
	public static void main(String[] args) {
		String str="Hxrxixdxyxaxnxsxhx";
		System.out.println(str);

		System.out.println(RemoveX(str));
	}
}
