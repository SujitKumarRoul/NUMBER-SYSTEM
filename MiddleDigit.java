package Basic;
import java.util.Scanner;
public class MiddleDigit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter Three Digit Value");
	int x=sc.nextInt();
	int y=sc.nextInt();
	int z=sc.nextInt();
	int mi=getmiddlevalue(x,y,z);
	System.out.println("middle no is:"+ mi);
}
	static int getmiddlevalue(int x,int y,int z){
		if(y>x&&x>z||x>y&&x<z)
			return x;
		else if(x>y&&y>z||y>x&&z>y)
			return y;
		else 
		return z;
	}
	 
	

}
