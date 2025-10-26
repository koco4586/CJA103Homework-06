package homework3;

import java.util.Scanner;
import java.util.ArrayList;

public class Homework3_3 {
	public static void main(String[] args) {
		int picknumbers = 6;
		Scanner scanner = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字?(1~9)");
		int dislikeNumber = scanner.nextInt();
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 1; i <= 49; i++) {
			numbers.add(i);
		}
		scanner.close();
		removeDislikeNumber(numbers, dislikeNumber);
		printArrayList(numbers);
		pickRandomNumber(numbers, picknumbers);

	}

	public static void removeDislikeNumber(ArrayList<Integer> number, int dislikeNumber) {
		for (int i = 1; i <= 49; i++) {
			if (i / 10 == dislikeNumber || i % 10 == dislikeNumber) {
				number.remove(Integer.valueOf(i));
			}
		}
	}

	public static void printArrayList(ArrayList<Integer> number) {
		for (int i = 0; i < number.size(); i++) {
			System.out.print(number.get(i) + "\t");
			if ((i + 1) % 6 == 0)
				System.out.println(); // 為了排版好看
		}
		System.out.println("總共有" + number.size() + "數字可以選");

	}

	public static void pickRandomNumber(ArrayList<Integer> number, int picknumbers) {
		ArrayList<Integer> copyNumber = new ArrayList<>(number);
		System.out.println("隨機的六個數是:");
		for (int i = 0; i < picknumbers; i++) {
			int randomIndex= (int) (Math.random()*(copyNumber.size()));
			System.out.print(copyNumber.get(randomIndex)+"\t");
			copyNumber.remove(randomIndex);
			
		}

	}
}
