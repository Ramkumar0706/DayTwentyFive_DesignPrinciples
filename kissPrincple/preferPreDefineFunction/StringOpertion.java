package kissPrincple.preferPreDefineFunction;

public class StringOpertion {
	
	// Not simple: Custom implementation of string reversal
	public String reverseString(String input) {
	    char[] chars = input.toCharArray();
	    StringBuilder reversed = new StringBuilder();
	    for (int i = chars.length - 1; i >= 0; i--) {
	        reversed.append(chars[i]);
	    }
	    return reversed.toString();
	}

	// KISS: Using built-in function
	public String reverseStringkissPrincple(String input) {
	    return new StringBuilder(input).reverse().toString();
	}


}
