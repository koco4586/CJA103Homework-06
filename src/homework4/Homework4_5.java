package homework4;

import java.util.Scanner;

public class Homework4_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int daysInMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int date[] = new int[3];
		while (true) {
			System.out.println("輸入三個整數:yyyy mm dd");
			for (int i = 0; i <= 2; i++) {
				date[i] = scanner.nextInt();
			}
			checkLeapYear(date,daysInMonth);
			if (isValidDate(date, daysInMonth)) {
				break;
			} else {
				System.out.println("輸入有誤! 請重新輸入!");
			}
		}
		scanner.close();
		int totalDay=date[2];
		for (int i=0; i<date[1]-1;i++) {
			totalDay+=daysInMonth[i];
		}
		System.out.println("輸入的日期為該年的第"+totalDay+"天");
	}

	public static boolean isValidDate(int date[], int daysInMonth[]) {
		if (date[0] < 0) {
			return false;
		} else if (date[1] < 1 || date[1] > 12) {
			return false;
		} else if (date[2] < 1 || date[2] > daysInMonth[date[1]-1]) {
			return false;
		} else {
			return true;
		}
	}

	public static void checkLeapYear(int date[], int daysInMonth[]) {
		if ((date[0] % 4 == 0 && date[0] % 100 != 0) || date[0] % 400 == 0) {
			daysInMonth[1] = 29;
		} else {
			daysInMonth[1] = 28;
		}
	}
}
