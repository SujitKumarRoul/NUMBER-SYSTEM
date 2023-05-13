package Basic;
import java.util.Scanner;
public class Square {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the side of Square=");
	int a=sc.nextInt();
	System.out.println("area is="+(a*a));
	System.out.println("perimeter is="+(4*a));
}
}
