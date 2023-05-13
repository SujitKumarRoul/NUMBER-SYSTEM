package NumberSystem_1;
import java.util.Scanner;
public class SumOfBigSmallDigitOfNumber
{public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println(SumOfBigSmallDigit(n));
}

static int SumOfBigSmallDigit(int n)
{
	int temp=n , big=n%10;
	n=n/10;
	while(n>0) {
		int r=n%10;
		if(big<r) 
			big=r;
		n=n/10;
	}
	n=temp;

	int small=n%10;
	n=n/10;
	while(n>0) {
		int r=n%10;
		if(small>r)
			small=r;
		n=n/10;
	}
	int sum=small+big;
	return sum;
}

}

