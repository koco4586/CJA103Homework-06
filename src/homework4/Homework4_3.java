package homework4;

public class Homework4_3 {
	public static void main(String[] args) {
		String[] eightPlanets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		char[] vowels = {'a','e','i','o','u'};
		int totalVowels[]=new int[vowels.length];
		for(int i=0;i<eightPlanets.length;i++) {
			String planet = eightPlanets[i];
			int [] numbersofVowels = countVowels(planet,vowels);
			for(int j=0;j<numbersofVowels.length;j++) {
				totalVowels[j]+=numbersofVowels[j];
			}
		}
		for(int i=0;i<vowels.length;i++) {
			System.out.print(vowels[i]+":"+totalVowels[i]+"\t");
		}
		
	}
	public static int[] countVowels (String s, char[] vowels) {
		int countVowels[]=new int[vowels.length];
		for(int i=0;i<s.length();i++) {
			for (int j=0;j<countVowels.length;j++) {
				if (s.charAt(i)==vowels[j]) countVowels[j]+=1;
			}
		}
		return 	countVowels;
	}
}
