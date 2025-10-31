package homework4;

public class Homework4_6 {
	public static void main(String[] args) {
		int[][] studentsAndTheirScore = { { 10, 37, 100, 77, 98, 90 }, { 35, 75, 70, 95, 70, 80 },
				{ 40, 77, 79, 70, 89, 100 }, { 100, 89, 90, 89, 90, 75 }, { 90, 64, 75, 60, 75, 50 },
				{ 85, 75, 70, 75, 90, 20 }, { 75, 70, 79, 85, 89, 99 }, { 70, 95, 90, 89, 90, 75 } };
		int[] highestGradeInTest = new int[6];
		int[] highestGradeCounter = new int[8];
		findHighestGrade(studentsAndTheirScore, highestGradeInTest);
		findHighestGradeCounter(studentsAndTheirScore, highestGradeInTest, highestGradeCounter);
		printHighestGradeTimes(highestGradeCounter);
	}

	public static void findHighestGrade(int[][] studentsAndTheirScore, int[] highestGradeInTest) {
		for (int i = 0; i < highestGradeInTest.length; i++) {
			for (int j = 0; j < studentsAndTheirScore.length; j++) {
				highestGradeInTest[i] = Math.max(highestGradeInTest[i], studentsAndTheirScore[j][i]);
			}
		}
	}

	public static void findHighestGradeCounter(int[][] studentsAndTheirScore, int[] highestGradeInTest,
			int[] highestGradeCounter) {
		for (int i = 0; i < highestGradeInTest.length; i++) {
			for (int j = 0; j < studentsAndTheirScore.length; j++) {
				if (studentsAndTheirScore[j][i] == highestGradeInTest[i]) {
					highestGradeCounter[j] += 1;
				}
			}
		}
	}

	public static void printHighestGradeTimes(int[] highestGradeCounter) {
		for (int i = 0; i < highestGradeCounter.length; i++) {
			System.out.println("第" + (i + 1) + "號同學拿了" + highestGradeCounter[i] + "次最高分");
		}
	}
}
