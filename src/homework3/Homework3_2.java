package homework3;
import java.util.Scanner;
public class Homework3_2 {
	public static void main(String[] args) {
		int answer = (int) (Math.random() * 101);
		System.out.println("開始猜數字吧!(0~100)");
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int myAnswer = scanner.nextInt();
			if (myAnswer == answer) {
				System.out.println("猜對了 答案就是" + answer);
				break;
			} else if (myAnswer > answer) {
				System.out.println("猜錯囉 答案比較小");
			} else {
				System.out.println("猜錯囉 答案比較大");
			}
		}
		scanner.close();
	}
}
