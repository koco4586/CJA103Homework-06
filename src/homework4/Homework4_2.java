package homework4;

public class Homework4_2 {
	public static void main(String[] args) {
		String s = "Hello world!";
		System.out.println(reverseString(s));
	}

	public static String reverseString(String s) {
		char reversedChar[] = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			reversedChar[i] = s.charAt(s.length() - i - 1);
		}
		String reversedString = new String(reversedChar);
		return reversedString;
	}

}
