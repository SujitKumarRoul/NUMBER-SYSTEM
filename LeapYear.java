package NumberSystem_1;
import java.util.Scanner;
public class LeapYear {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the year:");
	int y=sc.nextInt();
	if(y%4==0&&y%100!=0||y%400==0);
	System.out.println(y+"is aLeap Year");
		System.out.println(y+"is not Leap year");
}
}
