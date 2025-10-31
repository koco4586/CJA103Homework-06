package homework4;

import java.util.ArrayList;

public class Homework4_1 {
	public static void main(String[] args) {
		int array[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		double average = getAverageOfArray(array);
		ArrayList<Integer> elementsGreaterThanAverage = getElementsGreaterThanAverage(array, average);
		System.out.println("AVG=" + average + " 大於平均值的元素" + elementsGreaterThanAverage);
	}

	public static double getAverageOfArray(int array[]) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return ( (double) sum / array.length);
	}

	public static ArrayList<Integer> getElementsGreaterThanAverage(int array[], double avg) {
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] > avg)
				numbers.add(array[i]);
		}
		return numbers;
	}

}
