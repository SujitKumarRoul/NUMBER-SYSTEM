package NumberSystem_2;
import java.util.Scanner;
public class PrimeNumber {
	static boolean checkprime(int n) 
	{
		for(int i=2;i<=n/2;i++)
		{
		if(n%i==0)
	
		return false;
	}

		return true;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number=");
	int n=sc.nextInt();
	boolean rs=checkprime(n);
	System.out.println(n+" is prime number." );


}
}
