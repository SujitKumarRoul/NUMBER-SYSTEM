package NumberSystem_2;
import java.util.Scanner;
public class Armstrong {
	static boolean isArmstrong(int n) {
		int sum=0,temp=n;int cd=CountDigit(n);
		while(n>0) {
			int d=n%10;
		sum=sum+pow(d,cd);
		n=n/10;
		}
return sum==temp;
}
	static int CountDigit(int n){
		int count=0;
		while(n>0) {
			n=n/10;
			count++;	
		}
		return count;
	}
	static int pow(int d,int cd) {
		int product=1;
		while(cd>0) {
			product=product*d;
			cd--;
		}
		return product;
	}
	public static void main(String arg[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Number");
	 int n=sc.nextInt();
	 boolean rs=isArmstrong(n);
	 if(rs==true)
		 System.out.println(n+"is Armstrong Number");
	 else
		 System.out.println(n+"is Not Armstrong Number");
	}
}
