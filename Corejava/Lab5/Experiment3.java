package Lab5;

import java.util.Scanner;

public class Experiment3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n,c=0,k=0;
		n=sc.nextInt();
		int[] a=new int[10];
		for (int i = 2; i <= n; i++) {
		c=0;
		for (int j = 1; j <=i ; j++) {
		if(i%j==0)
		c++;
		}
		if(c==2) {
		a[k++]=i;
		}
		}
		for (int i = 0; i < k; i++) {
		System.out.print(a[i]+" ");
		}
		}

}
