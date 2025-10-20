package homework2;

public class Homework2_7 {
	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) ('A' + i - 1));
			}
			System.out.println();
		}
	}
}
