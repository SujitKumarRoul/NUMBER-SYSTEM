package NumberSystem_1;
import java.util.Scanner;
public class SumOfEvenDigitOfNumber {
	static int SumOfEvenDigit(int n) {
		int digit, sum=0;
			while(n>0) {
				
				digit=n%10;
				if(digit%2==0)
				sum=sum+digit;
				n=n/10;
			}
			return sum;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number=");
		int n=sc.nextInt();
		int rs=SumOfEvenDigit(n);
		System.out.println("Sum of Even Digit "+rs);
		
	}

}
