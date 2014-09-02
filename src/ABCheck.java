
public class ABCheck {

	public static void main(String[] args) {

		checkString("");
		checkString("abc");
		checkString("a123b");
		checkString("b123a");
		checkString("lane borrowed");
		checkString("after badly");
		checkString("Laura sobs");

	}

	/**
	 * Prints the given string and its ABCheck() result.
	 * <p>
	 * Example:<br>
	 * Input = "after badly" Output = "false"
	 * 
	 * @param str the string to be checked and printed
	 */
	private static void checkString(String str) {

		System.out.println("Input = \"" + str + "\" Output = \"" + abCheck(str) + "\"");

	}

	/**
	 * Checks if the characters a and b are separated by exactly 3 places
	 * anywhere in the string at least once in any order.
	 * 
	 * @param str the string to check
	 * @return
	 */
	private static boolean abCheck(String str) {

		return characterCheck(str, 'a', 'b') || characterCheck(str, 'b', 'a');

	}

	/**
	 * Checks if two characters
	 * are separated by exactly 3 places anywhere in the string at least once in the given order.
	 * 
	 * @param str the string to be checked
	 * @param ch1 the first character
	 * @param ch2 the second character
	 * @return true if the two chars are separated by 3 places anywhere in the same order
	 */
	private static boolean characterCheck(String str, char ch1, char ch2) {

		for (int i=0; i < str.length(); i++) {
			if (str.charAt(i) == ch1) {
				// every time a match is found,
				// check for the other character after 4 places
				if (checkBounds(str, i + 4) && str.charAt(i + 4) == ch2) {
					return true;
				}
			}
		}

		return false;

	}
	
	/**
	 * Checks if a position exists in a String.
	 * <br>
	 * Helps avoid out-of-bounds problems.
	 * 
	 * @param str the string
	 * @param position the position
	 * @return
	 */
	private static boolean checkBounds(String str, int position) {

		return str.length() > position;

	}

}
