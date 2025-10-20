package homework1;

public class Homework1_5 {
	public static void main(String[] args) {
		int currentMoney=1500000;
		double ratio=0.02;
		System.out.println("本利和:"+Math.round(currentMoney*Math.pow(1+ratio,10)));
		
	}
	

}
