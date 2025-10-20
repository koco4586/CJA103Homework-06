package homework2;

public class Homework2_5 {
	public static void main(String[] args) {
		int total = 0;
		System.out.print("可選擇的數字:");
		for (int i = 1; i <= 49; i++) {
			int tens = i / 10, ones = i % 10;
			if (tens == 4 || ones == 4)
				continue;
			System.out.print(i + " ");
			total += 1;
		}

		System.out.println("總共可選擇的數字有" + total + "個");
	}
}
