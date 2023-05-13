package NumberSystem_2;
import java.util.Scanner;
public class XylemorPhloem {
	static String Check(int x) {
		int os=0,ms=0;
		os=x%10;
		x=x/10;
		while(x>9) {
			ms=ms+x%10;
			x=x/10;
		}
		os=os+x;
		if(os==ms)
			return "Xylem";
		else
			return"Phloem";
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int x=sc.nextInt();
	String rs=Check(x);
	System.out.println(x+" is a "+rs+" Number");
}
}
