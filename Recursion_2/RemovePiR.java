package Recursion_2;

public class RemovePiR {

	public static String RemovePi(String str){

		if (str.length()<=1) {
			return str;
		}

		if (str.charAt(0)=='p' && str.charAt(1)=='i') {
			String smallOutput=RemovePi(str.substring(2));
			return "3.14"+smallOutput;
		}else{
			String smallOutput=RemovePi(str.substring(1));
			return str.charAt(0)+smallOutput;
		}

	}

	public static void main(String[] args) {
		String str="Apipiehipi";
		System.out.println(str);

		System.out.println(RemovePi(str));
	}
	
}
