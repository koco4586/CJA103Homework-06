package homework3;
import java.util.Scanner;
import java.util.Arrays;
public class Homework3_1 {
	public static void main(String args[]) {
		int x[] =new int [3];
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入三個整數");
		for (int i=0;i<3;i++) {
			x[i]=scanner.nextInt();
		}
		Arrays.sort(x);
		if(x[0]+x[1]>x[2]&&x[0]>0) {
			if(x[0]==x[1]&&x[1]==x[2]) System.out.println("正三角形");
			else if(x[0]*x[0]+x[1]*x[1]==x[2]*x[2]) System.out.println("直角三角形");
			else if(x[0]==x[1] ||x[1]==x[2]) System.out.println("等腰三角形");
			else System.out.println("其他三角形");
		}
		else System.out.println("不是三角形");
		scanner.close();
	}	
	
}
