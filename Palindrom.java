package NumberSystem_2;
import java.util.Scanner;
public class Palindrom {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number:");
	int k=sc.nextInt();
	boolean i=ispalindrom(k);
	System.out.println(i);
	int n=nextpalindrom(k);
	System.out.println(n);
}
static boolean ispalindrom(int k) {
	int temp=k,rev=0;
	while(k>0) {
		int d=k%10;
		rev=rev*10+d;
		k=k/10;
	}
	return rev==temp;
}
static int nextpalindrom(int k) {
	int temp=++k;
	while(true){
		int rev=0;
		while(k>0) {
		int d=k%10;
		rev=rev*10+d;
		k=k/10;
		if(temp==rev)
			return temp;
		}
		k=++temp;
		
	}
}
}
