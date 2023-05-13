package NumberSystem_1;
import java.util.Scanner;
public class CountDigit {
	static int Count(int n) {
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
			}
			return count;
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number=");
	int n=sc.nextInt();
	int c=Count(n);
	System.out.println("No of Digit "+c);
}
}