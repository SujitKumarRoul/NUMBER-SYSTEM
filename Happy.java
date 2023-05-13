package NumberSystem_2;
import java.util.Scanner;
public class Happy {
	static boolean ishappy(int n) {
		while (n > 9) {   // Loop is Continue till Double Digit
			int sum = 0;
			while (n > 0) {
				int d = n % 10;
				sum = sum + d * d;
				n = n / 10;
			}
			n = sum;//Store the Value Of Sum In N To continue the loop
		}
		return n == 1 || n == 7;//23,28
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		boolean rs = ishappy(n);
		if (rs == true)
			System.out.println(n + "is a Happy Number");
		else
			System.out.println(n + "is not a Happy Number");
	}

		}
