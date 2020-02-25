package Lab4;

import java.util.Scanner;

public class Operators {
	public static void main(String[] args) {
		int n,a,sum=0,d;
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		a=n;
		while (a>0) {
		d=a%10;
		sum=sum+(d*d*d);
		a=a/10;
		}
		System.out.println(sum);
		}
}
