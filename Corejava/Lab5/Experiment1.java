package Lab5;

import java.util.Scanner;

public class Experiment1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		if(str.equals("red"))
		System.out.println("STOP");
		else if(str.equals("yellow"))
		System.out.println("READY");
		else if(str.equals("green"))
		System.out.println("GO");
		else
		System.out.println(" ");
		}
}
