package NumberSystem_2;
import java.util.Scanner;

public class StrongNumber {
	static boolean IsStrong(int n) {
		int sum=0,temp=n;
		while(n>0) {
			int d=n%10;
			sum=sum+fact(d);
			n=n/10;
		}
		return (sum==temp);
	}
	static int fact(int d) {
		if (d == 1)
			return 1;

		return d * fact(d - 1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		boolean rs = IsStrong(n);
		if(rs=true)
		System.out.println(rs+" is a Strong Number");
		else
			System.out.println(rs+" is not a Strong Number");
		
	}
}
