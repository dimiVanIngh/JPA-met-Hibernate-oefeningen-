package be.vdab.util;

public class Validator {
	
	public static boolean isAlphaNumeric(String input) {
		boolean valid = true;
		if (input == null) {
			valid = false;
		}
		if (input.isEmpty()) {
			valid = false;
		} else {
			char[] charArray = input.toCharArray();
			for (int i = 0; i < charArray.length && valid; i++) {
				if (!Character.isLetterOrDigit(charArray[i])) {
					valid = false;
				}
			}
		}
		return valid;
	}

	public static boolean isMaxLenth(String input, int length) {
		return (input.length() <= length);
	}

	public static boolean isMinLenth(String input, int length) {
		return (input.length() >= length);
	}

	public static boolean isInteger(String input) {
		boolean valid = true;
		if (input == null) {
			valid = false;
		}
		if (input.isEmpty()) {
			valid = false;
		} else {
			char[] charArray = input.toCharArray();
			for (int i = 0; i < charArray.length && valid; i++) {
				if (!Character.isDigit(charArray[i])) {
					valid = false;
				}
			}
		}
		return valid;
	}
}
