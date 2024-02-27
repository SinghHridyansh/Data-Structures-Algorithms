public class Literals {
    public static void main(String[] args) {
        // int intValue = 26; 
		int intValue =0x1A;
		// Correct representation of an integer
        float floatValue = 3.14_15f; // Correct representation of a floating-point number using 'f' suffix
        double doubleValue = 2.3411e+01; // Correct representation of a double (no suffix needed)
        String stringValue = "WritingCleanerCode"; // Correct representation of a String using double quotes
        
        // Printing each variable on a new line
        System.out.println("int: " + intValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("String: " + stringValue);
    }
}
