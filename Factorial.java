package NumberSystem_1;
import java.util.Scanner;
public class Factorial {
	static int getFact(int n)
	{
		int fact=1;
		while(n>1)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number=");
		int n=sc.nextInt();
		int rs=getFact(n);
		System.out.println("The Factorial is "+rs);
		
	}

}
