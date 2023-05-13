package Basic;
import java.util.Scanner;
public class Rectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of rectangle=");
		int l=sc.nextInt();
		Scanner st=new Scanner(System.in);
		System.out.println("Enter the bredth of rectangle=");
		int b=st.nextInt();
		System.out.println("Area is:"+(l*b));
		System.out.println("perimeter is:"+(2*(l+b)));
	}

}
