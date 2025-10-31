package homework4;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework4_4 {
	public static void main(String[] args) {
		int[][] coworkerAndTheirMoney = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		System.out.println("你要借多少錢?");
		Scanner scanner = new Scanner(System.in);
		int borrowAmount = scanner.nextInt();
		scanner.close();
		ArrayList<Integer> coworkerToLendMoney = findCoworkerToLendMoney(coworkerAndTheirMoney, borrowAmount);
		printCoworkerToLendMoney(coworkerToLendMoney);

	}

	public static ArrayList<Integer> findCoworkerToLendMoney(int[][] coworkerAndTheirMoney, int borrowAmount) {
		ArrayList<Integer> coworkerToLendMoney = new ArrayList<>();
		for (int i = 0; i < coworkerAndTheirMoney.length; i++) {
			if (borrowAmount <= coworkerAndTheirMoney[i][1]) {
				coworkerToLendMoney.add(coworkerAndTheirMoney[i][0]);
			}
		}
		return coworkerToLendMoney;
	}

	public static void printCoworkerToLendMoney(ArrayList<Integer> coworkerToLendMoney) {
		if (coworkerToLendMoney.size() > 0) {
			System.out.print("有錢可以借的員工編號:");
			for (int i = 0; i < coworkerToLendMoney.size(); i++) {
				System.out.print(coworkerToLendMoney.get(i) + " ");
			}
			System.out.print("共" + coworkerToLendMoney.size() + "人!");
		} else {
			System.out.println("沒有人能借你錢");
		}
	}
}
