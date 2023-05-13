package NumberSystem_2;
import java.util.Scanner;
public class SpecialTwoDigitNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Digit No");
		int x=sc.nextInt();
		int d1=x/10;
		int d2=x%10;
		int sum=d1+d2+d1*d2;
		if(sum==x)
			System.out.println(x+ "=Special Two Digit No");
		else
			System.out.println(x+ "=Not Special Two Digit No");
	}
}
