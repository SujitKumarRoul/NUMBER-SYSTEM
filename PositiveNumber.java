package Basic;
import java.util.Scanner;
public class PositiveNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int x=sc.nextInt();
		if(x<0)
			x=x*-1;
		System.out.println("Enter The Integer Number"+x);
	}

}
