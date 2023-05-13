package Basic;
import java.util.Scanner;
public class BiggestInThreeDigit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Three Digit Value");
	int x=sc.nextInt();
	int y=sc.nextInt();
	int z=sc.nextInt();
	int big=x;
	if(big<y)
		big=y;
	if(big<z)
		big=z;
	System.out.println("Biggest No Is "+big);
}
}
