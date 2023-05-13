package NumberSystem_2;
import java.util.Scanner;
public class SpyNumber {
	static boolean SpyDigit(int n) {
		int digit,sum=0,prod=1, temp=n;
		while(n>0) {
		 digit=n%10;
		sum=sum+digit;
		n=n/10;
		}
		while(temp>0) {
			 int digit1=temp%10;
			 prod=prod*digit1;
			 temp=temp/10;
			 }
		return (prod==sum);
	}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
	int n=sc.nextInt();
	boolean rs=SpyDigit(n);
	if(rs)
	System.out.println("The Number Is Spy");
	else
		System.out.println("Not a spy no.");
}
}
