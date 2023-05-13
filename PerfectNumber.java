package NumberSystem_2;
import java.util.Scanner;

public class PerfectNumber {
	static boolean IsPerfect(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0)
				sum = sum + i;
		}
		return sum == n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter The Number");
			int n = sc.nextInt();
			boolean rs = IsPerfect(n);
			if (rs == true)
				System.out.println(n + " is Perfect Number");
			else
				System.out.println(n + " is Not Perfect Number");
			
			System.out.println("want to check more Number ?");
			String res=sc.next();
			if(res.equalsIgnoreCase("no")) {
				System.out.println("Program finished ");
				break;
			}
				
			
		}
		
	}
}
