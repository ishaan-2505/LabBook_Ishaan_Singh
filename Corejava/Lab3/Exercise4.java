package Lab3;

import java.util.Scanner;

public class Exercise4 {
	static int n=0;
	public static void main(String[] args) {
	int[] a=new int[100];
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for (int i = 0; i < n; i++) {
	a[i]=sc.nextInt();
	}
	getSorted(a);
	}
	public static int getSorted(int a[]) {
	int rev=0,d,t;
	for (int i = 0; i < n; i++) {
	t=a[i];
	rev=0;
	while(t>0) {
	d=t%10;
	rev=rev*10+d;
	t=t/10;
	}
	a[i]=rev;
	}
	for (int i = 0; i < n; i++) {
	for (int j = i; j < n; j++) {
	if(a[i]>a[j]) {
	t=a[i];
	a[i]=a[j];
	a[j]=t;
	}
	}
	}
	for (int i = 0; i < n; i++) {
	System.out.print(a[i]+" ");
	}
	return 0;
	}
}
