package NumberSystem_1;
import java.util.Scanner;
public class SumOfNatural {
	static int sumofnatural(int x) {
		int sum=0;
		while(x>0) {
			sum=sum+x;
			x--;
		}
		return sum;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Natural Number=");
	int x=sc.nextInt();
	int rs=sumofnatural(x);
	System.out.println("Sum of Natural no "+rs);
}
}
