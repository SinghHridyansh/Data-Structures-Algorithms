package Recursion_2;

public class KeyPad_String {
	

	public static void keypad(int n){
		String Options[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    String Output[] = new String[1000]; 
    int count = keypadHelper(n, Options, Output);
    
    
    String finalOutput[] = new String[count];
    for (int i = 0; i < count; i++) {
        finalOutput[i] = Output[i];
    }
for (String string : finalOutput) {
	System.out.println(string);
}
    //return finalOutput;
	}

	public static int keypadHelper(int n, String Options[],String Output[]){

		if (n == 0) {
			Output[0] = "";
			return 1;
		}
	
		int lastDigit = n % 10;
		int smallNum = n / 10;
		String smallOutput[] = new String[1000]; 
	
		int smallCount = keypadHelper(smallNum, Options, smallOutput);
	
		int idx = 0;
		for (int i = 0; i < Options[lastDigit].length(); i++) {
			for (int j = 0; j < smallCount; j++) {
				Output[idx] = smallOutput[j] + Options[lastDigit].charAt(i);
				idx += 1;
			}
		}
	
		return idx;

	}

	public static void main(String[] args) {
		//String output[] = keypad(23);
		// for(int i = 0; i < output.length; i++) {
		// 	System.out.println(output[i]);
		// }

		keypad(23);
	}
}
