package Basic;
import java.util.Scanner;
public class BiggestInTwoDigit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Two Digit Value");
	int x=sc.nextInt();
	int y=sc.nextInt();
	if(x>y)
		System.out.println(x+ "is the Biggest");
	if(x<y)
	System.out.println(y+ "is the Biggest");
}

}
